// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BatchTimeout")
    public Integer batchTimeout;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channelx</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-aaaaaa-akpcsjjac2jd</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxMessageCount")
    public Integer maxMessageCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public java.util.List<CreateFabricChannelRequestOrganization> organization;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PreferredMaxBytes")
    public Integer preferredMaxBytes;

    public static CreateFabricChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelRequest self = new CreateFabricChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public CreateFabricChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateFabricChannelRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateFabricChannelRequest setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    public CreateFabricChannelRequest setOrganization(java.util.List<CreateFabricChannelRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateFabricChannelRequestOrganization> getOrganization() {
        return this.organization;
    }

    public CreateFabricChannelRequest setPreferredMaxBytes(Integer preferredMaxBytes) {
        this.preferredMaxBytes = preferredMaxBytes;
        return this;
    }
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

    public static class CreateFabricChannelRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
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
