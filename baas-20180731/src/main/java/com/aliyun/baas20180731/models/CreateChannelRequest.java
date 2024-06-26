// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChannelRequest extends TeaModel {
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
     * <p>2</p>
     */
    @NameInMap("MaxMessageCount")
    public Integer maxMessageCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public java.util.List<CreateChannelRequestOrganization> organization;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PreferredMaxBytes")
    public Integer preferredMaxBytes;

    public static CreateChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelRequest self = new CreateChannelRequest();
        return TeaModel.build(map, self);
    }

    public CreateChannelRequest setBatchTimeout(Integer batchTimeout) {
        this.batchTimeout = batchTimeout;
        return this;
    }
    public Integer getBatchTimeout() {
        return this.batchTimeout;
    }

    public CreateChannelRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateChannelRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateChannelRequest setMaxMessageCount(Integer maxMessageCount) {
        this.maxMessageCount = maxMessageCount;
        return this;
    }
    public Integer getMaxMessageCount() {
        return this.maxMessageCount;
    }

    public CreateChannelRequest setOrganization(java.util.List<CreateChannelRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateChannelRequestOrganization> getOrganization() {
        return this.organization;
    }

    public CreateChannelRequest setPreferredMaxBytes(Integer preferredMaxBytes) {
        this.preferredMaxBytes = preferredMaxBytes;
        return this;
    }
    public Integer getPreferredMaxBytes() {
        return this.preferredMaxBytes;
    }

    public static class CreateChannelRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateChannelRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateChannelRequestOrganization self = new CreateChannelRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateChannelRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
