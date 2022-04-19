// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeApplicationMonitorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("Address")
    public String address;

    @NameInMap("DetectEnable")
    public Boolean detectEnable;

    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    @NameInMap("DetectTimes")
    public Integer detectTimes;

    @NameInMap("IspCityList")
    public java.util.List<DescribeApplicationMonitorResponseBodyIspCityList> ispCityList;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SilenceTime")
    public Integer silenceTime;

    @NameInMap("TaskId")
    public String taskId;

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
        @NameInMap("City")
        public String city;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("Isp")
        public String isp;

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
