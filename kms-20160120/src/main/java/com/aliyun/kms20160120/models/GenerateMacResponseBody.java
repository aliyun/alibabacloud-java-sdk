// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GenerateMacResponseBody extends TeaModel {
    /**
     * <p>The algorithm that is used to generate the message authentication code. Valid values vary based on the key specification:  </p>
     * <ul>
     * <li><p>HMAC_SM3</p>
     * </li>
     * <li><p>HMAC_SHA_224</p>
     * </li>
     * <li><p>HMAC_SHA_256</p>
     * </li>
     * <li><p>HMAC_SHA_384</p>
     * </li>
     * <li><p>HMAC_SHA_512</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HMAC_SHA_256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The globally unique identifier of the customer master key (CMK).</p>
     * <blockquote>
     * <p>If the KeyId parameter in the request uses a CMK alias, the response returns the CMK identifier that corresponds to the alias.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The Base64-encoded message authenticate code.</p>
     * 
     * <strong>example:</strong>
     * <p>vz1Snp+jGJbgydCFRWVWxAwIMdyfKCSp+jnMWQ==</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4c8ae23f-3a42-6791-a4ba-1faa77831c28</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateMacResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateMacResponseBody self = new GenerateMacResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateMacResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GenerateMacResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GenerateMacResponseBody setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public GenerateMacResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
