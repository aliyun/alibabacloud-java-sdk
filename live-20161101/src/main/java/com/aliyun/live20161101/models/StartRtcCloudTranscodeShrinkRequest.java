// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartRtcCloudTranscodeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myChannel</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputParam")
    public String inputParamShrink;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Long maxIdleTime;

    /**
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
