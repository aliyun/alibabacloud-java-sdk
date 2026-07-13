// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesRequest extends TeaModel {
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    @NameInMap("EnableSSE")
    public Boolean enableSSE;

    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    @NameInMap("SseAlgorithm")
    public String sseAlgorithm;

    @NameInMap("SseType")
    public String sseType;

    /**
     * <p>This parameter is required.</p>
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

    public SetTopicAttributesRequest setEnableSSE(Boolean enableSSE) {
        this.enableSSE = enableSSE;
        return this;
    }
    public Boolean getEnableSSE() {
        return this.enableSSE;
    }

    public SetTopicAttributesRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public SetTopicAttributesRequest setMaxMessageSize(Long maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
        return this;
    }
    public Long getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public SetTopicAttributesRequest setSseAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
        return this;
    }
    public String getSseAlgorithm() {
        return this.sseAlgorithm;
    }

    public SetTopicAttributesRequest setSseType(String sseType) {
        this.sseType = sseType;
        return this;
    }
    public String getSseType() {
        return this.sseType;
    }

    public SetTopicAttributesRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
