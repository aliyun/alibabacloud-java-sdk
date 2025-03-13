// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class BatchAddDocumentRequest extends TeaModel {
    @NameInMap("addDocumentInfos")
    public java.util.List<AddDocumentInfo> addDocumentInfos;

    public static BatchAddDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDocumentRequest self = new BatchAddDocumentRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddDocumentRequest setAddDocumentInfos(java.util.List<AddDocumentInfo> addDocumentInfos) {
        this.addDocumentInfos = addDocumentInfos;
        return this;
    }
    public java.util.List<AddDocumentInfo> getAddDocumentInfos() {
        return this.addDocumentInfos;
    }

}
