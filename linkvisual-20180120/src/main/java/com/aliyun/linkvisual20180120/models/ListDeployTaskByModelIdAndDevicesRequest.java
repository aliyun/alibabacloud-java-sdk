// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class ListDeployTaskByModelIdAndDevicesRequest extends TeaModel {
    @NameInMap("ModelId")
    @Validation(required = true)
    public Integer modelId;

    @NameInMap("DeviceList")
    @Validation(required = true)
    public java.util.List<ListDeployTaskByModelIdAndDevicesRequestDeviceList> deviceList;

    public static ListDeployTaskByModelIdAndDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeployTaskByModelIdAndDevicesRequest self = new ListDeployTaskByModelIdAndDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeployTaskByModelIdAndDevicesRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public ListDeployTaskByModelIdAndDevicesRequest setDeviceList(java.util.List<ListDeployTaskByModelIdAndDevicesRequestDeviceList> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<ListDeployTaskByModelIdAndDevicesRequestDeviceList> getDeviceList() {
        return this.deviceList;
    }

    public static class ListDeployTaskByModelIdAndDevicesRequestDeviceList extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        public static ListDeployTaskByModelIdAndDevicesRequestDeviceList build(java.util.Map<String, ?> map) throws Exception {
            ListDeployTaskByModelIdAndDevicesRequestDeviceList self = new ListDeployTaskByModelIdAndDevicesRequestDeviceList();
            return TeaModel.build(map, self);
        }

        public ListDeployTaskByModelIdAndDevicesRequestDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListDeployTaskByModelIdAndDevicesRequestDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDeployTaskByModelIdAndDevicesRequestDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

}
