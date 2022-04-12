// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateJvmConfigurationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    @NameInMap("Options")
    public String options;

    public static UpdateJvmConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJvmConfigurationRequest self = new UpdateJvmConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJvmConfigurationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateJvmConfigurationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateJvmConfigurationRequest setMaxHeapSize(Integer maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
        return this;
    }
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public UpdateJvmConfigurationRequest setMaxPermSize(Integer maxPermSize) {
        this.maxPermSize = maxPermSize;
        return this;
    }
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    public UpdateJvmConfigurationRequest setMinHeapSize(Integer minHeapSize) {
        this.minHeapSize = minHeapSize;
        return this;
    }
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    public UpdateJvmConfigurationRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

}
