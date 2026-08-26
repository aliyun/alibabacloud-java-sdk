// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorRequest extends TeaModel {
    /**
     * <p>The application name for the output stream of the monitoring session. You can specify a custom name. If you do not specify this parameter, <strong>monitor</strong> is used as the application name.</p>
     * 
     * <strong>example:</strong>
     * <p>monitor****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The webhook address. HTTP and HTTPS are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The webhook URL of the DingTalk chatbot. To receive alert notifications, configure a DingTalk chatbot and enter its webhook URL, which can be in HTTP or HTTPS format. For more information, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Custom robot access</a>.</p>
     * <blockquote>
     * <p>Set the custom keyword for the DingTalk chatbot to &quot;Alerting&quot;. Otherwise, you cannot receive messages.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
     */
    @NameInMap("DingTalkWebHookUrl")
    public String dingTalkWebHookUrl;

    /**
     * <p>The domain name to monitor.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The list of input streams to monitor. For more information, see the <strong>InputConfig</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InputConfig</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <p>The alert threshold settings for monitoring. The value must be a JSON string. For more information, see the MonitorConfig table below.</p>
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
     * <p>The output template for the monitoring session. Valid values:</p>
     * <ul>
     * <li><p><strong>lp_ld</strong>: low definition.</p>
     * </li>
     * <li><p><strong>lp_sd</strong>: standard definition.</p>
     * </li>
     * <li><p><strong>lp_hd</strong>: high definition.</p>
     * </li>
     * <li><p><strong>lp_ud</strong>: ultra-high definition.</p>
     * </li>
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

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the output stream for the monitoring session. If you do not specify this parameter, the system generates a random name.</p>
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
