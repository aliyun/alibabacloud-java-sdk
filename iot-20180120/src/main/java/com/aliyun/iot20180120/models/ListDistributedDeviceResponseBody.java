// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public ListDistributedDeviceResponseBodyData data;

    public static ListDistributedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedDeviceResponseBody self = new ListDistributedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDistributedDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDistributedDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributedDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDistributedDeviceResponseBody setData(ListDistributedDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDistributedDeviceResponseBodyData getData() {
        return this.data;
    }

    public static class ListDistributedDeviceResponseBodyDataInfoItems extends TeaModel {
        @NameInMap("SourceUid")
        public String sourceUid;

        @NameInMap("TargetUid")
        public String targetUid;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("TargetAliyunId")
        public String targetAliyunId;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("TargetRegion")
        public String targetRegion;

        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("GmtModified")
        public Long gmtModified;

        public static ListDistributedDeviceResponseBodyDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseBodyDataInfoItems self = new ListDistributedDeviceResponseBodyDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetAliyunId(String targetAliyunId) {
            this.targetAliyunId = targetAliyunId;
            return this;
        }
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

    public static class ListDistributedDeviceResponseBodyDataInfo extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListDistributedDeviceResponseBodyDataInfoItems> items;

        public static ListDistributedDeviceResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseBodyDataInfo self = new ListDistributedDeviceResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseBodyDataInfo setItems(java.util.List<ListDistributedDeviceResponseBodyDataInfoItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDistributedDeviceResponseBodyDataInfoItems> getItems() {
            return this.items;
        }

    }

    public static class ListDistributedDeviceResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("Info")
        public ListDistributedDeviceResponseBodyDataInfo info;

        public static ListDistributedDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseBodyData self = new ListDistributedDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public ListDistributedDeviceResponseBodyData setInfo(ListDistributedDeviceResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public ListDistributedDeviceResponseBodyDataInfo getInfo() {
            return this.info;
        }

    }

}
