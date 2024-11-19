// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDistributeJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
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
         * 
         * <strong>example:</strong>
         * <p>iot-cn-6ja***</p>
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
         * 
         * <strong>example:</strong>
         * <p>1581595942000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the distribution task.</p>
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
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The status of the distribution task.</p>
         * <ul>
         * <li><strong>0</strong>: The task is being initialized.</li>
         * <li><strong>1</strong>: The task is being implemented.</li>
         * <li><strong>2</strong>: The task is completed. This status only indicates that the distribution task is completed. This status does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
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
         * <li><strong>0</strong>: distributes devices to instances in a specified region.</li>
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
        public QueryDeviceDistributeJobResponseBodyDataTargetInstanceConfigs targetInstanceConfigs;

        /**
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
