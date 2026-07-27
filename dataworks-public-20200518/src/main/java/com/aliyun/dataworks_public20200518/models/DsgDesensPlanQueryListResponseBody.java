// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The paginated data.</p>
     */
    @NameInMap("PageData")
    public DsgDesensPlanQueryListResponseBodyPageData pageData;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgDesensPlanQueryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanQueryListResponseBody self = new DsgDesensPlanQueryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanQueryListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgDesensPlanQueryListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgDesensPlanQueryListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgDesensPlanQueryListResponseBody setPageData(DsgDesensPlanQueryListResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public DsgDesensPlanQueryListResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public DsgDesensPlanQueryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgDesensPlanQueryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan extends TeaModel {
        /**
         * <p>The type of the desensitization plan.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("DesensPlanType")
        public String desensPlanType;

        /**
         * <p>The parameters for the desensitization rule. For details, see the <a href="https://help.aliyun.com/document_detail/2786295.html">DsgDesensPlanAddOrUpdate</a> operation.</p>
         */
        @NameInMap("ExtParam")
        public java.util.Map<String, ?> extParam;

        public static DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan self = new DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan setDesensPlanType(String desensPlanType) {
            this.desensPlanType = desensPlanType;
            return this;
        }
        public String getDesensPlanType() {
            return this.desensPlanType;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan setExtParam(java.util.Map<String, ?> extParam) {
            this.extParam = extParam;
            return this;
        }
        public java.util.Map<String, ?> getExtParam() {
            return this.extParam;
        }

    }

    public static class DsgDesensPlanQueryListResponseBodyPageDataDataColumns extends TeaModel {
        @NameInMap("column")
        public String column;

        @NameInMap("dbType")
        public String dbType;

        @NameInMap("project")
        public String project;

        @NameInMap("table")
        public String table;

        public static DsgDesensPlanQueryListResponseBodyPageDataDataColumns build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanQueryListResponseBodyPageDataDataColumns self = new DsgDesensPlanQueryListResponseBodyPageDataDataColumns();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataColumns setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataColumns setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataColumns setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataDataColumns setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DsgDesensPlanQueryListResponseBodyPageDataData extends TeaModel {
        /**
         * <p>Indicates whether to add a watermark. Valid values:</p>
         * <ul>
         * <li><p>true: A watermark is added.</p>
         * </li>
         * <li><p>false: No watermark is added.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CheckWatermark")
        public Boolean checkWatermark;

        /**
         * <p>The sensitive data type.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The desensitization method.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesenMode")
        public String desenMode;

        /**
         * <p>The details of the desensitization plan.</p>
         */
        @NameInMap("DesensPlan")
        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan desensPlan;

        /**
         * <p>The desensitization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesensRule")
        public String desensRule;

        /**
         * <p>The desensitization method.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesensWay")
        public String desensWay;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the desensitization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The owner of the desensitization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the desensitization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>phone_hash</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The level-1 desensitization scene code. Valid values:</p>
         * <ul>
         * <li><p>Desensitization for display in Data Development and Data Map: dataworks_display_desense_code</p>
         * </li>
         * <li><p>Desensitization at the MaxCompute engine layer: maxcompute_desense_code</p>
         * </li>
         * <li><p>Desensitization at the MaxCompute engine layer (New): maxcompute_new_desense_code</p>
         * </li>
         * <li><p>Desensitization at the Hologres engine layer: hologres_display_desense_code</p>
         * </li>
         * <li><p>Static desensitization in Data Integration: dataworks_data_integration_desense_code</p>
         * </li>
         * <li><p>Desensitization for display in Data Analysis: dataworks_analysis_desense_code</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dataworks_display_desense_code</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The name of the level-2 desensitization scene.</p>
         * 
         * <strong>example:</strong>
         * <p>test_scene</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><p>0: Inactive.</p>
         * </li>
         * <li><p>1: Active.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("columns")
        public java.util.List<DsgDesensPlanQueryListResponseBodyPageDataDataColumns> columns;

        @NameInMap("emptyNotDesesn")
        public Boolean emptyNotDesesn;

        public static DsgDesensPlanQueryListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanQueryListResponseBodyPageDataData self = new DsgDesensPlanQueryListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setCheckWatermark(Boolean checkWatermark) {
            this.checkWatermark = checkWatermark;
            return this;
        }
        public Boolean getCheckWatermark() {
            return this.checkWatermark;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setDesenMode(String desenMode) {
            this.desenMode = desenMode;
            return this;
        }
        public String getDesenMode() {
            return this.desenMode;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setDesensPlan(DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan desensPlan) {
            this.desensPlan = desensPlan;
            return this;
        }
        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan getDesensPlan() {
            return this.desensPlan;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setDesensRule(String desensRule) {
            this.desensRule = desensRule;
            return this;
        }
        public String getDesensRule() {
            return this.desensRule;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setDesensWay(String desensWay) {
            this.desensWay = desensWay;
            return this;
        }
        public String getDesensWay() {
            return this.desensWay;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setColumns(java.util.List<DsgDesensPlanQueryListResponseBodyPageDataDataColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DsgDesensPlanQueryListResponseBodyPageDataDataColumns> getColumns() {
            return this.columns;
        }

        public DsgDesensPlanQueryListResponseBodyPageDataData setEmptyNotDesesn(Boolean emptyNotDesesn) {
            this.emptyNotDesesn = emptyNotDesesn;
            return this;
        }
        public Boolean getEmptyNotDesesn() {
            return this.emptyNotDesesn;
        }

    }

    public static class DsgDesensPlanQueryListResponseBodyPageData extends TeaModel {
        /**
         * <p>The details of the desensitization rules.</p>
         */
        @NameInMap("Data")
        public java.util.List<DsgDesensPlanQueryListResponseBodyPageDataData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of matching desensitization rules.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DsgDesensPlanQueryListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DsgDesensPlanQueryListResponseBodyPageData self = new DsgDesensPlanQueryListResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DsgDesensPlanQueryListResponseBodyPageData setData(java.util.List<DsgDesensPlanQueryListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DsgDesensPlanQueryListResponseBodyPageDataData> getData() {
            return this.data;
        }

        public DsgDesensPlanQueryListResponseBodyPageData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DsgDesensPlanQueryListResponseBodyPageData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DsgDesensPlanQueryListResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
