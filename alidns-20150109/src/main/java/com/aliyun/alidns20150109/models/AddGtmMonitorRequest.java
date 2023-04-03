// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the address pool.</p>
     */
    @NameInMap("AddrPoolId")
    public String addrPoolId;

    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds. Set the value to 60.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The monitored nodes.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<AddGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The extended information, that is, the parameters required for the protocol. Different protocols require different parameters:</p>
     * <br>
     * <p>HTTP or HTTPS:</p>
     * <br>
     * <p>*   port: the port to check.</p>
     * <p>*   failureRate: the failure rate.</p>
     * <p>*   code: the status code threshold. If the returned status code is greater than the specified threshold, the application service is deemed abnormal. Valid values: 400 and 500.</p>
     * <p>*   host: the host configuration.</p>
     * <p>*   path: the health check URL.</p>
     * <br>
     * <p>PING:</p>
     * <br>
     * <p>*   packetNum: the number of ping packets.</p>
     * <p>*   packetLossRate: the loss rate of ping packets.</p>
     * <p>*   failureRate: the failure rate.</p>
     * <br>
     * <p>TCP:</p>
     * <br>
     * <p>*   port: the port to check.</p>
     * <p>*   failureRate: the failure rate.</p>
     */
    @NameInMap("MonitorExtendInfo")
    public String monitorExtendInfo;

    /**
     * <p>The protocol used for the health check. Valid values:</p>
     * <br>
     * <p>*   HTTP</p>
     * <p>*   HTTPS</p>
     * <p>*   PING</p>
     * <p>*   TCP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The health check timeout period. Unit: milliseconds. Valid values: 2000, 3000, 5000, and 10000.</p>
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
         * <p>The code of the city where the monitored node is deployed.</p>
         * <br>
         * <p>For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs. For more information about specific values, see the response parameters of DescribeGtmMonitorAvailableConfig.</p>
         * <br>
         * <p>*   If the value of the GroupType parameter is BGP or OVERSEAS, IspCode is optional. The default value is 465.</p>
         * <p>*   If the value of the GroupType parameter is not BGP or OVERSEAS, IspCode is required and is used together with CityCode.</p>
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
