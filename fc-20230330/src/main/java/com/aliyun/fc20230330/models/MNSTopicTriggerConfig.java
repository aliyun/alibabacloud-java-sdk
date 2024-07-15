// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MNSTopicTriggerConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>serverless</p>
     */
    @NameInMap("filterTag")
    public String filterTag;

    /**
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("notifyContentFormat")
    public String notifyContentFormat;

    /**
     * <strong>example:</strong>
     * <p>BACKOFF_RETRY</p>
     */
    @NameInMap("notifyStrategy")
    public String notifyStrategy;

    public static MNSTopicTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        MNSTopicTriggerConfig self = new MNSTopicTriggerConfig();
        return TeaModel.build(map, self);
    }

    public MNSTopicTriggerConfig setFilterTag(String filterTag) {
        this.filterTag = filterTag;
        return this;
    }
    public String getFilterTag() {
        return this.filterTag;
    }

    public MNSTopicTriggerConfig setNotifyContentFormat(String notifyContentFormat) {
        this.notifyContentFormat = notifyContentFormat;
        return this;
    }
    public String getNotifyContentFormat() {
        return this.notifyContentFormat;
    }

    public MNSTopicTriggerConfig setNotifyStrategy(String notifyStrategy) {
        this.notifyStrategy = notifyStrategy;
        return this;
    }
    public String getNotifyStrategy() {
        return this.notifyStrategy;
    }

}
