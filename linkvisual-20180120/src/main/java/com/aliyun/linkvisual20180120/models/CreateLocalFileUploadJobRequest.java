// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalFileUploadJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TimeSlot")
    public java.util.List<CreateLocalFileUploadJobRequestTimeSlot> timeSlot;

    public static CreateLocalFileUploadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalFileUploadJobRequest self = new CreateLocalFileUploadJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLocalFileUploadJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateLocalFileUploadJobRequest setTimeSlot(java.util.List<CreateLocalFileUploadJobRequestTimeSlot> timeSlot) {
        this.timeSlot = timeSlot;
        return this;
    }
    public java.util.List<CreateLocalFileUploadJobRequestTimeSlot> getTimeSlot() {
        return this.timeSlot;
    }

    public static class CreateLocalFileUploadJobRequestTimeSlot extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("StartTime")
        public Integer startTime;

        public static CreateLocalFileUploadJobRequestTimeSlot build(java.util.Map<String, ?> map) throws Exception {
            CreateLocalFileUploadJobRequestTimeSlot self = new CreateLocalFileUploadJobRequestTimeSlot();
            return TeaModel.build(map, self);
        }

        public CreateLocalFileUploadJobRequestTimeSlot setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public CreateLocalFileUploadJobRequestTimeSlot setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public CreateLocalFileUploadJobRequestTimeSlot setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public CreateLocalFileUploadJobRequestTimeSlot setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public CreateLocalFileUploadJobRequestTimeSlot setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

    }

}
