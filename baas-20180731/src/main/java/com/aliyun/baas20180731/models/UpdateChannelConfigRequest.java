// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateChannelConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxMessageCount")
    public Integer maxMessageCount;

    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PreferredMaxBytes")
    public Integer preferredMaxBytes;

    public static UpdateChannelConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChannelConfigRequest self = new UpdateChannelConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChannelConfigRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public UpdateChannelConfigRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateChannelConfigRequest setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    public UpdateChannelConfigRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdateChannelConfigRequest setPreferredMaxBytes(Integer preferredMaxBytes) {
        this.preferredMaxBytes = preferredMaxBytes;
        return this;
    }
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

}
