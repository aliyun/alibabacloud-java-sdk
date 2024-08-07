// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorConfigResponseBody extends TeaModel {
    /**
     * <p>The time when the health check configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-28T13:08Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp that indicates the time when the health check configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds. The value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The monitored nodes.</p>
     */
    @NameInMap("IspCityNodes")
    public DescribeGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes;

    /**
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abc</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
     * <p>HTTP or HTTPS:</p>
     * <ul>
     * <li>port: the port to check.</li>
     * <li>failureRate: the failure rate.</li>
     * <li>code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal. Valid values: 400 and 500.</li>
     * <li>host: the host configuration.</li>
     * <li>path: the health check URL.</li>
     * </ul>
     * <p>PING:</p>
     * <ul>
     * <li>packetNum: the number of ping packets.</li>
     * <li>packetLossRate: the loss rate of ping packets.</li>
     * <li>failureRate: the failure rate.</li>
     * </ul>
     * <p>TCP:</p>
     * <ul>
     * <li>port: the port to check.</li>
     * <li>failureRate: the failure rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The protocol used for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The time when the health check configuration was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-28T13:08Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The timestamp that indicates the time when the health check configuration was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeGtmMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorConfigResponseBody self = new DescribeGtmMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmMonitorConfigResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmMonitorConfigResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeGtmMonitorConfigResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeGtmMonitorConfigResponseBody setIspCityNodes(DescribeGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeGtmMonitorConfigResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeGtmMonitorConfigResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeGtmMonitorConfigResponseBody setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeGtmMonitorConfigResponseBody setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
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

    public DescribeGtmMonitorConfigResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeGtmMonitorConfigResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeGtmMonitorConfigResponseBodyIspCityNodesIspCityNode extends TeaModel {
        /**
         * <p>The code of the city where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The display name of the city where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhangjiakou</p>
         */
        @NameInMap("CityName")
        public String cityName;

        /**
         * <p>The code of the country where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The display name of the country where the monitored node is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        /**
         * <p>The display name of the ISP to which the monitored node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
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
