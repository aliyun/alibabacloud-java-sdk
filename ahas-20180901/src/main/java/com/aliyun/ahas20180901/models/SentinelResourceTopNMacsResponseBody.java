// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelResourceTopNMacsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelResourceTopNMacsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelResourceTopNMacsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelResourceTopNMacsResponseBody self = new SentinelResourceTopNMacsResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelResourceTopNMacsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelResourceTopNMacsResponseBody setData(SentinelResourceTopNMacsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelResourceTopNMacsResponseBodyData getData() {
        return this.data;
    }

    public SentinelResourceTopNMacsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelResourceTopNMacsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelResourceTopNMacsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelResourceTopNMacsResponseBodyDataMacMetrics extends TeaModel {
        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("deviceConfigurationId")
        public String deviceConfigurationId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("parentIp")
        public String parentIp;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelResourceTopNMacsResponseBodyDataMacMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelResourceTopNMacsResponseBodyDataMacMetrics self = new SentinelResourceTopNMacsResponseBodyDataMacMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setDeviceConfigurationId(String deviceConfigurationId) {
            this.deviceConfigurationId = deviceConfigurationId;
            return this;
        }
        public String getDeviceConfigurationId() {
            return this.deviceConfigurationId;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelResourceTopNMacsResponseBodyDataMacMetrics setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelResourceTopNMacsResponseBodyDataMetrics extends TeaModel {
        @NameInMap("favorite")
        public Boolean favorite;

        @NameInMap("hasRule")
        public Boolean hasRule;

        @NameInMap("resource")
        public String resource;

        public static SentinelResourceTopNMacsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelResourceTopNMacsResponseBodyDataMetrics self = new SentinelResourceTopNMacsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelResourceTopNMacsResponseBodyDataMetrics setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public SentinelResourceTopNMacsResponseBodyDataMetrics setHasRule(Boolean hasRule) {
            this.hasRule = hasRule;
            return this;
        }
        public Boolean getHasRule() {
            return this.hasRule;
        }

        public SentinelResourceTopNMacsResponseBodyDataMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

    public static class SentinelResourceTopNMacsResponseBodyData extends TeaModel {
        @NameInMap("macMetrics")
        public java.util.List<SentinelResourceTopNMacsResponseBodyDataMacMetrics> macMetrics;

        @NameInMap("metrics")
        public java.util.List<SentinelResourceTopNMacsResponseBodyDataMetrics> metrics;

        @NameInMap("pageIndex")
        public Integer pageIndex;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static SentinelResourceTopNMacsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelResourceTopNMacsResponseBodyData self = new SentinelResourceTopNMacsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelResourceTopNMacsResponseBodyData setMacMetrics(java.util.List<SentinelResourceTopNMacsResponseBodyDataMacMetrics> macMetrics) {
            this.macMetrics = macMetrics;
            return this;
        }
        public java.util.List<SentinelResourceTopNMacsResponseBodyDataMacMetrics> getMacMetrics() {
            return this.macMetrics;
        }

        public SentinelResourceTopNMacsResponseBodyData setMetrics(java.util.List<SentinelResourceTopNMacsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<SentinelResourceTopNMacsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public SentinelResourceTopNMacsResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public SentinelResourceTopNMacsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SentinelResourceTopNMacsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SentinelResourceTopNMacsResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
