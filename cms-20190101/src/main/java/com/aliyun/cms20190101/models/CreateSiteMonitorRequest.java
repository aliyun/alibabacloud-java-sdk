// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address of the monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The detection point group used by the monitoring task. Different options correspond to different detection point types. PC corresponds to PC clients, MOBIEL corresponds to mobile clients, and FC corresponds to VPC internal network detection. If this parameter is not specified, the default value is PC.</p>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("AgentGroup")
    public String agentGroup;

    /**
     * <p>The ID of the alert rule.</p>
     * <p>For more information about how to obtain the ID of an existing alert rule in CloudMonitor, see <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemDefault_acs_ecs_dashboard_InternetOutRate_Percent</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The custom detection period. You can only select a specific time period from Monday to Sunday for detection.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;start_hour&quot;:0,&quot;end_hour&quot;:24, &quot;days&quot;:[0], &quot;time_zone&quot;:&quot;Local&quot;}</p>
     */
    @NameInMap("CustomSchedule")
    public String customSchedule;

    /**
     * <p>The monitoring frequency.</p>
     * <p>Valid values: 1 minute, 5 minutes, 15 minutes, 30 minutes, and 60 minutes.</p>
     * <p>Default value: 1 minute.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The probe information. If this parameter is left empty, the system randomly selects three detection points.</p>
     * <p>The value is a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>, which correspond to Beijing, Hangzhou, and Qingdao.</p>
     * <p>For more information about how to obtain detection point information, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
     */
    @NameInMap("IspCities")
    public String ispCities;

    /**
     * <p>The advanced extension options for the protocol type of the monitoring task. Different protocol types correspond to different extension options.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time_out&quot;:5000}</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the monitoring task.</p>
     * <p>The name must be 4 to 100 characters in length and can contain letters, digits, underscores (_), and Chinese characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HanZhou_ECS1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Site monitoring type of site monitoring task.</p>
     * <p>Valid values: HTTP(S), PING, TCP, UDP, DNS, SMTP, POP3, FTP, and WEBSOCKET.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The network information required when creating a VPC internal network monitoring task. You must provide a JSON string that contains the following four fields: vpcId, vswitchId, securityGroupId, and region.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;vpcId&quot;: &quot;vpc-xxxxxx&quot;, &quot;vswitchId&quot;: &quot;vsw-xxxxxx&quot;, &quot;securityGroupId&quot;: &quot;sg-xxxxxx&quot;, &quot;region&quot;: &quot;cn-beijing&quot;}</p>
     */
    @NameInMap("VpcConfig")
    public String vpcConfig;

    public static CreateSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorRequest self = new CreateSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateSiteMonitorRequest setAgentGroup(String agentGroup) {
        this.agentGroup = agentGroup;
        return this;
    }
    public String getAgentGroup() {
        return this.agentGroup;
    }

    public CreateSiteMonitorRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public CreateSiteMonitorRequest setCustomSchedule(String customSchedule) {
        this.customSchedule = customSchedule;
        return this;
    }
    public String getCustomSchedule() {
        return this.customSchedule;
    }

    public CreateSiteMonitorRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public CreateSiteMonitorRequest setIspCities(String ispCities) {
        this.ispCities = ispCities;
        return this;
    }
    public String getIspCities() {
        return this.ispCities;
    }

    public CreateSiteMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSiteMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSiteMonitorRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateSiteMonitorRequest setVpcConfig(String vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public String getVpcConfig() {
        return this.vpcConfig;
    }

}
