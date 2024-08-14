// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class AsymmetricSignResponseBody extends TeaModel {
    /**
     * <p>The version ID of the CMK. The ID must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The digest that is generated for the original message by using a hash algorithm. The hash algorithm is specified by the Algorithm parameter.</p>
     * <blockquote>
     * <ul>
     * <li>The value is encoded in Base64.</li>
     * <li>For more information about how to calculate message digests, see the <strong>Preprocess signature: compute a message digest</strong> section of the <a href="https://help.aliyun.com/document_detail/148146.html">Generate and verify a signature by using an asymmetric CMK</a> topic.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The calculated signature.</p>
     * <blockquote>
     * <p> The value is encoded in Base64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>475f1620-b9d3-4d35-b5c6-3fbdd941423d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the CMK. The ID must be globally unique.</p>
     * <blockquote>
     * <p> If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</p>
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
