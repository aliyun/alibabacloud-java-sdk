// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorRequest extends TeaModel {
    /**
     * <p>The name of the application that plays the output streams of the monitoring session.</p>
     * <p>You can specify a name. If you do not specify a name, the system uses <strong>monitor</strong> as the name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>monitor****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>Supports input of callback addresses in HTTP(S) format.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>DingTalk alert monitoring sends alert notifications through a DingTalk group robot. Please set up the DingTalk group robot first and enter the HTTP(S) address of the robot here. For more details, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Custom Robot Access</a>.</p>
     * <blockquote>
     * <p>Configure the custom keyword for the DingTalk group robot as \&quot;alert\&quot;, otherwise, messages will not be received.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
     */
    @NameInMap("DingTalkWebHookUrl")
    public String dingTalkWebHookUrl;

    /**
     * <p>The endpoint of the monitoring session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The list of input streams to monitor. For more information, see the following <strong>InputConfig</strong> table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InputConfig</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>Alarm threshold setting for monitoring, in JSON format. For more details, please refer to the table below for MonitorConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;fpsLowThres\&quot;: 0.6,\&quot;brLowThres\&quot;: 1.1,\&quot;eofDurationThresSec\&quot;: 10}&quot;</p>
     */
    @NameInMap("MonitorConfig")
    public String monitorConfig;

    /**
     * <p>The name of the monitoring session.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveMonitor****</p>
     */
    @NameInMap("MonitorName")
    public String monitorName;

    /**
     * <p>The output template of the monitoring session. Valid values:</p>
     * <ul>
     * <li><strong>lp_ld</strong>: low definition.</li>
     * <li><strong>lp_sd</strong>: standard definition.</li>
     * <li><strong>lp_hd</strong>: high definition.</li>
     * <li><strong>lp_ud</strong>: ultra high definition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lp_ud</p>
     */
    @NameInMap("OutputTemplate")
    public String outputTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the output stream of the monitoring session. If you do not specify a name, the system generates a name at random.</p>
     * 
     * <strong>example:</strong>
     * <p>monitorStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static CreateLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamMonitorRequest self = new CreateLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamMonitorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateLiveStreamMonitorRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateLiveStreamMonitorRequest setDingTalkWebHookUrl(String dingTalkWebHookUrl) {
        this.dingTalkWebHookUrl = dingTalkWebHookUrl;
        return this;
    }
    public String getDingTalkWebHookUrl() {
        return this.dingTalkWebHookUrl;
    }

    public CreateLiveStreamMonitorRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateLiveStreamMonitorRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public CreateLiveStreamMonitorRequest setMonitorConfig(String monitorConfig) {
        this.monitorConfig = monitorConfig;
        return this;
    }
    public String getMonitorConfig() {
        return this.monitorConfig;
    }

    public CreateLiveStreamMonitorRequest setMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }
    public String getMonitorName() {
        return this.monitorName;
    }

    public CreateLiveStreamMonitorRequest setOutputTemplate(String outputTemplate) {
        this.outputTemplate = outputTemplate;
        return this;
    }
    public String getOutputTemplate() {
        return this.outputTemplate;
    }

    public CreateLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLiveStreamMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLiveStreamMonitorRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
