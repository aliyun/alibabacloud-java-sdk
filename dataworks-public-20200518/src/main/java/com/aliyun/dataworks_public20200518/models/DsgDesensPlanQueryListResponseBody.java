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
     * <p>The pagination information.</p>
     */
    @NameInMap("PageData")
    public DsgDesensPlanQueryListResponseBodyPageData pageData;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
         * <p>The type of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>hash</p>
         */
        @NameInMap("DesensPlanType")
        public String desensPlanType;

        /**
         * <p>The parameters for the data masking rule. For more information about the parameters, see the <a href="https://help.aliyun.com/document_detail/2786295.html">DsgDesensPlanAddOrUpdate</a> API reference.</p>
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

    public static class DsgDesensPlanQueryListResponseBodyPageDataData extends TeaModel {
        /**
         * <p>Indicates whether a watermark is added. Valid values:</p>
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
         * <p>The type of the data masking method.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesenMode")
        public String desenMode;

        /**
         * <p>The details of the data masking rule.</p>
         */
        @NameInMap("DesensPlan")
        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan desensPlan;

        /**
         * <p>The data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesensRule")
        public String desensRule;

        /**
         * <p>The data masking method.</p>
         * 
         * <strong>example:</strong>
         * <p>HASH</p>
         */
        @NameInMap("DesensWay")
        public String desensWay;

        /**
         * <p>The time when the data masking rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data masking rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The owner of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>phone_hash</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The code of the level-1 data masking scenario to which the rule belongs. Valid values:</p>
         * <ul>
         * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
         * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
         * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
         * <li>hologres_display_desense_code: data masking at the Hologres compute engine layer</li>
         * <li>dataworks_data_integration_desense_code: static data masking in Data Integration</li>
         * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dataworks_display_desense_code</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        /**
         * <p>The name of the level-2 data masking scenario to which the data masking rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test_scene</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

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

    }

    public static class DsgDesensPlanQueryListResponseBodyPageData extends TeaModel {
        /**
         * <p>The information about the data masking rule.</p>
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
         * <p>The number of data masking rules.</p>
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
