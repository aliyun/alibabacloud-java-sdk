// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvWithHighCapacityRequest extends TeaModel {
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
    public String url;

    public static PutKvWithHighCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        PutKvWithHighCapacityRequest self = new PutKvWithHighCapacityRequest();
        return TeaModel.build(map, self);
    }

    public PutKvWithHighCapacityRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PutKvWithHighCapacityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutKvWithHighCapacityRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
