// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigRequest extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("ChannelEnable")
    public Integer channelEnable;

    @NameInMap("Delay")
    public Float delay;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProgramEffect")
    public Integer programEffect;

    @NameInMap("ProgramName")
    public String programName;

    @NameInMap("RecordConfig")
    public String recordConfig;

    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    @NameInMap("SideOutputUrlList")
    public String sideOutputUrlList;

    @NameInMap("SyncGroupsConfig")
    public String syncGroupsConfig;

    @NameInMap("TranscodeConfig")
    public String transcodeConfig;

    @NameInMap("UrgentLiveStreamUrl")
    public String urgentLiveStreamUrl;

    @NameInMap("UrgentMaterialId")
    public String urgentMaterialId;

    public static SetCasterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigRequest self = new SetCasterConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
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

    public SetCasterConfigRequest setChannelEnable(Integer channelEnable) {
        this.channelEnable = channelEnable;
        return this;
    }
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    public SetCasterConfigRequest setDelay(Float delay) {
        this.delay = delay;
        return this;
    }
    public Float getDelay() {
        return this.delay;
    }

    public SetCasterConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCasterConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public SetCasterConfigRequest setRecordConfig(String recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }
    public String getRecordConfig() {
        return this.recordConfig;
    }

    public SetCasterConfigRequest setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public SetCasterConfigRequest setSideOutputUrlList(String sideOutputUrlList) {
        this.sideOutputUrlList = sideOutputUrlList;
        return this;
    }
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    public SetCasterConfigRequest setSyncGroupsConfig(String syncGroupsConfig) {
        this.syncGroupsConfig = syncGroupsConfig;
        return this;
    }
    public String getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    public SetCasterConfigRequest setTranscodeConfig(String transcodeConfig) {
        this.transcodeConfig = transcodeConfig;
        return this;
    }
    public String getTranscodeConfig() {
        return this.transcodeConfig;
    }

    public SetCasterConfigRequest setUrgentLiveStreamUrl(String urgentLiveStreamUrl) {
        this.urgentLiveStreamUrl = urgentLiveStreamUrl;
        return this;
    }
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    public SetCasterConfigRequest setUrgentMaterialId(String urgentMaterialId) {
        this.urgentMaterialId = urgentMaterialId;
        return this;
    }
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

}
