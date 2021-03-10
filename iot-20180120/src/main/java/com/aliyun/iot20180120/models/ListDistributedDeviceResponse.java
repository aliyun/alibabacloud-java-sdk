// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceResponse extends TeaModel {
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
    public ListDistributedDeviceResponseData data;

    public static ListDistributedDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedDeviceResponse self = new ListDistributedDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListDistributedDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributedDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributedDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributedDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDistributedDeviceResponse setData(ListDistributedDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public ListDistributedDeviceResponseData getData() {
        return this.data;
    }

    public static class ListDistributedDeviceResponseDataInfoItems extends TeaModel {
        @NameInMap("SourceUid")
        @Validation(required = true)
        public String sourceUid;

        @NameInMap("TargetUid")
        @Validation(required = true)
        public String targetUid;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("SourceInstanceId")
        @Validation(required = true)
        public String sourceInstanceId;

        @NameInMap("TargetInstanceId")
        @Validation(required = true)
        public String targetInstanceId;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("TargetAliyunId")
        @Validation(required = true)
        public String targetAliyunId;

        @NameInMap("SourceRegion")
        @Validation(required = true)
        public String sourceRegion;

        @NameInMap("TargetRegion")
        @Validation(required = true)
        public String targetRegion;

        @NameInMap("SourceInstanceName")
        @Validation(required = true)
        public String sourceInstanceName;

        @NameInMap("TargetInstanceName")
        @Validation(required = true)
        public String targetInstanceName;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        public static ListDistributedDeviceResponseDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseDataInfoItems self = new ListDistributedDeviceResponseDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseDataInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDistributedDeviceResponseDataInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDistributedDeviceResponseDataInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDistributedDeviceResponseDataInfoItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDistributedDeviceResponseDataInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDistributedDeviceResponseDataInfoItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDistributedDeviceResponseDataInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributedDeviceResponseDataInfoItems setTargetAliyunId(String targetAliyunId) {
            this.targetAliyunId = targetAliyunId;
            return this;
        }
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        public ListDistributedDeviceResponseDataInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDistributedDeviceResponseDataInfoItems setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public ListDistributedDeviceResponseDataInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDistributedDeviceResponseDataInfoItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListDistributedDeviceResponseDataInfoItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListDistributedDeviceResponseDataInfo extends TeaModel {
        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<ListDistributedDeviceResponseDataInfoItems> items;

        public static ListDistributedDeviceResponseDataInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseDataInfo self = new ListDistributedDeviceResponseDataInfo();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseDataInfo setItems(java.util.List<ListDistributedDeviceResponseDataInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDistributedDeviceResponseDataInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDistributedDeviceResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("Info")
        @Validation(required = true)
        public ListDistributedDeviceResponseDataInfo info;

        public static ListDistributedDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseData self = new ListDistributedDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDistributedDeviceResponseData setInfo(ListDistributedDeviceResponseDataInfo info) {
            this.info = info;
            return this;
        }
        public ListDistributedDeviceResponseDataInfo getInfo() {
            return this.info;
        }

    }

}
