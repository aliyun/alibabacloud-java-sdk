// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanAddOrUpdateRequest extends TeaModel {
    /**
     * <p>A collection of data masking rules that you want to add or modify.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesensRules")
    public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> desensRules;

    public static DsgDesensPlanAddOrUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanAddOrUpdateRequest self = new DsgDesensPlanAddOrUpdateRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanAddOrUpdateRequest setDesensRules(java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> desensRules) {
        this.desensRules = desensRules;
        return this;
    }
    public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRules> getDesensRules() {
        return this.desensRules;
    }

    public static class DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan extends TeaModel {
        /**
         * <p>The masking method configured in the data masking rule. Valid values:</p>
         * <ul>
         * <li>hash</li>
         * <li>mapping</li>
         * <li>mask</li>
         * <li>charreplacement</li>
         * <li>intervalselect</li>
         * <li>decimalpoint</li>
         * <li>emptydesens</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("DesensPlanType")
        public String desensPlanType;

        /**
         * <p>The parameters for the data masking rule.</p>
         */
        @NameInMap("ExtParam")
        public java.util.Map<String, ?> extParam;

        public static DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan self = new DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan setDesensPlanType(String desensPlanType) {
            this.desensPlanType = desensPlanType;
            return this;
        }
        public String getDesensPlanType() {
            return this.desensPlanType;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan setExtParam(java.util.Map<String, ?> extParam) {
            this.extParam = extParam;
            return this;
        }
        public java.util.Map<String, ?> getExtParam() {
            return this.extParam;
        }

    }

    public static class DsgDesensPlanAddOrUpdateRequestDesensRulesColumns extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("column")
        public String column;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dbType")
        public String dbType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("table")
        public String table;

        public static DsgDesensPlanAddOrUpdateRequestDesensRulesColumns build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanAddOrUpdateRequestDesensRulesColumns self = new DsgDesensPlanAddOrUpdateRequestDesensRulesColumns();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesColumns setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesColumns setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesColumns setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRulesColumns setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DsgDesensPlanAddOrUpdateRequestDesensRules extends TeaModel {
        /**
         * <p>Specifies whether to add a watermark. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckWatermark")
        public Boolean checkWatermark;

        /**
         * <p>The sensitive field type.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The data masking rule.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DesensPlan")
        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan desensPlan;

        /**
         * <p>The ID of the data masking rule. You can call the <a href="https://help.aliyun.com/document_detail/2786578.html">DsgDesensPlanQueryList</a> operation to query the ID of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The owner of the data masking rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the data masking rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>phone_hash</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The level-2 data masking scenario.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SceneIds")
        public java.util.List<Long> sceneIds;

        /**
         * <p>The status of the data masking rule. Valid values:</p>
         * <ul>
         * <li>0: expired</li>
         * <li>1: effective</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("columns")
        public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRulesColumns> columns;

        @NameInMap("emptyNotDesesn")
        public Boolean emptyNotDesesn;

        public static DsgDesensPlanAddOrUpdateRequestDesensRules build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanAddOrUpdateRequestDesensRules self = new DsgDesensPlanAddOrUpdateRequestDesensRules();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setCheckWatermark(Boolean checkWatermark) {
            this.checkWatermark = checkWatermark;
            return this;
        }
        public Boolean getCheckWatermark() {
            return this.checkWatermark;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setDesensPlan(DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan desensPlan) {
            this.desensPlan = desensPlan;
            return this;
        }
        public DsgDesensPlanAddOrUpdateRequestDesensRulesDesensPlan getDesensPlan() {
            return this.desensPlan;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setSceneIds(java.util.List<Long> sceneIds) {
            this.sceneIds = sceneIds;
            return this;
        }
        public java.util.List<Long> getSceneIds() {
            return this.sceneIds;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setColumns(java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRulesColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DsgDesensPlanAddOrUpdateRequestDesensRulesColumns> getColumns() {
            return this.columns;
        }

        public DsgDesensPlanAddOrUpdateRequestDesensRules setEmptyNotDesesn(Boolean emptyNotDesesn) {
            this.emptyNotDesesn = emptyNotDesesn;
            return this;
        }
        public Boolean getEmptyNotDesesn() {
            return this.emptyNotDesesn;
        }

    }

}
