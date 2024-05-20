// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSServiceDataImportShrinkRequest extends TeaModel {
    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceId")
    public Long serviceId;

    public static PostMSServiceDataImportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSServiceDataImportShrinkRequest self = new PostMSServiceDataImportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PostMSServiceDataImportShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PostMSServiceDataImportShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public PostMSServiceDataImportShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
