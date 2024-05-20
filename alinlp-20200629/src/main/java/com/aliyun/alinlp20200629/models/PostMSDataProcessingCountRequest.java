// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSDataProcessingCountRequest extends TeaModel {
    @NameInMap("DataIds")
    public java.util.List<String> dataIds;

    @NameInMap("DataImportId")
    public Long dataImportId;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("X-DashScope-OpenAPISource")
    public String xDashScopeOpenAPISource;

    public static PostMSDataProcessingCountRequest build(java.util.Map<String, ?> map) throws Exception {
        PostMSDataProcessingCountRequest self = new PostMSDataProcessingCountRequest();
        return TeaModel.build(map, self);
    }

    public PostMSDataProcessingCountRequest setDataIds(java.util.List<String> dataIds) {
        this.dataIds = dataIds;
        return this;
    }
    public java.util.List<String> getDataIds() {
        return this.dataIds;
    }

    public PostMSDataProcessingCountRequest setDataImportId(Long dataImportId) {
        this.dataImportId = dataImportId;
        return this;
    }
    public Long getDataImportId() {
        return this.dataImportId;
    }

    public PostMSDataProcessingCountRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public PostMSDataProcessingCountRequest setXDashScopeOpenAPISource(String xDashScopeOpenAPISource) {
        this.xDashScopeOpenAPISource = xDashScopeOpenAPISource;
        return this;
    }
    public String getXDashScopeOpenAPISource() {
        return this.xDashScopeOpenAPISource;
    }

}
