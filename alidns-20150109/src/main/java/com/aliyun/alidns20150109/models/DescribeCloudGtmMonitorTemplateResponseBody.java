// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmMonitorTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-23T13:09Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("ExtendInfo")
    public String extendInfo;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("FailureRate")
    public Integer failureRate;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("IspCityNodes")
    public DescribeCloudGtmMonitorTemplateResponseBodyIspCityNodes ispCityNodes;

    /**
     * <strong>example:</strong>
     * <p>Ping-IPv4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>ping</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>6AEC7A64-3CB1-4C49-8B35-0B901F1E26BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>mtp-89518052425100**80</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <strong>example:</strong>
     * <p>2024-03-29T13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <strong>example:</strong>
         * <p>465</p>
         */
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
