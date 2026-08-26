// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudTranscodeShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the application to which the channel belongs. The ID can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to which the user to be transcoded belongs. The ID can contain uppercase letters, lowercase letters, digits, underscores (_), and hyphens (-). The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myChannel</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The parameters for the input stream subscription.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputParam")
    public String inputParamShrink;

    /**
     * <p>The idle timeout period in seconds. If a task cannot subscribe to the specified streamer\&quot;s stream and remains idle for longer than this period, the task automatically stops. The value must be an integer from 10 to 14,400. The default value is 300.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
     * <p>The parameters for the transcoded output.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputParams")
    public String outputParamsShrink;

    public static StartRtcCloudTranscodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRtcCloudTranscodeShrinkRequest self = new StartRtcCloudTranscodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRtcCloudTranscodeShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRtcCloudTranscodeShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartRtcCloudTranscodeShrinkRequest setInputParamShrink(String inputParamShrink) {
        this.inputParamShrink = inputParamShrink;
        return this;
    }
    public String getInputParamShrink() {
        return this.inputParamShrink;
    }

    public StartRtcCloudTranscodeShrinkRequest setMaxIdleTime(Long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Long getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public StartRtcCloudTranscodeShrinkRequest setOutputParamsShrink(String outputParamsShrink) {
        this.outputParamsShrink = outputParamsShrink;
        return this;
    }
    public String getOutputParamsShrink() {
        return this.outputParamsShrink;
    }

}
