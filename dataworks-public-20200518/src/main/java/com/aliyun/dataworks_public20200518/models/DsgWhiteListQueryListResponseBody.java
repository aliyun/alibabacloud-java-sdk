// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgWhiteListQueryListResponseBody extends TeaModel {
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
    public DsgWhiteListQueryListResponseBodyPageData pageData;

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
        /**
         * <p>The expiration time of the data masking whitelist cannot be earlier than the time when the data masking whitelist takes effect. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-10 15:46:20</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the whitelist was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the whitelist was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the data masking whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the data masking rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The ID of the level-2 data masking scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>The time when the data masking whitelist takes effect cannot be earlier than the current time. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-09 15:46:20</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The sensitive field type.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>A collection of user group names.</p>
         */
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
        /**
         * <p>A collection of whitelists.</p>
         */
        @NameInMap("Data")
        public java.util.List<DsgWhiteListQueryListResponseBodyPageDataData> data;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of data masking whitelists.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
