// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceDistributeJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceDistributeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDistributeJobResponseBody self = new QueryDeviceDistributeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDistributeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDistributeJobResponseBody setData(QueryDeviceDistributeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDistributeJobResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceDistributeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDistributeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDistributeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        public static QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

    }

    public static class QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        public java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs;

        public static QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs self = new QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs setTargetInstanceConfigs(java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public java.util.List<QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigsTargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class QueryDeviceDistributeJobResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the distribution task.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The **ProductKey** of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ID of the source instance.</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The status of the distribution task.</p>
         * <br>
         * <p>*   **0**: The task is being initialized.</p>
         * <p>*   **1**: The task is being implemented.</p>
         * <p>*   **2**: The task is completed. This status only indicates that the distribution task is completed. This status does not indicate that all products and devices are distributed. To obtain distribution results, call the [QueryDeviceDistributeDetail](~~199533~~) operation.</p>
         * <p>*   **3**: The task is unexpectedly interrupted.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The distribution policy.</p>
         * <br>
         * <p>*   **0**: distributes devices to instances in a specified region.</p>
         * <p>*   **1**: configures instance IDs in multiple regions and distributes devices to the nearest regions based on the IP addresses of the devices.</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The IDs of the destination instances.</p>
         * <br>
         * <p>*   If the value of the **Strategy** parameter is **1**, multiple instance IDs exist.</p>
         * <p>*   If the value of the **Strategy** parameter is **0**, only one instance ID exists.</p>
         */
        @NameInMap("TargetInstanceConfigs")
        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs targetInstanceConfigs;

        @NameInMap("TargetUid")
        public String targetUid;

        /**
         * <p>The total number of devices in the distribution task.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryDeviceDistributeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDistributeJobResponseBodyData self = new QueryDeviceDistributeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDistributeJobResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceDistributeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryDeviceDistributeJobResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceDistributeJobResponseBodyData setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public QueryDeviceDistributeJobResponseBodyData setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public QueryDeviceDistributeJobResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryDeviceDistributeJobResponseBodyData setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public QueryDeviceDistributeJobResponseBodyData setTargetInstanceConfigs(QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        public QueryDeviceDistributeJobResponseBodyData setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public QueryDeviceDistributeJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
