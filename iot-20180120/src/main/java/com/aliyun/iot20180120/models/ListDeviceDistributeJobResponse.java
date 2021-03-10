// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDeviceDistributeJobResponseData data;

    public static ListDeviceDistributeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobResponse self = new ListDeviceDistributeJobResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceDistributeJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceDistributeJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDeviceDistributeJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceDistributeJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDeviceDistributeJobResponse setData(ListDeviceDistributeJobResponseData data) {
        this.data = data;
        return this;
    }
    public ListDeviceDistributeJobResponseData getData() {
        return this.data;
    }

    public static class ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs extends TeaModel {
        @NameInMap("TargetInstanceId")
        @Validation(required = true)
        public String targetInstanceId;

        public static ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs self = new ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

    }

    public static class ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs extends TeaModel {
        @NameInMap("targetInstanceConfigs")
        @Validation(required = true)
        public java.util.List<ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs;

        public static ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs self = new ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs setTargetInstanceConfigs(java.util.List<ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public java.util.List<ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigsTargetInstanceConfigs> getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class ListDeviceDistributeJobResponseDataJobInfoItems extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("SourceUid")
        @Validation(required = true)
        public String sourceUid;

        @NameInMap("TargetUid")
        @Validation(required = true)
        public String targetUid;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("SourceInstanceId")
        @Validation(required = true)
        public String sourceInstanceId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("Strategy")
        @Validation(required = true)
        public Integer strategy;

        @NameInMap("TargetInstanceConfigs")
        @Validation(required = true)
        public ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs;

        public static ListDeviceDistributeJobResponseDataJobInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseDataJobInfoItems self = new ListDeviceDistributeJobResponseDataJobInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setStrategy(Integer strategy) {
            this.strategy = strategy;
            return this;
        }
        public Integer getStrategy() {
            return this.strategy;
        }

        public ListDeviceDistributeJobResponseDataJobInfoItems setTargetInstanceConfigs(ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs targetInstanceConfigs) {
            this.targetInstanceConfigs = targetInstanceConfigs;
            return this;
        }
        public ListDeviceDistributeJobResponseDataJobInfoItemsTargetInstanceConfigs getTargetInstanceConfigs() {
            return this.targetInstanceConfigs;
        }

    }

    public static class ListDeviceDistributeJobResponseDataJobInfo extends TeaModel {
        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<ListDeviceDistributeJobResponseDataJobInfoItems> items;

        public static ListDeviceDistributeJobResponseDataJobInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseDataJobInfo self = new ListDeviceDistributeJobResponseDataJobInfo();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseDataJobInfo setItems(java.util.List<ListDeviceDistributeJobResponseDataJobInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDeviceDistributeJobResponseDataJobInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDeviceDistributeJobResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("JobInfo")
        @Validation(required = true)
        public ListDeviceDistributeJobResponseDataJobInfo jobInfo;

        public static ListDeviceDistributeJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDistributeJobResponseData self = new ListDeviceDistributeJobResponseData();
            return TeaModel.build(map, self);
        }

        public ListDeviceDistributeJobResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDeviceDistributeJobResponseData setJobInfo(ListDeviceDistributeJobResponseDataJobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public ListDeviceDistributeJobResponseDataJobInfo getJobInfo() {
            return this.jobInfo;
        }

    }

}
