// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesRequest extends TeaModel {
    @NameInMap("DeviceName")
    public java.util.List<String> deviceName;

    @NameInMap("DeviceNameList")
    public java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> deviceNameList;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ProductKey of the product to which the devices belong.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static BatchCheckDeviceNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesRequest self = new BatchCheckDeviceNamesRequest();
        return TeaModel.build(map, self);
    }

    public BatchCheckDeviceNamesRequest setDeviceName(java.util.List<String> deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    public BatchCheckDeviceNamesRequest setDeviceNameList(java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> deviceNameList) {
        this.deviceNameList = deviceNameList;
        return this;
    }
    public java.util.List<BatchCheckDeviceNamesRequestDeviceNameList> getDeviceNameList() {
        return this.deviceNameList;
    }

    public BatchCheckDeviceNamesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchCheckDeviceNamesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public static class BatchCheckDeviceNamesRequestDeviceNameList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceNickname")
        public String deviceNickname;

        public static BatchCheckDeviceNamesRequestDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesRequestDeviceNameList self = new BatchCheckDeviceNamesRequestDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesRequestDeviceNameList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchCheckDeviceNamesRequestDeviceNameList setDeviceNickname(String deviceNickname) {
            this.deviceNickname = deviceNickname;
            return this;
        }
        public String getDeviceNickname() {
            return this.deviceNickname;
        }

    }

}
