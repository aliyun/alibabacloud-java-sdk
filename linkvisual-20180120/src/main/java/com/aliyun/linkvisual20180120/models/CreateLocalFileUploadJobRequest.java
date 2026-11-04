// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalFileUploadJobRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify the ID. Otherwise, the call fails.</li>
     * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The list of time slots.</p>
     */
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
        /**
         * <p>The name of the video device.
         * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The end time for uploading the local video recording. The time is a 10-digit UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>The maximum time range for a single local video recording upload job is 1 hour.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1631019775</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <p>The ID of the video device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d7XmBoJhAr88C6PelXDF00****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ProductKey of the product to which the video device belongs.
         * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The start time for uploading the local video recording. The time is a 10-digit UNIX timestamp in seconds.</p>
         * <blockquote>
         * <p>The maximum time range for a single local video recording upload job is 1 hour.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1631019675</p>
         */
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
