// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmMonitorRequest extends TeaModel {
    /**
     * <p>The maximum number of consecutive exceptions detected. If the number of consecutive exceptions detected reaches the maximum number, the application service is deemed abnormal.</p>
     */
    @NameInMap("EvaluationCount")
    public Integer evaluationCount;

    /**
     * <p>The health check interval. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The monitored nodes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IspCityNode")
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check configuration.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The extended information. The required parameters vary based on the health check protocol.</p>
     * <br>
     * <p>*   HTTP or HTTPS</p>
     * <br>
     * <p>    *   port: the port that you want to check</p>
     * <br>
     * <p>    *   host: the host settings</p>
     * <br>
     * <p>    *   path: the URL path</p>
     * <br>
     * <p>    *   code: the return code. If the return value of code is greater than the specified value, the health check result is deemed abnormal. For example, if code is set to 400 and the code 404 is returned, the health check result is deemed abnormal.</p>
     * <br>
     * <p>    *   failureRate: the failure rate</p>
     * <br>
     * <p>    *   sni: specifies whether to enable server name indication (SNI). This parameter is available only when ProtocolType is set to HTTPS. Valid values:</p>
     * <br>
     * <p>        *   true: enables SNI.</p>
     * <p>        *   false: disables SNI.</p>
     * <br>
     * <p>    *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>*   PING</p>
     * <br>
     * <p>    *   failureRate: the failure rate</p>
     * <br>
     * <p>    *   packetNum: the number of ping packets</p>
     * <br>
     * <p>    *   packetLossRate: the loss rate of ping packets</p>
     * <br>
     * <p>    *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>*   TCP</p>
     * <br>
     * <p>    *   port: the port that you want to check</p>
     * <br>
     * <p>    *   failureRate: the failure rate</p>
     * <br>
     * <p>    *   nodeType: the type of the monitoring node when the address pool type is domain name. Valid values:</p>
     * <br>
     * <p>        *   IPV4</p>
     * <p>        *   IPV6</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The health check timeout period. Unit: milliseconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static UpdateDnsGtmMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmMonitorRequest self = new UpdateDnsGtmMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmMonitorRequest setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public UpdateDnsGtmMonitorRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public UpdateDnsGtmMonitorRequest setIspCityNode(java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> ispCityNode) {
        this.ispCityNode = ispCityNode;
        return this;
    }
    public java.util.List<UpdateDnsGtmMonitorRequestIspCityNode> getIspCityNode() {
        return this.ispCityNode;
    }

    public UpdateDnsGtmMonitorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmMonitorRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public UpdateDnsGtmMonitorRequest setMonitorExtendInfo(String monitorExtendInfo) {
        this.monitorExtendInfo = monitorExtendInfo;
        return this;
    }
    public String getMonitorExtendInfo() {
        return this.monitorExtendInfo;
    }

    public UpdateDnsGtmMonitorRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public UpdateDnsGtmMonitorRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class UpdateDnsGtmMonitorRequestIspCityNode extends TeaModel {
        /**
         * <p>The code of the city where the monitored node is deployed.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
         */
        @NameInMap("IspCode")
        public String ispCode;

        public static UpdateDnsGtmMonitorRequestIspCityNode build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmMonitorRequestIspCityNode self = new UpdateDnsGtmMonitorRequestIspCityNode();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateDnsGtmMonitorRequestIspCityNode setIspCode(String ispCode) {
            this.ispCode = ispCode;
            return this;
        }
        public String getIspCode() {
            return this.ispCode;
        }

    }

}
