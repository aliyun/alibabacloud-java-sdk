// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserUsageReportResponseBody extends TeaModel {
    /**
     * <p>The business processing status code. <strong>A successful response may not contain this field. Do not use <code>Code=200</code> as a necessary condition for success.</strong> This field is not equivalent to the HTTP status code. If the request fails, handle it based on the HTTP status code, error code, and error message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The description of the business processing result. <strong>A successful response may not contain this field. Do not rely on the fixed <code>success</code> text.</strong> If the request fails, read the specific error message based on the error code.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number corresponding to the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page in the request. If this parameter is not specified, the default value <code>200</code> is returned. If the requested value exceeds <code>1500</code>, this field still returns the echo request value, but the actual query uses a maximum of <code>1500</code>. Refer to the length of the data list for the actual number of returned records.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of user usage data, sorted in descending order of cumulative usage duration.</p>
     */
    @NameInMap("UserUsageReportDataModel")
    public java.util.List<QueryUserUsageReportResponseBodyUserUsageReportDataModel> userUsageReportDataModel;

    public static QueryUserUsageReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserUsageReportResponseBody self = new QueryUserUsageReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserUsageReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserUsageReportResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public QueryUserUsageReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserUsageReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryUserUsageReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryUserUsageReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserUsageReportResponseBody setUserUsageReportDataModel(java.util.List<QueryUserUsageReportResponseBodyUserUsageReportDataModel> userUsageReportDataModel) {
        this.userUsageReportDataModel = userUsageReportDataModel;
        return this;
    }
    public java.util.List<QueryUserUsageReportResponseBodyUserUsageReportDataModel> getUserUsageReportDataModel() {
        return this.userUsageReportDataModel;
    }

    public static class QueryUserUsageReportResponseBodyUserUsageReportDataModel extends TeaModel {
        /**
         * <p>The ID of the app instance group to which the user usage record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-9ciijz60n4xsv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The name of the app instance group to which the user usage record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D workstation group</p>
         */
        @NameInMap("AppInstanceGroupName")
        public String appInstanceGroupName;

        /**
         * <p>The current connection status of the user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>Connected</code>: At least one currently connected session exists.</li>
         * <li><code>Disconnected</code>: The session binding is retained, but no currently connected session exists.</li>
         * <li><code>Unbound</code>: No session binding exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The last connection time. Format: <code>yyyy-MM-dd HH:mm:ss</code>. If a current session binding record exists, the connection time of this record is used. Otherwise, the historical connection record is used. If no available connection time exists, <code>-</code> is returned. This time is not limited by the statistical date range in the request.</p>
         * <p>The time is in Beijing time (UTC+8). The returned string does not carry <code>Z</code> or a time zone offset. For example, <code>2026-09-01 10:00:00</code> indicates 10:00:00 on September 1, 2026, Beijing time. Do not parse it as UTC time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:00:00</p>
         */
        @NameInMap("LastConnectedTime")
        public String lastConnectedTime;

        /**
         * <p>The current version does not return a valid region ID. Callers should not rely on this field. To filter by business region, use the <code>BizRegionId</code> request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cumulative session persistence duration within the query range, which is the duration that the user occupies the session from attach to session release. Multiple sessions under the same app instance group are accumulated. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5</p>
         */
        @NameInMap("SessionsHoldDuration")
        public Double sessionsHoldDuration;

        /**
         * <p>The cumulative user usage duration within the query range. The usage duration of the same user under the same app instance group is aggregated by day. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UsageDuration")
        public Double usageDuration;

        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryUserUsageReportResponseBodyUserUsageReportDataModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserUsageReportResponseBodyUserUsageReportDataModel self = new QueryUserUsageReportResponseBodyUserUsageReportDataModel();
            return TeaModel.build(map, self);
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setAppInstanceGroupName(String appInstanceGroupName) {
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setLastConnectedTime(String lastConnectedTime) {
            this.lastConnectedTime = lastConnectedTime;
            return this;
        }
        public String getLastConnectedTime() {
            return this.lastConnectedTime;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setSessionsHoldDuration(Double sessionsHoldDuration) {
            this.sessionsHoldDuration = sessionsHoldDuration;
            return this;
        }
        public Double getSessionsHoldDuration() {
            return this.sessionsHoldDuration;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setUsageDuration(Double usageDuration) {
            this.usageDuration = usageDuration;
            return this;
        }
        public Double getUsageDuration() {
            return this.usageDuration;
        }

        public QueryUserUsageReportResponseBodyUserUsageReportDataModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
