// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("TranscodeConfig")
    public String transcodeConfig;

    @NameInMap("RecordConfig")
    public String recordConfig;

    @NameInMap("Delay")
    public Float delay;

    @NameInMap("UrgentMaterialId")
    public String urgentMaterialId;

    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ProgramEffect")
    public Integer programEffect;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    public static SetCasterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigRequest self = new SetCasterConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterConfigRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public SetCasterConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCasterConfigRequest setTranscodeConfig(String transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }
    public String getTranscodeConfig() {
        return this.transcodeConfig;
    }

    public SetCasterConfigRequest setRecordConfig(String recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }
    public String getRecordConfig() {
        return this.recordConfig;
    }

    public SetCasterConfigRequest setDelay(Float delay) {
        this.delay = delay;
        return this;
    }
    public Float getDelay() {
        return this.delay;
    }

    public SetCasterConfigRequest setUrgentMaterialId(String urgentMaterialId) {
        this.urgentMaterialId = urgentMaterialId;
        return this;
    }
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public SetCasterConfigRequest setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public SetCasterConfigRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SetCasterConfigRequest setProgramEffect(Integer programEffect) {
        this.programEffect = programEffect;
        return this;
    }
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    public SetCasterConfigRequest setProgramName(String programName) {
        this.programName = programName;
        return this;
    }
    public String getProgramName() {
        return this.programName;
    }

    public SetCasterConfigRequest setChannelEnable(Integer channelEnable) {
        this.channelEnable = channelEnable;
        return this;
    }
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

}
