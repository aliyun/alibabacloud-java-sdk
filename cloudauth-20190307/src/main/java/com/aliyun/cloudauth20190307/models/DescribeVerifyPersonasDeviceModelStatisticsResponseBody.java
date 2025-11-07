// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasDeviceModelStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>026828A3-CC7E-5D85-85B6-08DF245C5A53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Query result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyPersonasDeviceModelStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasDeviceModelStatisticsResponseBody self = new DescribeVerifyPersonasDeviceModelStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasDeviceModelStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyPersonasDeviceModelStatisticsResponseBody setResultObject(DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems extends TeaModel {
        /**
         * <p>Number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DeviceCnt")
        public Long deviceCnt;

        /**
         * <p>Device model</p>
         * 
         * <strong>example:</strong>
         * <p>iPhone15,2</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <p>The ratio of this device model to the total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>16.13</p>
         */
        @NameInMap("DeviceRate")
        public String deviceRate;

        public static DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems self = new DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems setDeviceCnt(Long deviceCnt) {
            this.deviceCnt = deviceCnt;
            return this;
        }
        public Long getDeviceCnt() {
            return this.deviceCnt;
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems setDeviceRate(String deviceRate) {
            this.deviceRate = deviceRate;
            return this;
        }
        public String getDeviceRate() {
            return this.deviceRate;
        }

    }

    public static class DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Total number of devices.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("AllDeviceCnt")
        public Long allDeviceCnt;

        /**
         * <p>List of data for different phone models.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems> items;

        public static DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject self = new DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject setAllDeviceCnt(Long allDeviceCnt) {
            this.allDeviceCnt = allDeviceCnt;
            return this;
        }
        public Long getAllDeviceCnt() {
            return this.allDeviceCnt;
        }

        public DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObject setItems(java.util.List<DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyPersonasDeviceModelStatisticsResponseBodyResultObjectItems> getItems() {
            return this.items;
        }

    }

}
