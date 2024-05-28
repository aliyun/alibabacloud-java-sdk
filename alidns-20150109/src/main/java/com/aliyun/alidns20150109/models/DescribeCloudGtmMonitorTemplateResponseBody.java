// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmMonitorTemplateResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    @NameInMap("ExtendInfo")
    public String extendInfo;

    @NameInMap("FailureRate")
    public Integer failureRate;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IspCityNodes")
    public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes ispCityNodes;

    @NameInMap("Name")
    public String name;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeCloudGtmMonitorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmMonitorTemplateResponseBody self = new DescribeCloudGtmMonitorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setFailureRate(Integer failureRate) {
        this.failureRate = failureRate;
        return this;
    }
    public Integer getFailureRate() {
        return this.failureRate;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setIspCityNodes(DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeCloudGtmMonitorTemplateResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode self = new DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes self = new DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
