// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvWithHighCapacityRequest extends TeaModel {
    /**
     * <p>The name specified when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The download URL that stores the key-value pairs to be batch deleted, such as an OSS download URL with read permission.</p>
     * <ul>
     * <li><p>When you call this operation by using an SDK, the SDK automatically uploads the submitted content to OSS and passes in the corresponding URL.</p>
     * </li>
     * <li><p>To call this operation directly, you must upload the JSON payload (in the same format as the BatchDeleteKv body: {&quot;Namespace&quot;:&quot;...&quot;,&quot;Keys&quot;:[...]}) to an OSS bucket and generate a signed HTTPS GET URL.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-region.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static BatchDeleteKvWithHighCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteKvWithHighCapacityRequest self = new BatchDeleteKvWithHighCapacityRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteKvWithHighCapacityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDeleteKvWithHighCapacityRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
