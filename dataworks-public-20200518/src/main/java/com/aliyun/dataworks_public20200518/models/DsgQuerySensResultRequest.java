// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQuerySensResultRequest extends TeaModel {
    /**
     * <p>The name of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>col</p>
     */
    @NameInMap("Col")
    public String col;

    /**
     * <p>The type of the database. Valid values:</p>
     * <ul>
     * <li><strong>ODPS.ODPS</strong></li>
     * <li><strong>HOLO.POSTGRES</strong></li>
     * <li><strong>EMR</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ODPS.ODPS</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The sensitivity level of the field.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The name of a data category.</p>
     * 
     * <strong>example:</strong>
     * <p>Personal information</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The sorting method. Valid values:</p>
     * <ul>
     * <li>DESC</li>
     * <li>ASC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The field used for sorting.</p>
     * <ul>
     * <li>gmt_create</li>
     * <li>gmt_modified</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmt_create</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the schema.</p>
     * 
     * <strong>example:</strong>
     * <p>schema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The sensitivity status of the field.</p>
     * <ul>
     * <li>1: indicates sensitive.</li>
     * <li>\-1: indicates non-sensitive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SensStatus")
    public String sensStatus;

    /**
     * <p>The sensitive field ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
    @NameInMap("SensitiveId")
    public String sensitiveId;

    /**
     * <p>The name of the sensitive field.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("SensitiveName")
    public String sensitiveName;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("Table")
    public String table;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
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
