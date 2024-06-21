// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayResponseBody extends TeaModel {
    /**
     * <p>The status code returned. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the gateway.</p>
     */
    @NameInMap("Data")
    public GetGatewayResponseBodyData data;

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
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9C96CDF8-9E6C-5AB6-B83C-8F87A10117E6</p>
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

    public static GetGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResponseBody self = new GetGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayResponseBody setData(GetGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayResponseBodyDataElasticPolicyTimePolicyList extends TeaModel {
        /**
         * <p>The number of expected replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DesiredReplica")
        public Integer desiredReplica;

        /**
         * <p>The end time of auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>16:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetGatewayResponseBodyDataElasticPolicyTimePolicyList build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataElasticPolicyTimePolicyList self = new GetGatewayResponseBodyDataElasticPolicyTimePolicyList();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataElasticPolicyTimePolicyList setDesiredReplica(Integer desiredReplica) {
            this.desiredReplica = desiredReplica;
            return this;
        }
        public Integer getDesiredReplica() {
            return this.desiredReplica;
        }

        public GetGatewayResponseBodyDataElasticPolicyTimePolicyList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetGatewayResponseBodyDataElasticPolicyTimePolicyList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetGatewayResponseBodyDataElasticPolicy extends TeaModel {
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
         * <p>5</p>
         */
        @NameInMap("MaxReplica")
        public Integer maxReplica;

        /**
         * <p>The policy of scale-out by time.</p>
         */
        @NameInMap("TimePolicyList")
        public java.util.List<GetGatewayResponseBodyDataElasticPolicyTimePolicyList> timePolicyList;

        public static GetGatewayResponseBodyDataElasticPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataElasticPolicy self = new GetGatewayResponseBodyDataElasticPolicy();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataElasticPolicy setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public GetGatewayResponseBodyDataElasticPolicy setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public GetGatewayResponseBodyDataElasticPolicy setTimePolicyList(java.util.List<GetGatewayResponseBodyDataElasticPolicyTimePolicyList> timePolicyList) {
            this.timePolicyList = timePolicyList;
            return this;
        }
        public java.util.List<GetGatewayResponseBodyDataElasticPolicyTimePolicyList> getTimePolicyList() {
            return this.timePolicyList;
        }

    }

    public static class GetGatewayResponseBodyDataLogConfigDetails extends TeaModel {
        /**
         * <p>Indicates whether Log Service is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogEnabled")
        public Boolean logEnabled;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_access_log</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c173117256e934a96b7fefdf2ef8a8057</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetGatewayResponseBodyDataLogConfigDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLogConfigDetails self = new GetGatewayResponseBodyDataLogConfigDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLogConfigDetails setLogEnabled(Boolean logEnabled) {
            this.logEnabled = logEnabled;
            return this;
        }
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        public GetGatewayResponseBodyDataLogConfigDetails setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetGatewayResponseBodyDataLogConfigDetails setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetGatewayResponseBodyDataXtraceDetails extends TeaModel {
        /**
         * <p>The sampling rate of Tracing Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Sample")
        public Integer sample;

        /**
         * <p>Indicates whether sampling by using Tracing Analysis is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TraceOn")
        public Boolean traceOn;

        public static GetGatewayResponseBodyDataXtraceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataXtraceDetails self = new GetGatewayResponseBodyDataXtraceDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataXtraceDetails setSample(Integer sample) {
            this.sample = sample;
            return this;
        }
        public Integer getSample() {
            return this.sample;
        }

        public GetGatewayResponseBodyDataXtraceDetails setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

    public static class GetGatewayResponseBodyData extends TeaModel {
        /**
         * <p>The billing method, such as subscription or pay-as-you-go.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Indicates whether auto scale-out is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Elastic")
        public Boolean elastic;

        /**
         * <p>The auto scale-out policy.</p>
         */
        @NameInMap("ElasticPolicy")
        public GetGatewayResponseBodyDataElasticPolicy elasticPolicy;

        /**
         * <p>The number of replicas that are automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The time when the gateway expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-01 00:00:00</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-7ea3da97b96543e19f6c597cd4a9****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the gateway was created. The time is displayed in GMT. The time is the local time of the region in which the gateway resides.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the gateway was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("LogConfigDetails")
        public GetGatewayResponseBodyDataLogConfigDetails logConfigDetails;

        /**
         * <p>The tag of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TagKey&quot;:&quot;TagValue&quot;}</p>
         */
        @NameInMap("MseTag")
        public String mseTag;

        /**
         * <p>The name of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account ID of the user who created the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>1231254</p>
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
         * <p>The number of gateway replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replica")
        public Integer replica;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm34x43l*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp11ufzqn6mmb8dtzz82</p>
         */
        @NameInMap("SecurityGroup")
        public String securityGroup;

        /**
         * <p>The specifications of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_GTW_16_32_200_c</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the gateway. Valid values:</p>
         * <ul>
         * <li>0: The gateway is being created.</li>
         * <li>1: The gateway fails to be created.</li>
         * <li>2: The gateway is running.</li>
         * <li>3: The gateway is changing.</li>
         * <li>4: The gateway is scaling in.</li>
         * <li>6: The gateway is scaling out.</li>
         * <li>8: The gateway is being deleted.</li>
         * <li>10: The gateway is restarting.</li>
         * <li>11: The gateway is being rebuilt.</li>
         * <li>12: The gateway is updating.</li>
         * <li>13: The gateway fails to be updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The description of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>Restarting</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The total number of replicas, including the number of replicas that are automatically scaled out.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalReplica")
        public Integer totalReplica;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1328cm01m6uel42b5zb</p>
         */
        @NameInMap("Vpc")
        public String vpc;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp18zeqxx6mpuq843z4n5</p>
         */
        @NameInMap("Vswitch")
        public String vswitch;

        /**
         * <p>The ID of the secondary vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1j6ivhav15ve7q54kq2</p>
         */
        @NameInMap("Vswitch2")
        public String vswitch2;

        /**
         * <p>The details of Tracing Analysis.</p>
         */
        @NameInMap("XtraceDetails")
        public GetGatewayResponseBodyDataXtraceDetails xtraceDetails;

        public static GetGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyData self = new GetGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetGatewayResponseBodyData setElastic(Boolean elastic) {
            this.elastic = elastic;
            return this;
        }
        public Boolean getElastic() {
            return this.elastic;
        }

        public GetGatewayResponseBodyData setElasticPolicy(GetGatewayResponseBodyDataElasticPolicy elasticPolicy) {
            this.elasticPolicy = elasticPolicy;
            return this;
        }
        public GetGatewayResponseBodyDataElasticPolicy getElasticPolicy() {
            return this.elasticPolicy;
        }

        public GetGatewayResponseBodyData setElasticReplica(Integer elasticReplica) {
            this.elasticReplica = elasticReplica;
            return this;
        }
        public Integer getElasticReplica() {
            return this.elasticReplica;
        }

        public GetGatewayResponseBodyData setElasticType(String elasticType) {
            this.elasticType = elasticType;
            return this;
        }
        public String getElasticType() {
            return this.elasticType;
        }

        public GetGatewayResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetGatewayResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGatewayResponseBodyData setLogConfigDetails(GetGatewayResponseBodyDataLogConfigDetails logConfigDetails) {
            this.logConfigDetails = logConfigDetails;
            return this;
        }
        public GetGatewayResponseBodyDataLogConfigDetails getLogConfigDetails() {
            return this.logConfigDetails;
        }

        public GetGatewayResponseBodyData setMseTag(String mseTag) {
            this.mseTag = mseTag;
            return this;
        }
        public String getMseTag() {
            return this.mseTag;
        }

        public GetGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public GetGatewayResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetGatewayResponseBodyData setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetGatewayResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetGatewayResponseBodyData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetGatewayResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetGatewayResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetGatewayResponseBodyData setTotalReplica(Integer totalReplica) {
            this.totalReplica = totalReplica;
            return this;
        }
        public Integer getTotalReplica() {
            return this.totalReplica;
        }

        public GetGatewayResponseBodyData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public GetGatewayResponseBodyData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

        public GetGatewayResponseBodyData setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

        public GetGatewayResponseBodyData setXtraceDetails(GetGatewayResponseBodyDataXtraceDetails xtraceDetails) {
            this.xtraceDetails = xtraceDetails;
            return this;
        }
        public GetGatewayResponseBodyDataXtraceDetails getXtraceDetails() {
            return this.xtraceDetails;
        }

    }

}
