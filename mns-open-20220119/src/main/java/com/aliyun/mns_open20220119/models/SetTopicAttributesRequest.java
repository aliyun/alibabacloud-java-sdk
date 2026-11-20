// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetTopicAttributesRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the log management feature. Valid values:</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableLogging")
    public Boolean enableLogging;

    /**
     * <p>Specifies whether to enable server-side encryption for message bodies. Valid values: true or false.</p>
     */
    @NameInMap("EnableSSE")
    public Boolean enableSSE;

    /**
     * <p>The KMS key ID. This parameter is required when you use KMS for encryption. The key must belong to the same Alibaba Cloud account and region as the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>key-xxx</p>
     */
    @NameInMap("KmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The maximum size of a message body sent to the topic. Valid values: 1024 to 65536. Unit: bytes. Default value: 65536.</p>
     * 
     * <strong>example:</strong>
     * <p>65536</p>
     */
    @NameInMap("MaxMessageSize")
    public Long maxMessageSize;

    /**
     * <p>The server-side encryption algorithm. Currently, only AES-256-GCM is supported. If you do not specify this parameter, the default algorithm is used.</p>
     * 
     * <strong>example:</strong>
     * <p>AES-256-GCM</p>
     */
    @NameInMap("SseAlgorithm")
    public String sseAlgorithm;

    /**
     * <p>The server-side encryption method. Valid values: SMQ (service-managed key) or KMS (customer-managed KMS key).</p>
     * 
     * <strong>example:</strong>
     * <p>KMS</p>
     */
    @NameInMap("SseType")
    public String sseType;

    /**
     * <p>The name of the topic. The name can be up to 120 characters in length. It must start with a letter and can contain letters, digits, and hyphens.</p>
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
