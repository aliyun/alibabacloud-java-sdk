// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamMonitorRequest extends TeaModel {
    /**
     * <p>The application name for the output stream of the monitoring session. You can specify a custom name. If you do not specify this parameter, <strong>monitor</strong> is used as the AppName.</p>
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
     * <p>The webhook URL of the DingTalk chatbot. Monitoring alerts are sent to a DingTalk group using a chatbot. Set up a chatbot and enter its webhook URL, which must be an HTTP or HTTPS address. For more information, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Custom robot access</a>.</p>
     * <blockquote>
     * <p>Set the custom keyword of the DingTalk chatbot to &quot;Alerting&quot;. Otherwise, messages cannot be received.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
     */
    @NameInMap("DingTalkWebHookUrl")
    public String dingTalkWebHookUrl;

    /**
     * <p>The output domain name for the monitoring session.</p>
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
     * <p>The settings for alert thresholds. The value is a JSON string. For more information, see the MonitorConfig table below.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;fpsLowThres\&quot;: 0.6,\&quot;brLowThres\&quot;: 1.1,\&quot;eofDurationThresSec\&quot;: 10}&quot;</p>
     */
    @NameInMap("MonitorConfig")
    public String monitorConfig;

    /**
     * <p>The ID of the monitoring session.</p>
     * <blockquote>
     * <p>Obtain the MonitorId value from the response parameters of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("MonitorId")
    public String monitorId;

    /**
     * <p>The name of the monitoring session.</p>
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
     * <p>The name of the output stream for the monitoring session.</p>
     * 
     * <strong>example:</strong>
     * <p>monitorStream****</p>
     */
    @NameInMap("Stream")
    public String stream;

    public static UpdateLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamMonitorRequest self = new UpdateLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamMonitorRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateLiveStreamMonitorRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UpdateLiveStreamMonitorRequest setDingTalkWebHookUrl(String dingTalkWebHookUrl) {
        this.dingTalkWebHookUrl = dingTalkWebHookUrl;
        return this;
    }
    public String getDingTalkWebHookUrl() {
        return this.dingTalkWebHookUrl;
    }

    public UpdateLiveStreamMonitorRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLiveStreamMonitorRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public UpdateLiveStreamMonitorRequest setMonitorConfig(String monitorConfig) {
        this.monitorConfig = monitorConfig;
        return this;
    }
    public String getMonitorConfig() {
        return this.monitorConfig;
    }

    public UpdateLiveStreamMonitorRequest setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public UpdateLiveStreamMonitorRequest setMonitorName(String monitorName) {
        this.monitorName = monitorName;
        return this;
    }
    public String getMonitorName() {
        return this.monitorName;
    }

    public UpdateLiveStreamMonitorRequest setOutputTemplate(String outputTemplate) {
        this.outputTemplate = outputTemplate;
        return this;
    }
    public String getOutputTemplate() {
        return this.outputTemplate;
    }

    public UpdateLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveStreamMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveStreamMonitorRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

}
