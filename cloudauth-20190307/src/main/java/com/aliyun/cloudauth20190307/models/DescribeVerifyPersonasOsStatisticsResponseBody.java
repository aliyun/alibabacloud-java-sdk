// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyPersonasOsStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>123906BE-752B-51E3-A8FF-52F53B659CE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Processing result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyPersonasOsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyPersonasOsStatisticsResponseBody self = new DescribeVerifyPersonasOsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyPersonasOsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyPersonasOsStatisticsResponseBody setResultObject(DescribeVerifyPersonasOsStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyPersonasOsStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Total number of authenticated devices.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("AllDeviceCnt")
        public Long allDeviceCnt;

        /**
         * <p>Number of authenticated Android devices.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("DeviceAndroidCnt")
        public Long deviceAndroidCnt;

        /**
         * <p>Proportion of Android devices.</p>
         * 
         * <strong>example:</strong>
         * <p>58.33</p>
         */
        @NameInMap("DeviceAndroidRate")
        public String deviceAndroidRate;

        /**
         * <p>Number of authenticated iOS devices.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DeviceIosCnt")
        public Long deviceIosCnt;

        /**
         * <p>Proportion of iOS devices.</p>
         * 
         * <strong>example:</strong>
         * <p>41.67</p>
         */
        @NameInMap("DeviceIosRate")
        public String deviceIosRate;

        public static DescribeVerifyPersonasOsStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyPersonasOsStatisticsResponseBodyResultObject self = new DescribeVerifyPersonasOsStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject setAllDeviceCnt(Long allDeviceCnt) {
            this.allDeviceCnt = allDeviceCnt;
            return this;
        }
        public Long getAllDeviceCnt() {
            return this.allDeviceCnt;
        }

        public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject setDeviceAndroidCnt(Long deviceAndroidCnt) {
            this.deviceAndroidCnt = deviceAndroidCnt;
            return this;
        }
        public Long getDeviceAndroidCnt() {
            return this.deviceAndroidCnt;
        }

        public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject setDeviceAndroidRate(String deviceAndroidRate) {
            this.deviceAndroidRate = deviceAndroidRate;
            return this;
        }
        public String getDeviceAndroidRate() {
            return this.deviceAndroidRate;
        }

        public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject setDeviceIosCnt(Long deviceIosCnt) {
            this.deviceIosCnt = deviceIosCnt;
            return this;
        }
        public Long getDeviceIosCnt() {
            return this.deviceIosCnt;
        }

        public DescribeVerifyPersonasOsStatisticsResponseBodyResultObject setDeviceIosRate(String deviceIosRate) {
            this.deviceIosRate = deviceIosRate;
            return this;
        }
        public String getDeviceIosRate() {
            return this.deviceIosRate;
        }

    }

}
