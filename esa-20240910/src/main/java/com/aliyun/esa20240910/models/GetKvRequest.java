// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvRequest extends TeaModel {
    /**
     * <p>Specifies whether to Base64-decode the value. If you set the base64 parameter to true when you called the <a href="https://help.aliyun.com/document_detail/2850482.html">PutKv</a> operation, set this parameter to true to read the original content.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public Boolean base64;

    /**
     * <p>The name of the key to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name specified when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetKvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKvRequest self = new GetKvRequest();
        return TeaModel.build(map, self);
    }

    public GetKvRequest setBase64(Boolean base64) {
        this.base64 = base64;
        return this;
    }
    public Boolean getBase64() {
        return this.base64;
    }

    public GetKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
