// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the log management feature. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled. Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    /**
     * <p>The maximum length of the message that is sent to the topic. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    /**
     * <p>The name of the topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static SetTopicAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTopicAttributesRequest self = new SetTopicAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetTopicAttributesRequest setEnableLogging(Boolean enableLogging) {
        this.enableLogging = enableLogging;
        return this;
    }
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }

    public SetTopicAttributesRequest setMaxMessageSize(Long maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
        return this;
    }
    public Long getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public SetTopicAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
