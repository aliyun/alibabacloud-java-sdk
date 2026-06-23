// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvWithHighCapacityAdvanceRequest extends TeaModel {
    /**
     * <p>The namespace name specified when you called <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>A publicly accessible HTTP(S) URL that points to a JSON file containing the key-value pairs to be batch set. The server actively downloads the content from this URL.</p>
     * <ul>
     * <li><p>If you use an SDK, the SDK automatically uploads the file and generates the URL.</p>
     * </li>
     * <li><p>In non-SDK scenarios, upload the JSON payload to any publicly accessible HTTP service and specify the URL.</p>
     * </li>
     * </ul>
     * <p>The file content pointed to by the URL must be in the following JSON format: {&quot;Namespace&quot;:&quot;<namespace name>&quot;,&quot;KvList&quot;:[{&quot;Key&quot;:&quot;<key>&quot;,&quot;Value&quot;:&quot;<value>&quot;},...]}.If the URL content does not match this format, the API silently returns an empty SuccessKeys array.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static BatchPutKvWithHighCapacityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvWithHighCapacityAdvanceRequest self = new BatchPutKvWithHighCapacityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutKvWithHighCapacityAdvanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchPutKvWithHighCapacityAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
