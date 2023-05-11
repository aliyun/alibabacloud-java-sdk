// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDistributedDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The products returned if the call is successful. For more information, see **Info**.</p>
     */
    @NameInMap("Data")
    public ListDistributedDeviceResponseBodyData data;

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

    public static ListDistributedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDistributedDeviceResponseBody self = new ListDistributedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDistributedDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDistributedDeviceResponseBody setData(ListDistributedDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDistributedDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListDistributedDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class ListDistributedDeviceResponseBodyDataInfoItems extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The time when the distribution task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the distribution task was modified.</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

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
         * <p>The source region in which the device resides.</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <p>The ID of the Alibaba Cloud account that distributes the device.</p>
         * <br>
         * <p>You can only distribute devices across regions and instances by using the same Alibaba cloud account. The value of this parameter is the same as the value of the **TargetUid** parameter.</p>
         */
        @NameInMap("SourceUid")
        public String sourceUid;

        /**
         * <p>The Alibaba Cloud account to which the device is distributed.</p>
         */
        @NameInMap("TargetAliyunId")
        public String targetAliyunId;

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
         * <p>The destination region to which the device is distributed.</p>
         */
        @NameInMap("TargetRegion")
        public String targetRegion;

        /**
         * <p>The Alibaba Cloud account to which the device is distributed.</p>
         * <br>
         * <p>You can only distribute devices across regions and instances by using the same Alibaba cloud account. The value of this parameter is the same as the value of the **TargetUid** parameter.</p>
         */
        @NameInMap("TargetUid")
        public String targetUid;

        public static ListDistributedDeviceResponseBodyDataInfoItems build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseBodyDataInfoItems self = new ListDistributedDeviceResponseBodyDataInfoItems();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setSourceUid(String sourceUid) {
            this.sourceUid = sourceUid;
            return this;
        }
        public String getSourceUid() {
            return this.sourceUid;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetAliyunId(String targetAliyunId) {
            this.targetAliyunId = targetAliyunId;
            return this;
        }
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetRegion(String targetRegion) {
            this.targetRegion = targetRegion;
            return this;
        }
        public String getTargetRegion() {
            return this.targetRegion;
        }

        public ListDistributedDeviceResponseBodyDataInfoItems setTargetUid(String targetUid) {
            this.targetUid = targetUid;
            return this;
        }
        public String getTargetUid() {
            return this.targetUid;
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
        /**
         * <p>The information about the device.</p>
         */
        @NameInMap("Info")
        public ListDistributedDeviceResponseBodyDataInfo info;

        /**
         * <p>The total number of returned devices.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListDistributedDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDistributedDeviceResponseBodyData self = new ListDistributedDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDistributedDeviceResponseBodyData setInfo(ListDistributedDeviceResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public ListDistributedDeviceResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public ListDistributedDeviceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
