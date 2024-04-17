// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQuerySensResultRequest extends TeaModel {
    @NameInMap("Col")
    public String col;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("Level")
    public String level;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("SensStatus")
    public String sensStatus;

    @NameInMap("SensitiveId")
    public String sensitiveId;

    @NameInMap("SensitiveName")
    public String sensitiveName;

    @NameInMap("Table")
    public String table;

    @NameInMap("TenantId")
    public String tenantId;

    public static DsgQuerySensResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgQuerySensResultRequest self = new DsgQuerySensResultRequest();
        return TeaModel.build(map, self);
    }

    public DsgQuerySensResultRequest setCol(String col) {
        this.col = col;
        return this;
    }
    public String getCol() {
        return this.col;
    }

    public DsgQuerySensResultRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DsgQuerySensResultRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DsgQuerySensResultRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DsgQuerySensResultRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DsgQuerySensResultRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public DsgQuerySensResultRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DsgQuerySensResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgQuerySensResultRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DsgQuerySensResultRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DsgQuerySensResultRequest setSensStatus(String sensStatus) {
        this.sensStatus = sensStatus;
        return this;
    }
    public String getSensStatus() {
        return this.sensStatus;
    }

    public DsgQuerySensResultRequest setSensitiveId(String sensitiveId) {
        this.sensitiveId = sensitiveId;
        return this;
    }
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    public DsgQuerySensResultRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public DsgQuerySensResultRequest setTable(String table) {
        this.table = table;
        return this;
    }
    public String getTable() {
        return this.table;
    }

    public DsgQuerySensResultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
