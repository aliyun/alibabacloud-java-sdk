// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The number of consecutive failures.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds. Set the value to 60.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The nodes for monitoring.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The extended information. The required parameters vary based on the health check protocol.</p>
     * <p>HTTP or HTTPS</p>
     * <ul>
     * <li>port: the port that you want to check</li>
     * <li>failureRate: the failure rate</li>
     * <li>code: the return code. The health check result is deemed abnormal if the returned value is greater than the specified value. Valid values: 400 and 500.</li>
     * <li>host: the host settings</li>
     * <li>path: the URL path</li>
     * </ul>
     * <p>PING</p>
     * <ul>
     * <li>packetNum: the number of ping packets</li>
     * <li>packetLossRate: the packet loss rate</li>
     * <li>failureRate: the failure rate</li>
     * </ul>
     * <p>TCP</p>
     * <ul>
     * <li>port: the port that you want to check</li>
     * <li>failureRate: the failure rate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;code\&quot;:200,\&quot;path\&quot;:\&quot;/index.htm\&quot;,\&quot;host\&quot;:\&quot;aliyun.com\&quot;}</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The protocol used for the health check. Valid values:</p>
     * <ul>
     * <li>HTTP</li>
     * <li>HTTPS</li>
     * <li>PING</li>
     * <li>TCP</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static AddGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorRequest self = new AddGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorRequest setAddrPoolId(String addrPoolId) {
        this.addrPoolId = addrPoolId;
        return this;
    }
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    public AddGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public AddGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public AddGtmMonitorRequest setIspCityNode(java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<AddGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public AddGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public AddGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public AddGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class AddGtmMonitorRequestIspCityNode extends TeaModel {
        /**
         * <p>The city code.</p>
         * <p>Specify the parameter according to the value of CityCode returned by the DescribeGtmMonitorAvailableConfig operation.</p>
         * 
         * <strong>example:</strong>
         * <p>503</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The Internet service provider (ISP) node. Specify the parameter according to the value of IspCode returned by the DescribeGtmMonitorAvailableConfig operation.</p>
         * <ul>
         * <li>If the return value of GroupType for the DescribeGtmMonitorAvailableConfig operation is BGP or Overseas, IspCode is not required and is set to 465 by default.</li>
         * <li>If the return value of GroupType for the DescribeGtmMonitorAvailableConfig operation is not BGP or Overseas, IspCode is required. When IspCode is specified, CityCode is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>465</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static AddGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            AddGtmMonitorRequestIspCityNode self = new AddGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public AddGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public AddGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
