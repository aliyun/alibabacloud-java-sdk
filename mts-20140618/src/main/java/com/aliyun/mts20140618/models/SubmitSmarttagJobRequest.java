// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example content ****</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p><a href="http://exampleBucket.oss-cn-shanghai.aliyuncs.com/mps-test/ai-tag.mp4">http://exampleBucket.oss-cn-shanghai.aliyuncs.com/mps-test/ai-tag.mp4</a></p>
     */
    @NameInMap("ContentAddr")
    public String contentAddr;

    /**
     * <strong>example:</strong>
     * <p>application/zip</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/endpoint/aliyun/ai?id=76401125000">https://example.com/endpoint/aliyun/ai?id=76401125000</a>***</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The priority of the job in the ApsaraVideo Media Processing (MPS) queue to which the job is added. Valid values: 0 to 9. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public String priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The template ID, which is used to specify the analysis algorithm of the smart tagging job. For more information about how to manage templates, see <a href="https://help.aliyun.com/document_detail/602910.html">AddSmarttagTemplate</a>, <a href="https://help.aliyun.com/document_detail/187770.html">QuerySmarttagTemplateList</a>, <a href="https://help.aliyun.com/document_detail/187776.html">UpdateSmarttagTemplate</a>, and <a href="https://help.aliyun.com/document_detail/187775.html">DeleteSmarttagTemplate</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-title-****</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSmarttagJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmarttagJobRequest self = new SubmitSmarttagJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmarttagJobRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitSmarttagJobRequest setContentAddr(String contentAddr) {
        this.contentAddr = contentAddr;
        return this;
    }
    public String getContentAddr() {
        return this.contentAddr;
    }

    public SubmitSmarttagJobRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SubmitSmarttagJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitSmarttagJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitSmarttagJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitSmarttagJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitSmarttagJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitSmarttagJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitSmarttagJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SubmitSmarttagJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitSmarttagJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitSmarttagJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SubmitSmarttagJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitSmarttagJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
