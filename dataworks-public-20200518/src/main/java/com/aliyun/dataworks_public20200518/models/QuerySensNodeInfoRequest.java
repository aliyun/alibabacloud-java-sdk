// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensNodeInfoRequest extends TeaModel {
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SensitiveName")
    public String sensitiveName;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("status")
    public Integer status;

    public static QuerySensNodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySensNodeInfoRequest self = new QuerySensNodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySensNodeInfoRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public QuerySensNodeInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySensNodeInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySensNodeInfoRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public QuerySensNodeInfoRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QuerySensNodeInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QuerySensNodeInfoRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
