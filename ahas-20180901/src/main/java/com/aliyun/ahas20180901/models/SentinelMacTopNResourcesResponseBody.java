// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMacTopNResourcesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelMacTopNResourcesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMacTopNResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMacTopNResourcesResponseBody self = new SentinelMacTopNResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMacTopNResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMacTopNResourcesResponseBody setData(SentinelMacTopNResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelMacTopNResourcesResponseBodyData getData() {
        return this.data;
    }

    public SentinelMacTopNResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMacTopNResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMacTopNResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMacTopNResourcesResponseBodyDataMacMetrics extends TeaModel {
        @NameInMap("deviceConfigurationId")
        public String deviceConfigurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("parentIp")
        public String parentIp;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("resource")
        public String resource;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelMacTopNResourcesResponseBodyDataMacMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelMacTopNResourcesResponseBodyDataMacMetrics self = new SentinelMacTopNResourcesResponseBodyDataMacMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setDeviceConfigurationId(String deviceConfigurationId) {
            this.deviceConfigurationId = deviceConfigurationId;
            return this;
        }
        public String getDeviceConfigurationId() {
            return this.deviceConfigurationId;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelMacTopNResourcesResponseBodyDataMacMetrics setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelMacTopNResourcesResponseBodyDataMetrics extends TeaModel {
        @NameInMap("favorite")
        public Boolean favorite;

        @NameInMap("hasRule")
        public Boolean hasRule;

        @NameInMap("resource")
        public String resource;

        public static SentinelMacTopNResourcesResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelMacTopNResourcesResponseBodyDataMetrics self = new SentinelMacTopNResourcesResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelMacTopNResourcesResponseBodyDataMetrics setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public SentinelMacTopNResourcesResponseBodyDataMetrics setHasRule(Boolean hasRule) {
            this.hasRule = hasRule;
            return this;
        }
        public Boolean getHasRule() {
            return this.hasRule;
        }

        public SentinelMacTopNResourcesResponseBodyDataMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class SentinelMacTopNResourcesResponseBodyData extends TeaModel {
        @NameInMap("macMetrics")
        public java.util.List<SentinelMacTopNResourcesResponseBodyDataMacMetrics> macMetrics;

        @NameInMap("metrics")
        public java.util.List<SentinelMacTopNResourcesResponseBodyDataMetrics> metrics;

        @NameInMap("pageIndex")
        public Integer pageIndex;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static SentinelMacTopNResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMacTopNResourcesResponseBodyData self = new SentinelMacTopNResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMacTopNResourcesResponseBodyData setMacMetrics(java.util.List<SentinelMacTopNResourcesResponseBodyDataMacMetrics> macMetrics) {
            this.macMetrics = macMetrics;
            return this;
        }
        public java.util.List<SentinelMacTopNResourcesResponseBodyDataMacMetrics> getMacMetrics() {
            return this.macMetrics;
        }

        public SentinelMacTopNResourcesResponseBodyData setMetrics(java.util.List<SentinelMacTopNResourcesResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<SentinelMacTopNResourcesResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public SentinelMacTopNResourcesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public SentinelMacTopNResourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SentinelMacTopNResourcesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SentinelMacTopNResourcesResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
