// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeNotifyConfigResponseBody extends TeaModel {
    @NameInMap("AudioOssPath")
    public String audioOssPath;

    /**
     * <p>The URL where event callbacks are sent.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://customer.com/callback">http://customer.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("EnableAudioRecording")
    public Boolean enableAudioRecording;

    /**
     * <p>Indicates whether notifications are enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNotify")
    public Boolean enableNotify;

    /**
     * <p>The event types. If you do not specify this parameter, all event types are selected by default.</p>
     * <ul>
     * <li><p><code>agent_start</code>: The agent is ready.</p>
     * </li>
     * <li><p><code>agent_stop</code>: The agent is stopped.</p>
     * </li>
     * <li><p><code>error</code>: The task encountered an error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agent_start,agent_stop,error</p>
     */
    @NameInMap("EventTypes")
    public String eventTypes;

    /**
     * <p>The unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The authentication token used to verify the callback. This token is included in the <code>Authorization</code> field of the request header for each event callback.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyConfigResponseBody self = new DescribeNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyConfigResponseBody setAudioOssPath(String audioOssPath) {
        this.audioOssPath = audioOssPath;
        return this;
    }
    public String getAudioOssPath() {
        return this.audioOssPath;
    }

    public DescribeNotifyConfigResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeNotifyConfigResponseBody setEnableAudioRecording(Boolean enableAudioRecording) {
        this.enableAudioRecording = enableAudioRecording;
        return this;
    }
    public Boolean getEnableAudioRecording() {
        return this.enableAudioRecording;
    }

    public DescribeNotifyConfigResponseBody setEnableNotify(Boolean enableNotify) {
        this.enableNotify = enableNotify;
        return this;
    }
    public Boolean getEnableNotify() {
        return this.enableNotify;
    }

    public DescribeNotifyConfigResponseBody setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public DescribeNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNotifyConfigResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
