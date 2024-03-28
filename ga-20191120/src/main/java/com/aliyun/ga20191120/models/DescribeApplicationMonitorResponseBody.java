// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeApplicationMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance on which the origin probing task ran.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The URL or IP address that was probed.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>Indicates whether the automatic diagnostics feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("DetectEnable")
    public Boolean detectEnable;

    /**
     * <p>The threshold that is used to trigger automatic diagnostics.</p>
     * <br>
     * <p>If the availability of the origin server drops below the specified threshold, the automatic diagnostics feature is triggered.</p>
     */
    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    /**
     * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature is triggered.</p>
     */
    @NameInMap("DetectTimes")
    public Integer detectTimes;

    /**
     * <p>The probe points of the Internet service provider (ISP).</p>
     */
    @NameInMap("IspCityList")
    public java.util.List<DescribeApplicationMonitorResponseBodyIspCityList> ispCityList;

    /**
     * <p>The ID of the listener on which the origin probing task ran.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers automatic diagnostics, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.</p>
     * <br>
     * <p>If the number of consecutive times that the availability rate drops below the automatic diagnostics threshold reaches the value of **DetectTimes**, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period regardless of whether the availability rate remains below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The status of the origin probing task. Valid values:</p>
     * <br>
     * <p>*   **init**</p>
     * <p>*   **active**</p>
     * <p>*   **updating**</p>
     * <p>*   **inactive**</p>
     * <p>*   **deleting**</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The ID of the origin probing task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the origin probing task.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeApplicationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationMonitorResponseBody self = new DescribeApplicationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationMonitorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DescribeApplicationMonitorResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeApplicationMonitorResponseBody setDetectEnable(Boolean detectEnable) {
        this.detectEnable = detectEnable;
        return this;
    }
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    public DescribeApplicationMonitorResponseBody setDetectThreshold(Integer detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    public DescribeApplicationMonitorResponseBody setDetectTimes(Integer detectTimes) {
        this.detectTimes = detectTimes;
        return this;
    }
    public Integer getDetectTimes() {
        return this.detectTimes;
    }

    public DescribeApplicationMonitorResponseBody setIspCityList(java.util.List<DescribeApplicationMonitorResponseBodyIspCityList> ispCityList) {
        this.ispCityList = ispCityList;
        return this;
    }
    public java.util.List<DescribeApplicationMonitorResponseBodyIspCityList> getIspCityList() {
        return this.ispCityList;
    }

    public DescribeApplicationMonitorResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeApplicationMonitorResponseBody setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public DescribeApplicationMonitorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApplicationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationMonitorResponseBody setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public DescribeApplicationMonitorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeApplicationMonitorResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeApplicationMonitorResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class DescribeApplicationMonitorResponseBodyIspCityList extends TeaModel {
        /**
         * <p>The ID of the city in which the probe point of the ISP is deployed.</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The name of the city in which the probe point of the ISP is deployed.</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The probe point ID of the ISP.</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The probe point name of the ISP.</p>
         */
        @NameInMap("IspName")
        public String ispName;

        public static DescribeApplicationMonitorResponseBodyIspCityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationMonitorResponseBodyIspCityList self = new DescribeApplicationMonitorResponseBodyIspCityList();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationMonitorResponseBodyIspCityList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeApplicationMonitorResponseBodyIspCityList setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeApplicationMonitorResponseBodyIspCityList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeApplicationMonitorResponseBodyIspCityList setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

}
