// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetUpgradeStatusResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Internal server error.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D73E42D0-AA72-5880-B96F-548B43C84736</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusResponseBody self = new GetUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUpgradeStatusResponseBody setData(java.util.List<GetUpgradeStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUpgradeStatusResponseBodyData> getData() {
        return this.data;
    }

    public GetUpgradeStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUpgradeStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUpgradeStatusResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUpgradeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUpgradeStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUpgradeStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;UpgradePhase&quot;:&quot;Upgrade&quot;,&quot;StatusCode&quot;:&quot;LeaderRestartFailed&quot;,&quot;FlightingReport&quot;:{&quot;SQLResultStat&quot;:{&quot;TotalExecuted&quot;:9000&quot;Exceptions&quot;:0,&quot;Incorrect&quot;:1,&quot;Slow&quot;:1,&quot;DQLSpeedup&quot;:2}&quot;SegmentFormatStat&quot;:[{&quot;Database&quot;:&quot;test_db&quot;,&quot;TableUsingSegmentCount&quot;:5},{&quot;Database&quot;:&quot;user_order&quot;,&quot;TableUsingSegmentCount&quot;:7}],&quot;EstimatedUpgradeTime&quot;:{&quot;StopInstance&quot;:30,&quot;BackupData&quot;:120,&quot;UpgradeInstance&quot;:600},&quot;ReadPermissionCheckStat&quot;:[{&quot;db&quot;:&quot;tst0&quot;,&quot;user&quot;:&quot;v4_300433463265624129&quot;,&quot;schema&quot;:&quot;dim_db&quot;,&quot;table&quot;:&quot;it_rpt_org_tree_info_partition_all&quot;},{&quot;db&quot;:&quot;tst1&quot;,&quot;user&quot;:&quot;v4_300433463265624129&quot;,&quot;schema&quot;:&quot;dim_db&quot;,&quot;table&quot;:&quot;it_rpt_org_tree_info_partition_all_2&quot;},]},&quot;UpgradingSteps&quot;:{&quot;Stop&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;Backup&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;DoUpgrade&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;},&quot;Rollback&quot;:{&quot;Status&quot;:&quot;Success&quot;,&quot;StartTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;,&quot;StopTime&quot;:&quot;2023-05-09T06:48:28.843Z&quot;}},&quot;Instances&quot;:{&quot;LeaderInstanceId&quot;:&quot;hgxxx&quot;,&quot;LeaderInstanceName&quot;:&quot;ERP instance&quot;,&quot;LeaderInstanceStatus&quot;:&quot;Running&quot;,&quot;FollowerInstances&quot;:[{&quot;InstanceId&quot;:&quot;hgxxx&quot;,&quot;InstanceName&quot;:&quot;TMSinstance&quot;,&quot;Status&quot;:&quot;Running&quot;},{&quot;InstanceId&quot;:&quot;hxxx&quot;&quot;InstanceName&quot;:&quot;WMS readonly&quot;,&quot;Status&quot;:&quot;Unavailable&quot;}]}}</p>
         */
        @NameInMap("Details")
        public String details;

        /**
         * <strong>example:</strong>
         * <p>1.3.23</p>
         */
        @NameInMap("FromVersion")
        public String fromVersion;

        /**
         * <strong>example:</strong>
         * <p>2023-05-09T06:48:28.843Z</p>
         */
        @NameInMap("PrepareFinishTime")
        public String prepareFinishTime;

        /**
         * <strong>example:</strong>
         * <p>archived</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1.3.24</p>
         */
        @NameInMap("ToVersion")
        public String toVersion;

        public static GetUpgradeStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUpgradeStatusResponseBodyData self = new GetUpgradeStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUpgradeStatusResponseBodyData setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

        public GetUpgradeStatusResponseBodyData setFromVersion(String fromVersion) {
            this.fromVersion = fromVersion;
            return this;
        }
        public String getFromVersion() {
            return this.fromVersion;
        }

        public GetUpgradeStatusResponseBodyData setPrepareFinishTime(String prepareFinishTime) {
            this.prepareFinishTime = prepareFinishTime;
            return this;
        }
        public String getPrepareFinishTime() {
            return this.prepareFinishTime;
        }

        public GetUpgradeStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUpgradeStatusResponseBodyData setToVersion(String toVersion) {
            this.toVersion = toVersion;
            return this;
        }
        public String getToVersion() {
            return this.toVersion;
        }

    }

}
