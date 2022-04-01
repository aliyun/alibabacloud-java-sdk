// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class MnsTopicTriggerConfig extends TeaModel {
    // filterTag
    @NameInMap("filterTag")
    public String filterTag;

    // notifyContentFormat
    @NameInMap("notifyContentFormat")
    public String notifyContentFormat;

    // notifyStrategy
    @NameInMap("notifyStrategy")
    public String notifyStrategy;

    public static MnsTopicTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        MnsTopicTriggerConfig self = new MnsTopicTriggerConfig();
        return TeaModel.build(map, self);
    }

    public MnsTopicTriggerConfig setFilterTag(String filterTag) {
        this.filterTag = filterTag;
        return this;
    }
    public String getFilterTag() {
        return this.filterTag;
    }

    public MnsTopicTriggerConfig setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public MnsTopicTriggerConfig setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

}
