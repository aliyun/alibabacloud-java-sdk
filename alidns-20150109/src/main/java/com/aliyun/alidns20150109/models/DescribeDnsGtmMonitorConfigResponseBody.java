// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmMonitorConfigResponseBody extends TeaModel {
    /**
     * <p>The time when the configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-28T13:08Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The timestamp that indicates when the configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The number of consecutive failures.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IspCityNodes")
    public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes;

    /**
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Monit*********</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information. The parameters vary by protocol.</p>
     * <ul>
     * <li><p>For HTTP and HTTPS:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>host: The Host header.</p>
     * </li>
     * <li><p>path: The URL path.</p>
     * </li>
     * <li><p>code: The expected HTTP status code.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>sni: Specifies whether to enable Server Name Indication (SNI). This parameter is valid only when the protocol is set to HTTPS.</p>
     * <ul>
     * <li><p>true: enables SNI.</p>
     * </li>
     * <li><p>false: disables SNI.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>nodeType: The type of the monitoring node for the health check when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>For PING:</p>
     * <ul>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>packetNum: The number of ping packets.</p>
     * </li>
     * <li><p>packetLossRate: The packet loss rate.</p>
     * </li>
     * <li><p>nodeType: The type of the monitoring node for the health check when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><p>For TCP:</p>
     * <ul>
     * <li><p>port: The health check port.</p>
     * </li>
     * <li><p>failureRate: The failure rate.</p>
     * </li>
     * <li><p>nodeType: The type of the monitoring node for the health check when the address pool type is DOMAIN.</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;\\index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The health check protocol. Valid values:</p>
     * <ul>
     * <li><p>HTTP</p>
     * </li>
     * <li><p>HTTPS</p>
     * </li>
     * <li><p>PING</p>
     * </li>
     * <li><p>TCP</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The time when the configuration was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-01-03T08:57Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The timestamp that indicates when the configuration was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeDnsGtmMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmMonitorConfigResponseBody self = new DescribeDnsGtmMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmMonitorConfigResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setIspCityNodes(DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes ispCityNodes) {
        this.ispCityNodes = ispCityNodes;
        return this;
    }
    public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeDnsGtmMonitorConfigResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("CountryName")
        public String countryName;

        @NameInMap("IspCode")
        public String ispCode;

        @NameInMap("IspName")
        public String ispName;

        public static DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode self = new DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

    }

    public static class DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
        public java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode;

        public static DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes self = new DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmMonitorConfigResponseBodyIspCityNodes setIspCityNode(java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> ispCityNode) {
            this.ispCityNode = ispCityNode;
            return this;
        }
        public java.util.List<DescribeDnsGtmMonitorConfigResponseBodyIspCityNodesIspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

    }

}
