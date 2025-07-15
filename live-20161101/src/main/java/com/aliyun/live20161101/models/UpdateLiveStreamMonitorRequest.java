// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamMonitorRequest extends TeaModel {
    /**
     * <p>The name of the application to which the output stream of the monitoring session belongs. You can specify a name. If you do not specify a name, the system uses <strong>monitor</strong> as the name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>monitor****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The callback URL. Supported formats include HTTP and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://guide.aliyundoc.com/notify">http://guide.aliyundoc.com/notify</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The URL of the DingTalk chatbot. Specify a DingTalk chatbot that you have configured, and you can receive live monitoring alerts from the chatbot. For more information, see <a href="https://open.dingtalk.com/document/robots/custom-robot-access">Configure a custom chatbot</a>.</p>
     * <blockquote>
     * <p> Specify &quot;Alert&quot; as the custom keyword of the DingTalk chatbot. Otherwise, you cannot receive messages.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa">https://oapi.dingtalk.com/robot/send?access_token=7a7d404056eee1f2fd944ace9bcfc361dc6448583e1d3d3baa</a>****</p>
     */
    @NameInMap("DingTalkWebHookUrl")
    public String dingTalkWebHookUrl;

    /**
     * <p>The domain name.</p>
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
     * <p>The monitoring alert thresholds. The value is a JSON string. For more information, see the following MonitorConfig table.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;{\&quot;fpsLowThres\&quot;: 0.6,\&quot;brLowThres\&quot;: 1.1,\&quot;eofDurationThresSec\&quot;: 10}&quot;</p>
     */
    @NameInMap("MonitorConfig")
    public String monitorConfig;

    /**
     * <p>The ID of the monitoring session.</p>
     * <blockquote>
     * <p> You can obtain the monitoring session ID from the response of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation.</p>
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
     * <p>The output template of the monitoring session. Valid values:</p>
     * <ul>
     * <li><strong>lp_ld</strong>: low definition</li>
     * <li><strong>lp_sd</strong>: standard definition</li>
     * <li><strong>lp_hd</strong>: high definition</li>
     * <li><strong>lp_ud</strong>: ultra-high definition</li>
     * </ul>
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
     * <p>The name of the output stream of the monitoring session.</p>
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
