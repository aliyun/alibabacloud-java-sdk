// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushDeviceDataRequest extends TeaModel {
    /**
     * <p>The type of the device. [View device type definitions](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("deviceType")
    public String deviceType;

    /**
     * <p>List of devices to which data is pushed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("devices")
    public java.util.List<PushDeviceDataRequestDevices> devices;

    public static PushDeviceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDeviceDataRequest self = new PushDeviceDataRequest();
        return TeaModel.build(map, self);
    }

    public PushDeviceDataRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public PushDeviceDataRequest setDevices(java.util.List<PushDeviceDataRequestDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<PushDeviceDataRequestDevices> getDevices() {
        return this.devices;
    }

    public static class PushDeviceDataRequestDevices extends TeaModel {
        /**
         * <p>Measuring point information To avoid accuracy problems, the measurement point data is uniformly transmitted to the string. The function of missing required fields cannot be used normally. Some functions may be affected due to the lack of recommend fields. For details, please refer to the notes of equipment measuring points in the appendix. [Reference Point Definition](https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf</p>
         * <p>)</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        /**
         * <p>If the deviceType parameter is set to 12, 13, or 17, you must set the system_id parameter. The field name is still device_id. If the deviceType parameter is set to 15 or 16, no Other situations will be transmitted.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>Data generation time of measuring point.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("recordTime")
        public String recordTime;

        public static PushDeviceDataRequestDevices build(java.util.Map<String, ?> map) throws Exception {
            PushDeviceDataRequestDevices self = new PushDeviceDataRequestDevices();
            return TeaModel.build(map, self);
        }

        public PushDeviceDataRequestDevices setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public PushDeviceDataRequestDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public PushDeviceDataRequestDevices setRecordTime(String recordTime) {
            this.recordTime = recordTime;
            return this;
        }
        public String getRecordTime() {
            return this.recordTime;
        }

    }

}
