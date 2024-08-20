// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvWithHighCapacityAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static BatchDeleteDcdnKvWithHighCapacityAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvWithHighCapacityAdvanceRequest self = new BatchDeleteDcdnKvWithHighCapacityAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvWithHighCapacityAdvanceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDeleteDcdnKvWithHighCapacityAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
