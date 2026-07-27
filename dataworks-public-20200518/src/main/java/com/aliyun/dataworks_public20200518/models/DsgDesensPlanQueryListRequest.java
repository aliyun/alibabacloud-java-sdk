// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListRequest extends TeaModel {
    /**
     * <p>The owner of the desensitization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the desensitization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the Level-2 data desensitization scene. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The status of the desensitization rule. Valid values:</p>
     * <ul>
     * <li><p>0: Inactive</p>
     * </li>
     * <li><p>1: Active</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("columns")
    public java.util.List<DsgDesensPlanQueryListRequestColumns> columns;

    @NameInMap("dataType")
    public String dataType;

    @NameInMap("emptyNotDesesn")
    public String emptyNotDesesn;

    public static DsgDesensPlanQueryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanQueryListRequest self = new DsgDesensPlanQueryListRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanQueryListRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DsgDesensPlanQueryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DsgDesensPlanQueryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgDesensPlanQueryListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DsgDesensPlanQueryListRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DsgDesensPlanQueryListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DsgDesensPlanQueryListRequest setColumns(java.util.List<DsgDesensPlanQueryListRequestColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<DsgDesensPlanQueryListRequestColumns> getColumns() {
        return this.columns;
    }

    public DsgDesensPlanQueryListRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DsgDesensPlanQueryListRequest setEmptyNotDesesn(String emptyNotDesesn) {
        this.emptyNotDesesn = emptyNotDesesn;
        return this;
    }
    public String getEmptyNotDesesn() {
        return this.emptyNotDesesn;
    }

    public static class DsgDesensPlanQueryListRequestColumns extends TeaModel {
        @NameInMap("column")
        public String column;

        @NameInMap("dbType")
        public String dbType;

        @NameInMap("project")
        public String project;

        @NameInMap("table")
        public String table;

        public static DsgDesensPlanQueryListRequestColumns build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanQueryListRequestColumns self = new DsgDesensPlanQueryListRequestColumns();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanQueryListRequestColumns setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DsgDesensPlanQueryListRequestColumns setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgDesensPlanQueryListRequestColumns setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DsgDesensPlanQueryListRequestColumns setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

}
