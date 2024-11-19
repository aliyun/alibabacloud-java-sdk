// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The distribution tasks that are returned if the call is successful. For more information, see the <strong>JobInfo</strong> parameter.</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>iot-cn-6ja***</p>
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
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
         * 
         * <strong>example:</strong>
         * <p>1581595942000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>UbmsMHmkqv0PiAG****010001</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-6ja***</p>
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
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The ID of the source Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><strong>0</strong>: The task is being initialized.</li>
         * <li><strong>1</strong>: The task is running.</li>
         * <li><strong>2</strong>: The task is completed. The status indicates that the distribution task is complete but does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
         * <li><strong>3</strong>: The task is unexpectedly interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The distribution policy.</p>
         * <ul>
         * <li><strong>0</strong>: distributes devices to specified instances in a specified region. This is the default value.</li>
         * <li><strong>1</strong>: configures instance IDs in multiple regions and distributes devices to the nearest regions based on the IP addresses of the devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Strategy")
        public Integer strategy;

        /**
         * <p>The IDs of the destination instances.</p>
         * <ul>
         * <li>If the value of the <strong>Strategy</strong> parameter is <strong>1</strong>, multiple instance IDs exist.</li>
         * <li>If the value of the <strong>Strategy</strong> parameter is <strong>0</strong>, only one instance ID exists.</li>
         * </ul>
         */
        @NameInMap("TargetInstanceConfigs")
        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs;

        /**
         * <p>The ID of the destination Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        @NameInMap("TargetUid")
        public String targetUid;

        /**
         * <p>The total number of devices in the distribution task.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
         * <p>If the return value is empty, no subsequent page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of device distribution tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
