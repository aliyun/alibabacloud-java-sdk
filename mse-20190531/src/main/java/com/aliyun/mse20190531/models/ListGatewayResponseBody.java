// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListGatewayResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation. Action: mse:ListGateway, Resource: acs:mse:cn-hangzhou:102123:*</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34300B3-52EC-5049-8C96-914098CF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
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

    public static class ListGatewayResponseBodyDataResultElasticPolicyTimePolicyList extends TeaModel {
        /**
         * <p>The expected number of replicas for auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DesiredReplica")
        public Integer desiredReplica;

        /**
         * <p>The end time of auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of auto scale-out.</p>
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
         * <p>Indicates whether auto scale-out is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The type of auto scale-out. Valid value:</p>
         * <ul>
         * <li>CronHPA: scale-out by time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The maximum number of instances that are automatically scaled out. This parameter is used for horizontal scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxReplica")
        public Integer maxReplica;

        /**
         * <p>The time policy list for auto scale-out.</p>
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

    public static class ListGatewayResponseBodyDataResultInitConfig extends TeaModel {
        /**
         * <p>Indicates whether Web Application Firewall (WAF) is enabled.</p>
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
         * <p>The mode of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>UserHost</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The state of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The traffic of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("InternetNetworkFlow")
        public String internetNetworkFlow;

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1ut8asdfgucjk****</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The IP address of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>153.12.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The port number of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The specifications of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbSpec")
        public String slbSpec;

        /**
         * <p>The description of the state.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The type of the SLB instance.</p>
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
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

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
         * <p>The mode of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>UserHost</p>
         */
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        /**
         * <p>The state of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        /**
         * <p>The ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1ut8asdfgucjk****</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The IP address of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>153.12.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The port number of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SlbPort")
        public String slbPort;

        /**
         * <p>The specifications of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s2.small</p>
         */
        @NameInMap("SlbSpec")
        public String slbSpec;

        /**
         * <p>The description of the state.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PUB_NET</li>
         * <li>PRIVATE_NET</li>
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
         * <p>Indicates whether Application High Availability Service (AHAS) is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AhasOn")
        public Boolean ahasOn;

        /**
         * <p>The version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>Indicates whether Application Real-Time Monitoring Service (ARMS) is activated.</p>
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
         * <p>The current version of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-mse-gw</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>Indicates whether auto scale-out is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The ID of the elastic gateway. This parameter is returned if auto scale-out is used.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_ingresselastic_public_cn-uqm3d0*****</p>
         */
        @NameInMap("ElasticInstanceId")
        public String elasticInstanceId;

        /**
         * <p>The auto scale-out policy.</p>
         */
        @NameInMap("ElasticPolicy")
        public ListGatewayResponseBodyDataResultElasticPolicy elasticPolicy;

        /**
         * <p>The number of replicas that are automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ElasticReplica")
        public Integer elasticReplica;

        /**
         * <p>The type of auto scale-out. Valid value:</p>
         * <ul>
         * <li>CronHPA: scale-out by time</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronHPA</p>
         */
        @NameInMap("ElasticType")
        public String elasticType;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>4792060800000</p>
         */
        @NameInMap("EndDate")
        public String endDate;

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
         * <p>The version of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.9</p>
         */
        @NameInMap("GatewayVersion")
        public String gatewayVersion;

        /**
         * <p>The time when the gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13 19:24:23</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the gateway was modified.</p>
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
         * <p>The configurations.</p>
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
         * <p>The details of the Internet-facing SLB instances.</p>
         */
        @NameInMap("InternetSlb")
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb;

        /**
         * <p>The latest version of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0-mse-gw</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

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

        @NameInMap("MseVersion")
        public String mseVersion;

        /**
         * <p>Indicates whether the instance was forcefully upgraded.</p>
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
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of replicas.</p>
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
         * <p>Indicates whether rollbacks are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RollBack")
        public Boolean rollBack;

        /**
         * <p>The details of Server Load Balancer (SLB) instances.</p>
         */
        @NameInMap("Slb")
        public java.util.List<ListGatewayResponseBodyDataResultSlb> slb;

        /**
         * <p>The specifications of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_GTW_1_2_200_c</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The gateway state. Valid values:</p>
         * <ul>
         * <li>0: The gateway is being created.</li>
         * <li>1: The gateway failed to be created.</li>
         * <li>2: The gateway is running.</li>
         * <li>3: The gateway is being changed.</li>
         * <li>4: The gateway is scaling in.</li>
         * <li>6: The gateway is scaling out.</li>
         * <li>8: The gateway is being deleted.</li>
         * <li>9: The gateway is suspended and is to be released.</li>
         * <li>10: The gateway is restarting.</li>
         * <li>11: The gateway is being rebuilt.</li>
         * <li>12: The gateway is being upgraded.</li>
         * <li>13: The gateway failed to be upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The description of the gateway state.</p>
         * 
         * <strong>example:</strong>
         * <p>Restarting</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>Indicates whether WebAssembly (Wasm) is supported.</p>
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
         * <p>The total number of replicas, including the number of replicas that are automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalReplica")
        public Integer totalReplica;

        /**
         * <p>Indicates whether the instance was upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6heojei217tv14*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the secondary vSwitch.</p>
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data returned.</p>
         */
        @NameInMap("Result")
        public java.util.List<ListGatewayResponseBodyDataResult> result;

        /**
         * <p>The total number of entries returned.</p>
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
