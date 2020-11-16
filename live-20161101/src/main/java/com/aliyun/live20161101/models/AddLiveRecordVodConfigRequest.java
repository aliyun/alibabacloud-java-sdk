// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveRecordVodConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("VodTranscodeGroupId")
    @Validation(required = true)
    public String vodTranscodeGroupId;

    @NameInMap("CycleDuration")
    public Integer cycleDuration;

    @NameInMap("AutoCompose")
    public String autoCompose;

    @NameInMap("StorageLocation")
    public String storageLocation;

    @NameInMap("ComposeVodTranscodeGroupId")
    public String composeVodTranscodeGroupId;

    public static AddLiveRecordVodConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveRecordVodConfigRequest self = new AddLiveRecordVodConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveRecordVodConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveRecordVodConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveRecordVodConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveRecordVodConfigRequest setVodTranscodeGroupId(String vodTranscodeGroupId) {
        this.vodTranscodeGroupId = vodTranscodeGroupId;
        return this;
    }
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public AddLiveRecordVodConfigRequest setCycleDuration(Integer cycleDuration) {
        this.cycleDuration = cycleDuration;
        return this;
    }
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    public AddLiveRecordVodConfigRequest setAutoCompose(String autoCompose) {
        this.autoCompose = autoCompose;
        return this;
    }
    public String getAutoCompose() {
        return this.autoCompose;
    }

    public AddLiveRecordVodConfigRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public AddLiveRecordVodConfigRequest setComposeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
        this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
        return this;
    }
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

}
