// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class RegisterMediaInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>opening</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>3048</p>
     */
    @NameInMap("CateId")
    public Long cateId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png</a></p>
     */
    @NameInMap("CoverURL")
    public String coverURL;

    /**
     * <strong>example:</strong>
     * <p>defaultDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <strong>example:</strong>
     * <p>tag1,tag2</p>
     */
    @NameInMap("MediaTags")
    public String mediaTags;

    /**
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <strong>example:</strong>
     * <p>123-123</p>
     */
    @NameInMap("ReferenceId")
    public String referenceId;

    @NameInMap("RegisterConfig")
    public String registerConfig;

    @NameInMap("SmartTagTemplateId")
    public String smartTagTemplateId;

    /**
     * <strong>example:</strong>
     * <p>defaultTitle</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>b4fb044839815d4f2cd8</strong></strong></strong></p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static RegisterMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaInfoRequest self = new RegisterMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public RegisterMediaInfoRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public RegisterMediaInfoRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public RegisterMediaInfoRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterMediaInfoRequest setCoverURL(String coverURL) {
        this.coverURL = coverURL;
        return this;
    }
    public String getCoverURL() {
        return this.coverURL;
    }

    public RegisterMediaInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegisterMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public RegisterMediaInfoRequest setMediaTags(String mediaTags) {
        this.mediaTags = mediaTags;
        return this;
    }
    public String getMediaTags() {
        return this.mediaTags;
    }

    public RegisterMediaInfoRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public RegisterMediaInfoRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public RegisterMediaInfoRequest setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    public String getReferenceId() {
        return this.referenceId;
    }

    public RegisterMediaInfoRequest setRegisterConfig(String registerConfig) {
        this.registerConfig = registerConfig;
        return this;
    }
    public String getRegisterConfig() {
        return this.registerConfig;
    }

    public RegisterMediaInfoRequest setSmartTagTemplateId(String smartTagTemplateId) {
        this.smartTagTemplateId = smartTagTemplateId;
        return this;
    }
    public String getSmartTagTemplateId() {
        return this.smartTagTemplateId;
    }

    public RegisterMediaInfoRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RegisterMediaInfoRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public RegisterMediaInfoRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
