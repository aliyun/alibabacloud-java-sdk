// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDNAJobRequest extends TeaModel {
    /**
     * <p>The DNA configuration, which is a JSON object.
     * If you specify this parameter, it overwrites the template parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SaveType&quot;: &quot;save&quot;,&quot;MediaType&quot;:&quot;video&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the DNA library. To create a DNA library, see <a href="https://help.aliyun.com/document_detail/479275.html">CreateDNADB - Create a DNA library</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("DBId")
    public String DBId;

    /**
     * <p>The input DNA file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitDNAJobRequestInput input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>5246b8d12a62433ab77845074039****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The unique primary key of the video. You must ensure its uniqueness.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3ca84a39a9024f19853b21be9cf9****</p>
     */
    @NameInMap("PrimaryKey")
    public String primaryKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000101-100060</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The custom user data. The maximum length is 128 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>userData</p>
     */
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
         * <p>The information about the input file. OSS URLs and media asset IDs are supported.
         * OSS URL formats:</p>
         * <ul>
         * <li><p>oss://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * </li>
         * </ul>
         * <p>In the URLs, bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1b1b9cd148034739af413150fded****</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ul>
         * <li>OSS: the URL of an OSS file.</li>
         * <li>Media: the ID of a media asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
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
