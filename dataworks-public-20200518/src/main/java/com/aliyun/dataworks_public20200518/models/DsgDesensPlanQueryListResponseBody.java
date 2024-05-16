// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageData")
    public DsgDesensPlanQueryListResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DesensPlanType")
        public String desensPlanType;

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
        @NameInMap("CheckWatermark")
        public Boolean checkWatermark;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DesenMode")
        public String desenMode;

        @NameInMap("DesensPlan")
        public DsgDesensPlanQueryListResponseBodyPageDataDataDesensPlan desensPlan;

        @NameInMap("DesensRule")
        public String desensRule;

        @NameInMap("DesensWay")
        public String desensWay;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("SceneCode")
        public String sceneCode;

        @NameInMap("SceneName")
        public String sceneName;

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
        @NameInMap("Data")
        public java.util.List<DsgDesensPlanQueryListResponseBodyPageDataData> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
