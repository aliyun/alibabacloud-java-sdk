// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigResponse extends TeaModel {
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
    public DescribeDnsGtmMonitorConfigResponseIspCityNodes ispCityNodes;

    public static DescribeDnsGtmMonitorConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorConfigResponse self = new DescribeDnsGtmMonitorConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorConfigResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeDnsGtmMonitorConfigResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmMonitorConfigResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmMonitorConfigResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDnsGtmMonitorConfigResponse setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public DescribeDnsGtmMonitorConfigResponse setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDnsGtmMonitorConfigResponse setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDnsGtmMonitorConfigResponse setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeDnsGtmMonitorConfigResponse setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeDnsGtmMonitorConfigResponse setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeDnsGtmMonitorConfigResponse setIspCityNodes(DescribeDnsGtmMonitorConfigResponseIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorConfigResponseIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public static class DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode extends TeaModel {
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

        public static DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode self = new DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorConfigResponseIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode> ispCityNode;

        public static DescribeDnsGtmMonitorConfigResponseIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseIspCityNodes self = new DescribeDnsGtmMonitorConfigResponseIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseIspCityNodes setIspCityNode(java.util.List<DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorConfigResponseIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
