// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    @NameInMap("MaxMessageCount")
    public Integer maxMessageCount;

    @NameInMap("PreferredMaxBytes")
    public Integer preferredMaxBytes;

    @NameInMap("Organization")
    public java.util.List<CreateFabricChannelRequestOrganization> organization;

    public static CreateFabricChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelRequest self = new CreateFabricChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateFabricChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateFabricChannelRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public CreateFabricChannelRequest setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    public CreateFabricChannelRequest setPreferredMaxBytes(Integer preferredMaxBytes) {
        this.preferredMaxBytes = preferredMaxBytes;
        return this;
    }
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

    public CreateFabricChannelRequest setOrganization(java.util.List<CreateFabricChannelRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateFabricChannelRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class CreateFabricChannelRequestOrganization extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateFabricChannelRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricChannelRequestOrganization self = new CreateFabricChannelRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateFabricChannelRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
