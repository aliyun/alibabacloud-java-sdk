// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSDataProcessingCountShrinkRequest extends TeaModel {
    @NameInMap("DataIds")
    public String dataIdsShrink;

    @NameInMap("DataImportId")
    public Long dataImportId;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("X-DashScope-OpenAPISource")
    public String xDashScopeOpenAPISource;

    public static PostMSDataProcessingCountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSDataProcessingCountShrinkRequest self = new PostMSDataProcessingCountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PostMSDataProcessingCountShrinkRequest setDataIdsShrink(String dataIdsShrink) {
        this.dataIdsShrink = dataIdsShrink;
        return this;
    }
    public String getDataIdsShrink() {
        return this.dataIdsShrink;
    }

    public PostMSDataProcessingCountShrinkRequest setDataImportId(Long dataImportId) {
        this.dataImportId = dataImportId;
        return this;
    }
    public Long getDataImportId() {
        return this.dataImportId;
    }

    public PostMSDataProcessingCountShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PostMSDataProcessingCountShrinkRequest setXDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
        this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
        return this;
    }
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

}
