// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned metadata.</p>
     */
    @NameInMap("Data")
    public ListGatewayResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation. Action: mse:ListGateway, Resource: acs:mse:cn-hangzhou:102123:*</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34300B3-52EC-5049-8C96-914098CF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponseBody self = new ListGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayResponseBody setData(ListGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList self = new ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList extends TeaModel {
        /**
         * <p>The expected number of replicas for auto-scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DesiredReplica")
        public Integer desiredReplica;

        /**
         * <p>The end time for auto-scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time for auto-scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList self = new ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList setDesiredReplica(Integer desiredReplica) {
            this.desiredReplica = desiredReplica;
            return this;
        }
        public Integer getDesiredReplica() {
            return this.desiredReplica;
        }

        public ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListGatewayResponseBodyDataResultElasticPolicy extends TeaModel {
        /**
         * <p>Indicates whether auto-scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The auto-scaling type. Valid values:</p>
         * <ul>
         * <li>CronHPA: time-based scaling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The allowed time periods for scaling in.</p>
         */
        @NameInMap("EnableScaleTimePolicyList")
        public java.util.List<ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList;

        /**
         * <p>Specifies the load-based elastic scaling watermark settings for the gateway. true indicates that the warning watermark is enabled, and false indicates that the safe watermark is enabled.</p>
         */
        @NameInMap("LoadWarningThreshold")
        public Boolean loadWarningThreshold;

        /**
         * <p>The maximum number of instances for auto-scaling, used for horizontal scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxReplica")
        public Integer maxReplica;

        /**
         * <p>The list of time-based auto-scaling policies.</p>
         */
        @NameInMap("TimePolicyList")
        public java.util.List<ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList> timePolicyList;

        public static ListGatewayResponseBodyDataResultElasticPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultElasticPolicy self = new ListGatewayResponseBodyDataResultElasticPolicy();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setEnableScaleTimePolicyList(java.util.List<ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList> enableScaleTimePolicyList) {
            this.enableScaleTimePolicyList = enableScaleTimePolicyList;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultElasticPolicyEnableScaleTimePolicyList> getEnableScaleTimePolicyList() {
            return this.enableScaleTimePolicyList;
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setLoadWarningThreshold(Boolean loadWarningThreshold) {
            this.loadWarningThreshold = loadWarningThreshold;
            return this;
        }
        public Boolean getLoadWarningThreshold() {
            return this.loadWarningThreshold;
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public ListGatewayResponseBodyDataResultElasticPolicy setTimePolicyList(java.util.List<ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList> timePolicyList) {
            this.timePolicyList = timePolicyList;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

    }

    public static class ListGatewayResponseBodyDataResultGatewayEntry extends TeaModel {
        /**
         * <p>The entry domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-*****5c2cd6144f4bfa1c32289f45ea8.cn-hangzhou.alicloudapi.com</p>
         */
        @NameInMap("EntryDomain")
        public String entryDomain;

        /**
         * <p>The list of HTTP listener ports.</p>
         */
        @NameInMap("HttpPorts")
        public java.util.List<Integer> httpPorts;

        /**
         * <p>The list of HTTPS listener ports.</p>
         */
        @NameInMap("HttpsPorts")
        public java.util.List<Integer> httpsPorts;

        /**
         * <p>The list of entry IP addresses.</p>
         */
        @NameInMap("IpList")
        public java.util.List<String> ipList;

        /**
         * <p>The IPv6 address.</p>
         */
        @NameInMap("Ipv6List")
        public java.util.List<String> ipv6List;

        /**
         * <p>The entry network type. Valid values:</p>
         * <ul>
         * <li>PRIVATE_NET: private network</li>
         * <li>PUB_NET: public network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUB_NET</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The readiness status of the gateway entry.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListGatewayResponseBodyDataResultGatewayEntry build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultGatewayEntry self = new ListGatewayResponseBodyDataResultGatewayEntry();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setEntryDomain(String entryDomain) {
            this.entryDomain = entryDomain;
            return this;
        }
        public String getEntryDomain() {
            return this.entryDomain;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setHttpPorts(java.util.List<Integer> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public java.util.List<Integer> getHttpPorts() {
            return this.httpPorts;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setHttpsPorts(java.util.List<Integer> httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public java.util.List<Integer> getHttpsPorts() {
            return this.httpsPorts;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setIpList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<String> getIpList() {
            return this.ipList;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setIpv6List(java.util.List<String> ipv6List) {
            this.ipv6List = ipv6List;
            return this;
        }
        public java.util.List<String> getIpv6List() {
            return this.ipv6List;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public ListGatewayResponseBodyDataResultGatewayEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListGatewayResponseBodyDataResultInitConfig extends TeaModel {
        /**
         * <p>Indicates whether WAF is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>Indicates whether WAF is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportWaf")
        public Boolean supportWaf;

        public static ListGatewayResponseBodyDataResultInitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultInitConfig self = new ListGatewayResponseBodyDataResultInitConfig();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultInitConfig setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public ListGatewayResponseBodyDataResultInitConfig setSupportWaf(Boolean supportWaf) {
            this.supportWaf = supportWaf;
            return this;
        }
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

    }

    public static class ListGatewayResponseBodyDataResultInternetSlb extends TeaModel {
        /**
         * <p>The gateway SLB mode.</p>
         * 
         * <strong>example:</strong>
         * <p>UserHost</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The gateway SLB status.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The gateway traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("InternetNetworkFlow")
        public String internetNetworkFlow;

        /**
         * <p>The SLB ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1ut8asdfgucjk****</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The SLB IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>153.12.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The SLB port.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The SLB specification.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbSpec")
        public String slbSpec;

        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>PUB_NET</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayResponseBodyDataResultInternetSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultInternetSlb self = new ListGatewayResponseBodyDataResultInternetSlb();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setInternetNetworkFlow(String internetNetworkFlow) {
            this.internetNetworkFlow = internetNetworkFlow;
            return this;
        }
        public String getInternetNetworkFlow() {
            return this.internetNetworkFlow;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayResponseBodyDataResultMaintenancePeriod extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static ListGatewayResponseBodyDataResultMaintenancePeriod build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultMaintenancePeriod self = new ListGatewayResponseBodyDataResultMaintenancePeriod();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultMaintenancePeriod setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListGatewayResponseBodyDataResultMaintenancePeriod setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListGatewayResponseBodyDataResultMaintenancePeriod setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ListGatewayResponseBodyDataResultSlb extends TeaModel {
        /**
         * <p>The gateway SLB mode.</p>
         * 
         * <strong>example:</strong>
         * <p>UserHost</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The gateway SLB status.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The SLB ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1ut8asdfgucjk****</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The SLB IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>153.12.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The SLB port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The SLB specification.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbSpec")
        public String slbSpec;

        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PUB_NET: public network</li>
         * <li>PRIVATE_NET: private network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUB_NET</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListGatewayResponseBodyDataResultSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultSlb self = new ListGatewayResponseBodyDataResultSlb();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public ListGatewayResponseBodyDataResultSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayResponseBodyDataResult extends TeaModel {
        /**
         * <p>Indicates whether AHAS is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AhasOn")
        public Boolean ahasOn;

        /**
         * <p>The application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>Indicates whether ARMS is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ArmsOn")
        public Boolean armsOn;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-mse-gw</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>Indicates whether auto-scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The gateway elastic instance ID. This parameter is returned when auto-scaling is used.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_ingresselastic_public_cn-uqm3d0*****</p>
         */
        @NameInMap("ElasticInstanceId")
        public String elasticInstanceId;

        /**
         * <p>The auto-scaling policy.</p>
         */
        @NameInMap("ElasticPolicy")
        public ListGatewayResponseBodyDataResultElasticPolicy elasticPolicy;

        /**
         * <p>The number of auto-scaling replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ElasticReplica")
        public Integer elasticReplica;

        /**
         * <p>The auto-scaling type. Valid values:</p>
         * <ul>
         * <li>CronHPA: time-based scaling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The expiration date.</p>
         * 
         * <strong>example:</strong>
         * <p>4792060800000</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The gateway entry address. This parameter is applicable to standard Professional Edition instances.</p>
         */
        @NameInMap("GatewayEntry")
        public java.util.List<ListGatewayResponseBodyDataResultGatewayEntry> gatewayEntry;

        /**
         * <p>The gateway type.</p>
         * 
         * <strong>example:</strong>
         * <p>Ingress</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14cebb8ce5cb6a4****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The gateway version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.9</p>
         */
        @NameInMap("GatewayVersion")
        public String gatewayVersion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>153</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The configuration information.</p>
         */
        @NameInMap("InitConfig")
        public ListGatewayResponseBodyDataResultInitConfig initConfig;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_ingresspost-cn-0jbvrcex****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Internet SLB.</p>
         */
        @NameInMap("InternetSlb")
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-mse-gw</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The O&amp;M time window.</p>
         */
        @NameInMap("MaintenancePeriod")
        public ListGatewayResponseBodyDataResultMaintenancePeriod maintenancePeriod;

        /**
         * <p>The resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tagKey&quot;:&quot;tagValue&quot;}</p>
         */
        @NameInMap("MseTag")
        public String mseTag;

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        @NameInMap("MseVersion")
        public String mseVersion;

        /**
         * <p>The forced upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MustUpgrade")
        public Boolean mustUpgrade;

        /**
         * <p>The gateway name.</p>
         * 
         * <strong>example:</strong>
         * <p>tesa-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The user information.</p>
         * 
         * <strong>example:</strong>
         * <p>18278117654342</p>
         */
        @NameInMap("PrimaryUser")
        public String primaryUser;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-97hg87vi****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether rollback is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RollBack")
        public Boolean rollBack;

        /**
         * <p>The SLB list.</p>
         */
        @NameInMap("Slb")
        public java.util.List<ListGatewayResponseBodyDataResultSlb> slb;

        /**
         * <p>The specification.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_GTW_1_2_200_c</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The gateway status. Valid values:</p>
         * <ul>
         * <li>0: creating</li>
         * <li>1: creation failed</li>
         * <li>2: running</li>
         * <li>3: modifying</li>
         * <li>4: scaling in</li>
         * <li>6: scaling out</li>
         * <li>8: deleting</li>
         * <li>9: stopped and pending release</li>
         * <li>10: restarting</li>
         * <li>11: rebuilding</li>
         * <li>12: upgrading</li>
         * <li>13: upgrade failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The status description.</p>
         * 
         * <strong>example:</strong>
         * <p>Restarting</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>Indicates whether WASM is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportWasm")
        public Boolean supportWasm;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The total number of replicas, including the number of auto-scaling replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalReplica")
        public Integer totalReplica;

        /**
         * <p>The upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The version lifecycle.</p>
         * 
         * <strong>example:</strong>
         * <p>STABLE</p>
         */
        @NameInMap("VersionLifecycle")
        public String versionLifecycle;

        /**
         * <p>The VPC ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6heojei217tv14*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The second vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bpbrveck45nf****</p>
         */
        @NameInMap("Vswitch2")
        public String vswitch2;

        public static ListGatewayResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResult self = new ListGatewayResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResult setAhasOn(Boolean ahasOn) {
            this.ahasOn = ahasOn;
            return this;
        }
        public Boolean getAhasOn() {
            return this.ahasOn;
        }

        public ListGatewayResponseBodyDataResult setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListGatewayResponseBodyDataResult setArmsOn(Boolean armsOn) {
            this.armsOn = armsOn;
            return this;
        }
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        public ListGatewayResponseBodyDataResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListGatewayResponseBodyDataResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListGatewayResponseBodyDataResult setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public ListGatewayResponseBodyDataResult setElasticInstanceId(String elasticInstanceId) {
            this.elasticInstanceId = elasticInstanceId;
            return this;
        }
        public String getElasticInstanceId() {
            return this.elasticInstanceId;
        }

        public ListGatewayResponseBodyDataResult setElasticPolicy(ListGatewayResponseBodyDataResultElasticPolicy elasticPolicy) {
            this.elasticPolicy = elasticPolicy;
            return this;
        }
        public ListGatewayResponseBodyDataResultElasticPolicy getElasticPolicy() {
            return this.elasticPolicy;
        }

        public ListGatewayResponseBodyDataResult setElasticReplica(Integer elasticReplica) {
            this.elasticReplica = elasticReplica;
            return this;
        }
        public Integer getElasticReplica() {
            return this.elasticReplica;
        }

        public ListGatewayResponseBodyDataResult setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public ListGatewayResponseBodyDataResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListGatewayResponseBodyDataResult setGatewayEntry(java.util.List<ListGatewayResponseBodyDataResultGatewayEntry> gatewayEntry) {
            this.gatewayEntry = gatewayEntry;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultGatewayEntry> getGatewayEntry() {
            return this.gatewayEntry;
        }

        public ListGatewayResponseBodyDataResult setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListGatewayResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayResponseBodyDataResult setGatewayVersion(String gatewayVersion) {
            this.gatewayVersion = gatewayVersion;
            return this;
        }
        public String getGatewayVersion() {
            return this.gatewayVersion;
        }

        public ListGatewayResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayResponseBodyDataResult setInitConfig(ListGatewayResponseBodyDataResultInitConfig initConfig) {
            this.initConfig = initConfig;
            return this;
        }
        public ListGatewayResponseBodyDataResultInitConfig getInitConfig() {
            return this.initConfig;
        }

        public ListGatewayResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGatewayResponseBodyDataResult setInternetSlb(java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb) {
            this.internetSlb = internetSlb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> getInternetSlb() {
            return this.internetSlb;
        }

        public ListGatewayResponseBodyDataResult setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListGatewayResponseBodyDataResult setMaintenancePeriod(ListGatewayResponseBodyDataResultMaintenancePeriod maintenancePeriod) {
            this.maintenancePeriod = maintenancePeriod;
            return this;
        }
        public ListGatewayResponseBodyDataResultMaintenancePeriod getMaintenancePeriod() {
            return this.maintenancePeriod;
        }

        public ListGatewayResponseBodyDataResult setMseTag(String mseTag) {
            this.mseTag = mseTag;
            return this;
        }
        public String getMseTag() {
            return this.mseTag;
        }

        public ListGatewayResponseBodyDataResult setMseVersion(String mseVersion) {
            this.mseVersion = mseVersion;
            return this;
        }
        public String getMseVersion() {
            return this.mseVersion;
        }

        public ListGatewayResponseBodyDataResult setMustUpgrade(Boolean mustUpgrade) {
            this.mustUpgrade = mustUpgrade;
            return this;
        }
        public Boolean getMustUpgrade() {
            return this.mustUpgrade;
        }

        public ListGatewayResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListGatewayResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListGatewayResponseBodyDataResult setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public ListGatewayResponseBodyDataResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListGatewayResponseBodyDataResult setRollBack(Boolean rollBack) {
            this.rollBack = rollBack;
            return this;
        }
        public Boolean getRollBack() {
            return this.rollBack;
        }

        public ListGatewayResponseBodyDataResult setSlb(java.util.List<ListGatewayResponseBodyDataResultSlb> slb) {
            this.slb = slb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultSlb> getSlb() {
            return this.slb;
        }

        public ListGatewayResponseBodyDataResult setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListGatewayResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayResponseBodyDataResult setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResult setSupportWasm(Boolean supportWasm) {
            this.supportWasm = supportWasm;
            return this;
        }
        public Boolean getSupportWasm() {
            return this.supportWasm;
        }

        public ListGatewayResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListGatewayResponseBodyDataResult setTotalReplica(Integer totalReplica) {
            this.totalReplica = totalReplica;
            return this;
        }
        public Integer getTotalReplica() {
            return this.totalReplica;
        }

        public ListGatewayResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public ListGatewayResponseBodyDataResult setVersionLifecycle(String versionLifecycle) {
            this.versionLifecycle = versionLifecycle;
            return this;
        }
        public String getVersionLifecycle() {
            return this.versionLifecycle;
        }

        public ListGatewayResponseBodyDataResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListGatewayResponseBodyDataResult setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

    }

    public static class ListGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned data.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyData self = new ListGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayResponseBodyData setResult(java.util.List<ListGatewayResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
