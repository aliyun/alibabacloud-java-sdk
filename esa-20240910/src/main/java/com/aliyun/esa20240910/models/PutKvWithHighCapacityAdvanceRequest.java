// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvWithHighCapacityAdvanceRequest extends TeaModel {
    /**
     * <p>The key name to set. The key name can be up to 512 characters in length and cannot contain spaces or backslashes (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name specified when you called the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namesapce</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>A publicly accessible HTTP or HTTPS URL that points to a JSON file containing the key-value pair to set. The server actively downloads the content from this URL.</p>
     * <ul>
     * <li><p>If you use an SDK, the SDK automatically uploads the file and generates the URL.</p>
     * </li>
     * <li><p>In non-SDK scenarios, upload the JSON payload to any publicly accessible HTTP service and specify the URL.</p>
     * </li>
     * </ul>
     * <p>The file content pointed to by the URL must be in the following JSON format: {&quot;Namespace&quot;:&quot;<namespace>&quot;,&quot;Key&quot;:&quot;<key>&quot;,&quot;Value&quot;:&quot;<value>&quot;}.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
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
