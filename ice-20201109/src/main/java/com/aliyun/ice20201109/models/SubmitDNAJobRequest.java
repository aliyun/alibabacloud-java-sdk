// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDNAJobRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBId")
    public String DBId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitDNAJobRequestInput input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PrimaryKey")
    public String primaryKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserData")
    public String userData;

    public static SubmitDNAJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDNAJobRequest self = new SubmitDNAJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDNAJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitDNAJobRequest setDBId(String DBId) {
        this.DBId = DBId;
        return this;
    }
    public String getDBId() {
        return this.DBId;
    }

    public SubmitDNAJobRequest setInput(SubmitDNAJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitDNAJobRequestInput getInput() {
        return this.input;
    }

    public SubmitDNAJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitDNAJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitDNAJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitDNAJobRequest setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }
    public String getPrimaryKey() {
        return this.primaryKey;
    }

    public SubmitDNAJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitDNAJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitDNAJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitDNAJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitDNAJobRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitDNAJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitDNAJobRequestInput self = new SubmitDNAJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitDNAJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitDNAJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
