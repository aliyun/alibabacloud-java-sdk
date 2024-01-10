// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateOTAJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MaximumPerMinute")
    public Integer maximumPerMinute;

    @NameInMap("SrcVersionList")
    public java.util.List<String> srcVersionList;

    @NameInMap("Tags")
    public java.util.List<UpdateOTAJobRequestTags> tags;

    @NameInMap("TargetSelection")
    public String targetSelection;

    @NameInMap("TimeoutInMinutes")
    public Integer timeoutInMinutes;

    @NameInMap("UpgradeType")
    public String upgradeType;

    public static UpdateOTAJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOTAJobRequest self = new UpdateOTAJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOTAJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateOTAJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateOTAJobRequest setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
        return this;
    }
    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    public UpdateOTAJobRequest setSrcVersionList(java.util.List<String> srcVersionList) {
        this.srcVersionList = srcVersionList;
        return this;
    }
    public java.util.List<String> getSrcVersionList() {
        return this.srcVersionList;
    }

    public UpdateOTAJobRequest setTags(java.util.List<UpdateOTAJobRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateOTAJobRequestTags> getTags() {
        return this.tags;
    }

    public UpdateOTAJobRequest setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }
    public String getTargetSelection() {
        return this.targetSelection;
    }

    public UpdateOTAJobRequest setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public UpdateOTAJobRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static class UpdateOTAJobRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateOTAJobRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateOTAJobRequestTags self = new UpdateOTAJobRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateOTAJobRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateOTAJobRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
