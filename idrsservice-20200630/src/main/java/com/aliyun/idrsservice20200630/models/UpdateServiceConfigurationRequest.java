// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateServiceConfigurationRequest extends TeaModel {
    @NameInMap("TaskItemQueueSize")
    @Validation(required = true)
    public Integer taskItemQueueSize;

    @NameInMap("ClientQueueSize")
    @Validation(required = true)
    public Integer clientQueueSize;

    @NameInMap("LiveRecordEveryOne")
    @Validation(required = true)
    public Boolean liveRecordEveryOne;

    @NameInMap("LiveRecordAll")
    @Validation(required = true)
    public Boolean liveRecordAll;

    @NameInMap("LiveRecordLayout")
    @Validation(required = true)
    public Integer liveRecordLayout;

    @NameInMap("LiveRecordTaskProfile")
    @Validation(required = true)
    public String liveRecordTaskProfile;

    public static UpdateServiceConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceConfigurationRequest self = new UpdateServiceConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceConfigurationRequest setTaskItemQueueSize(Integer taskItemQueueSize) {
        this.taskItemQueueSize = taskItemQueueSize;
        return this;
    }
    public Integer getTaskItemQueueSize() {
        return this.taskItemQueueSize;
    }

    public UpdateServiceConfigurationRequest setClientQueueSize(Integer clientQueueSize) {
        this.clientQueueSize = clientQueueSize;
        return this;
    }
    public Integer getClientQueueSize() {
        return this.clientQueueSize;
    }

    public UpdateServiceConfigurationRequest setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
        this.liveRecordEveryOne = liveRecordEveryOne;
        return this;
    }
    public Boolean getLiveRecordEveryOne() {
        return this.liveRecordEveryOne;
    }

    public UpdateServiceConfigurationRequest setLiveRecordAll(Boolean liveRecordAll) {
        this.liveRecordAll = liveRecordAll;
        return this;
    }
    public Boolean getLiveRecordAll() {
        return this.liveRecordAll;
    }

    public UpdateServiceConfigurationRequest setLiveRecordLayout(Integer liveRecordLayout) {
        this.liveRecordLayout = liveRecordLayout;
        return this;
    }
    public Integer getLiveRecordLayout() {
        return this.liveRecordLayout;
    }

    public UpdateServiceConfigurationRequest setLiveRecordTaskProfile(String liveRecordTaskProfile) {
        this.liveRecordTaskProfile = liveRecordTaskProfile;
        return this;
    }
    public String getLiveRecordTaskProfile() {
        return this.liveRecordTaskProfile;
    }

}
