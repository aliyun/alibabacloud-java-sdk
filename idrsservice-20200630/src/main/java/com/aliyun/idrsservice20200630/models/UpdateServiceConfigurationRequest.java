// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateServiceConfigurationRequest extends TeaModel {
    @NameInMap("ClientQueueSize")
    public Integer clientQueueSize;

    @NameInMap("LiveRecordAll")
    public Boolean liveRecordAll;

    @NameInMap("LiveRecordEveryOne")
    public Boolean liveRecordEveryOne;

    @NameInMap("LiveRecordLayout")
    public Integer liveRecordLayout;

    @NameInMap("LiveRecordMaxClient")
    public Integer liveRecordMaxClient;

    @NameInMap("LiveRecordTaskProfile")
    public String liveRecordTaskProfile;

    @NameInMap("LiveRecordVideoResolution")
    public Integer liveRecordVideoResolution;

    @NameInMap("TaskItemQueueSize")
    public Integer taskItemQueueSize;

    public static UpdateServiceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceConfigurationRequest self = new UpdateServiceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceConfigurationRequest setClientQueueSize(Integer clientQueueSize) {
        this.clientQueueSize = clientQueueSize;
        return this;
    }
    public Integer getClientQueueSize() {
        return this.clientQueueSize;
    }

    public UpdateServiceConfigurationRequest setLiveRecordAll(Boolean liveRecordAll) {
        this.liveRecordAll = liveRecordAll;
        return this;
    }
    public Boolean getLiveRecordAll() {
        return this.liveRecordAll;
    }

    public UpdateServiceConfigurationRequest setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
        this.liveRecordEveryOne = liveRecordEveryOne;
        return this;
    }
    public Boolean getLiveRecordEveryOne() {
        return this.liveRecordEveryOne;
    }

    public UpdateServiceConfigurationRequest setLiveRecordLayout(Integer liveRecordLayout) {
        this.liveRecordLayout = liveRecordLayout;
        return this;
    }
    public Integer getLiveRecordLayout() {
        return this.liveRecordLayout;
    }

    public UpdateServiceConfigurationRequest setLiveRecordMaxClient(Integer liveRecordMaxClient) {
        this.liveRecordMaxClient = liveRecordMaxClient;
        return this;
    }
    public Integer getLiveRecordMaxClient() {
        return this.liveRecordMaxClient;
    }

    public UpdateServiceConfigurationRequest setLiveRecordTaskProfile(String liveRecordTaskProfile) {
        this.liveRecordTaskProfile = liveRecordTaskProfile;
        return this;
    }
    public String getLiveRecordTaskProfile() {
        return this.liveRecordTaskProfile;
    }

    public UpdateServiceConfigurationRequest setLiveRecordVideoResolution(Integer liveRecordVideoResolution) {
        this.liveRecordVideoResolution = liveRecordVideoResolution;
        return this;
    }
    public Integer getLiveRecordVideoResolution() {
        return this.liveRecordVideoResolution;
    }

    public UpdateServiceConfigurationRequest setTaskItemQueueSize(Integer taskItemQueueSize) {
        this.taskItemQueueSize = taskItemQueueSize;
        return this;
    }
    public Integer getTaskItemQueueSize() {
        return this.taskItemQueueSize;
    }

}
