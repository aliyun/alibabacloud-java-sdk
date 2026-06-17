// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateInstantSiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address of the detection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The type of the detection points. Valid values: PC and MOBILE. PC indicates detection points on PCs. MOBILE indicates detection points on mobile devices. Default value: PC.</p>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("AgentGroup")
    public String agentGroup;

    /**
     * <p>The detection points. If you do not specify this parameter, the system randomly selects three detection points.</p>
     * <p>The value must be a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;, &quot;type&quot;:&quot;IDC&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;, &quot;type&quot;:&quot;LASTMILE&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>. These values correspond to Beijing, Hangzhou, and Qingdao.</p>
     * <p>The type parameter specifies the type of the detection point. If AgentGroup is set to PC, valid values for type are IDC and LASTMILE. IDC indicates that the detection point is deployed in a data center. LASTMILE indicates that the detection point is deployed on the PC of a netizen that is connected to the last mile of an ISP network. The type parameter is optional. The default value is IDC. You do not need to specify this parameter if AgentGroup is set to MOBILE.</p>
     * <p>For more information about how to obtain detection points, see <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a>.</p>
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
     * <p>The extended options for the protocol type of the detection task. The extended options vary based on the protocol type.</p>
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
     * <li>You must specify either <code>IspCities</code> or <code>RandomIspCity</code>. If you specify <code>RandomIspCity</code>, <code>IspCities</code> is ignored.</li>
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
     * <p>The name of the detection task.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>&lt;props=&quot;partner&quot;&gt;</p>
     * <p>The name must be 4 to 100 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the detection task. Valid values: HTTP, PING, TCP, UDP, and DNS.</p>
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
