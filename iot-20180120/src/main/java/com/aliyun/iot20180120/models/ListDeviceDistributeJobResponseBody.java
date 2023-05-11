// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The distribution tasks that are returned if the call is successful. For more information, see the **JobInfo** parameter.</p>
     */
    @NameInMap("Data")
    public ListDeviceDistributeJobResponseBodyData data;

    /**
     * <p>The error message that is returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDeviceDistributeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobResponseBody self = new ListDeviceDistributeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceDistributeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceDistributeJobResponseBody setData(ListDeviceDistributeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceDistributeJobResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceDistributeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDeviceDistributeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceDistributeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The name of the destination instance.</p>
         */
        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        /**
         * <p>The region where the destination instance resides.</p>
         */
        @NameInMap("TargetRegion")
        public String targetRegion;

        public static ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs self = new ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

    }

    public static class ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        public java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs;

        public static ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs self = new ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs setTargetInstanceConfigs(java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class ListDeviceDistributeJobResponseBodyDataJobInfoItems extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the task.</p>
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
         * <p>The name of the source instance.</p>
         */
        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        /**
         * <p>The region where the source instance resides.</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The ID of the source Alibaba Cloud account.</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   **0**: The task is being initialized.</p>
         * <p>*   **1**: The task is running.</p>
         * <p>*   **2**: The task is completed. The status indicates that the distribution task is complete but does not indicate that all products and devices are distributed. To obtain distribution results, call the [QueryDeviceDistributeDetail](~~199533~~) operation.</p>
         * <p>*   **3**: The task is unexpectedly interrupted.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The distribution policy.</p>
         * <br>
         * <p>*   **0**: distributes devices to specified instances in a specified region. This is the default value.</p>
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
        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs;

        /**
         * <p>The ID of the destination Alibaba Cloud account.</p>
         */
        @NameInMap("TargetUid")
        public String targetUid;

        /**
         * <p>The total number of devices in the distribution task.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListDeviceDistributeJobResponseBodyDataJobInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyDataJobInfoItems self = new ListDeviceDistributeJobResponseBodyDataJobInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setTargetInstanceConfigs(ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListDeviceDistributeJobResponseBodyDataJobInfo extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItems> items;

        public static ListDeviceDistributeJobResponseBodyDataJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyDataJobInfo self = new ListDeviceDistributeJobResponseBodyDataJobInfo();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfo setItems(java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDeviceDistributeJobResponseBodyDataJobInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDeviceDistributeJobResponseBodyData extends TeaModel {
        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("JobInfo")
        public ListDeviceDistributeJobResponseBodyDataJobInfo jobInfo;

        /**
         * <p>The token that is used to retrieve the subsequent pages of the query results. The value of this parameter can be used in the next query to obtain the subsequent pages of results. </p>
         * <br>
         * <p>If the return value is empty, no subsequent page exists.</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of device distribution tasks.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListDeviceDistributeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyData self = new ListDeviceDistributeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyData setJobInfo(ListDeviceDistributeJobResponseBodyDataJobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public ListDeviceDistributeJobResponseBodyDataJobInfo getJobInfo() {
            return this.jobInfo;
        }

        public ListDeviceDistributeJobResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDeviceDistributeJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
