// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    @Validation(required = true)
    public Long updateTimestamp;

    @NameInMap("ProtocolType")
    @Validation(required = true)
    public String protocolType;

    @NameInMap("Interval")
    @Validation(required = true)
    public Integer interval;

    @NameInMap("EvaluationCount")
    @Validation(required = true)
    public Integer evaluationCount;

    @NameInMap("Timeout")
    @Validation(required = true)
    public Integer timeout;

    @NameInMap("MonitorExtendInfo")
    @Validation(required = true)
    public String monitorExtendInfo;

    @NameInMap("IspCityNodes")
    @Validation(required = true)
    public DescribeGtmMonitorConfigResponseIspCityNodes ispCityNodes;

    public static DescribeGtmMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigResponse self = new DescribeGtmMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmMonitorConfigResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmMonitorConfigResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmMonitorConfigResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmMonitorConfigResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmMonitorConfigResponse setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeGtmMonitorConfigResponse setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeGtmMonitorConfigResponse setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeGtmMonitorConfigResponse setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeGtmMonitorConfigResponse setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeGtmMonitorConfigResponse setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeGtmMonitorConfigResponse setIspCityNodes(DescribeGtmMonitorConfigResponseIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeGtmMonitorConfigResponseIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public static class DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CountryName")
        @Validation(required = true)
        public String countryName;

        @NameInMap("CountryCode")
        @Validation(required = true)
        public String countryCode;

        @NameInMap("CityName")
        @Validation(required = true)
        public String cityName;

        @NameInMap("CityCode")
        @Validation(required = true)
        public String cityCode;

        @NameInMap("IspCode")
        @Validation(required = true)
        public String ispCode;

        @NameInMap("IspName")
        @Validation(required = true)
        public String ispName;

        public static DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode self = new DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeGtmMonitorConfigResponseIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode> ispCityNode;

        public static DescribeGtmMonitorConfigResponseIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmMonitorConfigResponseIspCityNodes self = new DescribeGtmMonitorConfigResponseIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeGtmMonitorConfigResponseIspCityNodes setIspCityNode(java.util.List<DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeGtmMonitorConfigResponseIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
