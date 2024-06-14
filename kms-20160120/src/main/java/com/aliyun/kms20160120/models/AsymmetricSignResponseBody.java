// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignResponseBody extends TeaModel {
    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The digest that is generated for the original message by using a hash algorithm. The hash algorithm is specified by the Algorithm parameter.</p>
     * <br>
     * <p>> * The value is encoded in Base64.</p>
     * <p>> * For more information about how to calculate message digests, see the **Preprocess signature: compute a message digest** section of the [Generate and verify a signature by using an asymmetric CMK](https://help.aliyun.com/document_detail/148146.html) topic.</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The calculated signature.</p>
     * <br>
     * <p>>  The value is encoded in Base64.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <br>
     * <p>>  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     */
    @NameInMap("Value")
    public String value;

    public static AsymmetricSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsymmetricSignResponseBody self = new AsymmetricSignResponseBody();
        return TeaModel.build(map, self);
    }

    public AsymmetricSignResponseBody setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public AsymmetricSignResponseBody setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public AsymmetricSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsymmetricSignResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
