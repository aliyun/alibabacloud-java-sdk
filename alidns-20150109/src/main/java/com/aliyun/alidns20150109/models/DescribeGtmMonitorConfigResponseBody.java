// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("IspCityNodes")
    public DescribeGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("Interval")
    public Integer interval;

    public static DescribeGtmMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigResponseBody self = new DescribeGtmMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmMonitorConfigResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeGtmMonitorConfigResponseBody setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeGtmMonitorConfigResponseBody setIspCityNodes(DescribeGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeGtmMonitorConfigResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeGtmMonitorConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmMonitorConfigResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmMonitorConfigResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeGtmMonitorConfigResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmMonitorConfigResponseBody setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeGtmMonitorConfigResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmMonitorConfigResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmMonitorConfigResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public static class DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode self = new DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeGtmMonitorConfigResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeGtmMonitorConfigResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseBodyIspCityNodes self = new DescribeGtmMonitorConfigResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorConfigResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
