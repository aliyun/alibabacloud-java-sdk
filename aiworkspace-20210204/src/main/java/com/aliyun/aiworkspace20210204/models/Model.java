// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Model extends TeaModel {
    /**
     * <p>The workspace visibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): visible only to yourself and administrators within the workspace.</li>
     * <li>PUBLIC: visible to all users in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The domain. Describes the domain of the problem that the model solves, such as nlp (natural language processing) or cv (computer vision).</p>
     * 
     * <strong>example:</strong>
     * <p>nlp</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;RatingCount&quot;: 2866,
     *     &quot;Rating&quot;: 4.94,
     *     &quot;FavoriteCount&quot;: 34992,
     *     &quot;CommentCount&quot;: 754,
     *     &quot;CoverUris&quot;: [&quot;<a href="https://e***u.oss-cn-hangzhou.aliyuncs.com/drea***w.png%22%5D">https://e***u.oss-cn-hangzhou.aliyuncs.com/drea***w.png&quot;]</a>,
     *     &quot;TippedAmountCount&quot;: 32,
     *     &quot;DownloadCount&quot;: 606056
     * }</p>
     */
    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <p>The UTC time of model creation, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the latest version was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtLatestVersionModifiedTime")
    public String gmtLatestVersionModifiedTime;

    /**
     * <p>The time when the model was last updated in UTC, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The label list. This parameter will be deprecated and replaced by Tag.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The latest version of the model.</p>
     */
    @NameInMap("LatestVersion")
    public ModelVersion latestVersion;

    /**
     * <p>The model description.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment analysis</p>
     */
    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <p>The model documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***.md</p>
     */
    @NameInMap("ModelDoc")
    public String modelDoc;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>model-1123*****</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment Analysis</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type, such as Checkpoint or LoRA.</p>
     * 
     * <strong>example:</strong>
     * <p>Checkpoint</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The model sequence number.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <p>The model origin. Describes the community or organization to which the source model belongs, such as ModelScope or HuggingFace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1557702098******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of parameters, in millions (M).</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("ParameterSize")
    public Long parameterSize;

    /**
     * <p>The model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Label> tags;

    /**
     * <p>The task. Describes the specific problem that the model solves, such as text-classification (text categorization).</p>
     * 
     * <strong>example:</strong>
     * <p>text-classifiaction</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1557702098******</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Model build(java.util.Map<String, ?> map) throws Exception {
        Model self = new Model();
        return TeaModel.build(map, self);
    }

    public Model setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Model setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public Model setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public Model setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Model setGmtLatestVersionModifiedTime(String gmtLatestVersionModifiedTime) {
        this.gmtLatestVersionModifiedTime = gmtLatestVersionModifiedTime;
        return this;
    }
    public String getGmtLatestVersionModifiedTime() {
        return this.gmtLatestVersionModifiedTime;
    }

    public Model setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Model setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public Model setLatestVersion(ModelVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
    }

    public Model setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public Model setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public Model setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Model setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public Model setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public Model setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public Model setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public Model setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Model setParameterSize(Long parameterSize) {
        this.parameterSize = parameterSize;
        return this;
    }
    public Long getParameterSize() {
        return this.parameterSize;
    }

    public Model setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Model setTags(java.util.List<Label> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Label> getTags() {
        return this.tags;
    }

    public Model setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public Model setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Model setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
