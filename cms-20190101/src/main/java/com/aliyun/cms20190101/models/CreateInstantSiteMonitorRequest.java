// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address of the synthetic monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The type of detection points. Valid values: PC and MOBILE. PC indicates fixed-line network detection points. MOBILE indicates mobile network detection points. Default value: PC.</p>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("AgentGroup")
    public String agentGroup;

    /**
     * <p>The detection point information. If this parameter is left empty, the system randomly selects three detection points.</p>
     * <p>The value is in <code>JSONArray</code> format. Example: [{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;, &quot;type&quot;:&quot;IDC&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;, &quot;type&quot;:&quot;LASTMILE&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}], which correspond to Beijing, Hangzhou, and Qingdao respectively.</p>
     * <p>The type field specifies the detection point type. When AgentGroup is set to PC, valid values are IDC and LASTMILE. IDC indicates detection points deployed in data centers. LASTMILE indicates detection points deployed in end-user homes that use fixed-line networks. The type field is optional and defaults to IDC. When AgentGroup is set to MOBILE, this field does not need to be specified.</p>
     * <p>For information about how to obtain detection point information, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
     * <blockquote>
     * <p>You must specify either <code>IspCities</code> or <code>RandomIspCity</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
     */
    @NameInMap("IspCities")
    public String ispCities;

    /**
     * <p>The advanced extended options for the protocol type of the synthetic monitoring task. Different protocol types correspond to different extended options.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time_out&quot;:5000}</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The number of detection points.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify either <code>IspCities</code> or <code>RandomIspCity</code>.- If you set the <code>RandomIspCity</code> parameter, the <code>IspCities</code> parameter becomes invalid.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RandomIspCity")
    public Integer randomIspCity;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the synthetic monitoring task.</p>
     * <p>&lt;props=&quot;china&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, underscores (_), and Chinese characters.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>&lt;props=&quot;partner&quot;&gt;The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the synthetic monitoring task.
     * Valid values: HTTP, PING, TCP, UDP, and DNS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateInstantSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstantSiteMonitorRequest self = new CreateInstantSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstantSiteMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateInstantSiteMonitorRequest setAgentGroup(String agentGroup) {
        this.agentGroup = agentGroup;
        return this;
    }
    public String getAgentGroup() {
        return this.agentGroup;
    }

    public CreateInstantSiteMonitorRequest setIspCities(String ispCities) {
        this.ispCities = ispCities;
        return this;
    }
    public String getIspCities() {
        return this.ispCities;
    }

    public CreateInstantSiteMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateInstantSiteMonitorRequest setRandomIspCity(Integer randomIspCity) {
        this.randomIspCity = randomIspCity;
        return this;
    }
    public Integer getRandomIspCity() {
        return this.randomIspCity;
    }

    public CreateInstantSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateInstantSiteMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateInstantSiteMonitorRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
