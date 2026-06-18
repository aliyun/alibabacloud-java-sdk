// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvWithHighCapacityAdvanceRequest extends TeaModel {
    /**
     * <p>The name of the key to set. It cannot exceed 512 characters and cannot contain spaces or backslashes (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name specified when calling <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namesapce</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The download link for the key-value pair to set. This parameter is automatically generated when you call the SDK. Use the SDK to call it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static PutKvWithHighCapacityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutKvWithHighCapacityAdvanceRequest self = new PutKvWithHighCapacityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public PutKvWithHighCapacityAdvanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PutKvWithHighCapacityAdvanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutKvWithHighCapacityAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
