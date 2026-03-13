// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class MNSTopicTriggerConfig extends TeaModel {
    /**
     * <p>The filtering tag. Function execution is triggered only when a message that contains the specified filter tag is received.</p>
     * 
     * <strong>example:</strong>
     * <p>serverless</p>
     */
    @NameInMap("filterTag")
    public String filterTag;

    /**
     * <p>The format of the event content. The following two formats are supported:</p>
     * <ul>
     * <li><strong>JSON</strong></li>
     * <li><strong>STREAM</strong></li>
     * </ul>
     * <blockquote>
     * <p> The default format is STREAM.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("notifyContentFormat")
    public String notifyContentFormat;

    /**
     * <p>The retry policy.</p>
     * <ul>
     * <li><strong>BACKOFF_RETRY</strong>: a backoff retry policy. A total of 3 retries are made. The interval between 2 retries is a random value between 10 and 20 seconds. This is the default value.</li>
     * <li><strong>EXPONENTIAL_DECAY_RETRY</strong>: an exponential decay retry policy. A total of 176 retries are made, with the interval of each retry increases exponentially to 512 seconds, and the total retry period is 1 day. The interval between two consecutive retries exponentially increases to a maximum of 512 seconds. For example, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 512... 512. The number of 512s is 167.</li>
     * </ul>
     * 
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
