// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class QueryUserUsageReportResponseBody extends TeaModel {
    /**
     * <p>The business status code. <code>200</code> indicates that the request is successful. Other values indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>The description of the request processing result. <code>success</code> is usually returned when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>The number of entries per page used in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
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
         * <li>Connected: At least one currently connected session exists.</li>
         * <li>Disconnected: The session binding is retained, but no currently connected session exists.</li>
         * <li>Unbound: No session binding exists.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The last connection time. Format: <code>yyyy-MM-dd HH:mm:ss</code>. If no current or historical connection record exists, <code>-</code> is returned. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-01 10:00:00</p>
         */
        @NameInMap("LastConnectedTime")
        public String lastConnectedTime;

        /**
         * <p>The current version does not return a valid region ID. Callers should not rely on this field. To filter by business region, use the BizRegionId request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The cumulative session persistence duration within the query range, which is the duration that the user occupies the session from the attach time to the session release time. Multiple sessions under the same app instance group are accumulated. Unit: hours.</p>
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
