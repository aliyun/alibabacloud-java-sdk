// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class PushDeviceDataRequest extends TeaModel {
    /**
     * <p>The type of the device. <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf">View device type definitions</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deviceType")
    public String deviceType;

    /**
     * <p>List of devices to which data is pushed.</p>
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
         * <p>Measuring point information To avoid accuracy problems, the measurement point data is uniformly transmitted to the string. The function of missing required fields cannot be used normally. Some functions may be affected due to the lack of recommend fields. For details, please refer to the notes of equipment measuring points in the appendix. <a href="https://carbon-doc.oss-cn-hangzhou.aliyuncs.com/Deviceappendixes-en.pdf">Reference Point Definition</a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;dp_imp&quot;: &quot;329.0&quot;,
         *             &quot;F&quot;: &quot;148.0&quot;,
         *             &quot;eq_imp&quot;: &quot;363.0&quot;,
         *             &quot;Ep_imp_1&quot;: &quot;128.0&quot;,
         *             &quot;Ep_imp_2&quot;: &quot;157.0&quot;,
         *             &quot;Ua&quot;: &quot;226.0&quot;,
         *             &quot;Ub&quot;: &quot;285.0&quot;,
         *             &quot;Ep_imp&quot;: &quot;325.0&quot;,
         *             &quot;Uc&quot;: &quot;342.0&quot;,
         *             &quot;Ep_imp_3&quot;: &quot;109.0&quot;,
         *             &quot;Ep_imp_4&quot;: &quot;94.0&quot;,
         *             &quot;P&quot;: &quot;514.0&quot;,
         *             &quot;Pa&quot;: &quot;443.0&quot;,
         *             &quot;Q&quot;: &quot;265.0&quot;,
         *             &quot;dp_exp&quot;: &quot;261.0&quot;,
         *             &quot;eq_exp&quot;: &quot;399.0&quot;,
         *             &quot;COSQ&quot;: &quot;223.0&quot;,
         *             &quot;Ia&quot;: &quot;240.0&quot;,
         *             &quot;Ib&quot;: &quot;216.0&quot;,
         *             &quot;Ic&quot;: &quot;229.0&quot;,
         *             &quot;Ep_exp&quot;: &quot;115.0&quot;,
         *             &quot;VdisPer&quot;: &quot;120.0&quot;
         *         }</p>
         */
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        /**
         * <p>If the deviceType parameter is set to 12, 13, or 17, you must set the system_id parameter. The field name is still device_id. If the deviceType parameter is set to 15 or 16, no Other situations will be transmitted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device_code_xxx</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <p>Data generation time of measuring point.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-08 18:40:00</p>
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
