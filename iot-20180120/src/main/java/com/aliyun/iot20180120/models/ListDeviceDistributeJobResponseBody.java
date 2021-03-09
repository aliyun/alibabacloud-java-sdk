// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public ListDeviceDistributeJobResponseBodyData data;

    public static ListDeviceDistributeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobResponseBody self = new ListDeviceDistributeJobResponseBody();
        return TeaModel.build(map, self);
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

    public ListDeviceDistributeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceDistributeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDeviceDistributeJobResponseBody setData(ListDeviceDistributeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceDistributeJobResponseBodyData getData() {
        return this.data;
    }

    public static class ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

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
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SourceUid")
        public String sourceUid;

        @NameInMap("TargetUid")
        public String targetUid;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Strategy")
        public Integer strategy;

        @NameInMap("TargetInstanceConfigs")
        public ListDeviceDistributeJobResponseBodyDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs;

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

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDeviceDistributeJobResponseBodyDataJobInfoItems setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
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
        @NameInMap("Total")
        public Integer total;

        @NameInMap("JobInfo")
        public ListDeviceDistributeJobResponseBodyDataJobInfo jobInfo;

        public static ListDeviceDistributeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseBodyData self = new ListDeviceDistributeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDeviceDistributeJobResponseBodyData setJobInfo(ListDeviceDistributeJobResponseBodyDataJobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public ListDeviceDistributeJobResponseBodyDataJobInfo getJobInfo() {
            return this.jobInfo;
        }

    }

}
