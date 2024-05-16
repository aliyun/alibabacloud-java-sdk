// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListQueryListResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageData")
    public DsgWhiteListQueryListResponseBodyPageData pageData;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DsgWhiteListQueryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgWhiteListQueryListResponseBody self = new DsgWhiteListQueryListResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgWhiteListQueryListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgWhiteListQueryListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgWhiteListQueryListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgWhiteListQueryListResponseBody setPageData(DsgWhiteListQueryListResponseBodyPageData pageData) {
        this.pageData = pageData;
        return this;
    }
    public DsgWhiteListQueryListResponseBodyPageData getPageData() {
        return this.pageData;
    }

    public DsgWhiteListQueryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgWhiteListQueryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgWhiteListQueryListResponseBodyPageDataData extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("SceneId")
        public Long sceneId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserGroups")
        public java.util.List<String> userGroups;

        public static DsgWhiteListQueryListResponseBodyPageDataData build(java.util.Map<String, ?> map) throws Exception {
            DsgWhiteListQueryListResponseBodyPageDataData self = new DsgWhiteListQueryListResponseBodyPageDataData();
            return TeaModel.build(map, self);
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DsgWhiteListQueryListResponseBodyPageDataData setUserGroups(java.util.List<String> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<String> getUserGroups() {
            return this.userGroups;
        }

    }

    public static class DsgWhiteListQueryListResponseBodyPageData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<DsgWhiteListQueryListResponseBodyPageDataData> data;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DsgWhiteListQueryListResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DsgWhiteListQueryListResponseBodyPageData self = new DsgWhiteListQueryListResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DsgWhiteListQueryListResponseBodyPageData setData(java.util.List<DsgWhiteListQueryListResponseBodyPageDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DsgWhiteListQueryListResponseBodyPageDataData> getData() {
            return this.data;
        }

        public DsgWhiteListQueryListResponseBodyPageData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DsgWhiteListQueryListResponseBodyPageData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DsgWhiteListQueryListResponseBodyPageData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
