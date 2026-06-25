// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetModelResponseBody extends TeaModel {
    /**
     * <p>The visibility of the workspace. Valid values:</p>
     * <ul>
     * <li><p>PRIVATE: The model is visible only to you and administrators in the workspace.</p>
     * </li>
     * <li><p>PUBLIC: The model is visible to everyone in the workspace.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The domain. This indicates the domain of the problem that the model is designed to solve, such as natural language processing (NLP) and computer vision (CV).</p>
     * 
     * <strong>example:</strong>
     * <p>cv</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Other information about the model.</p>
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
     * <p>The UTC time when the model was created. The time is in the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the latest version was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtLatestVersionModifiedTime")
    public String gmtLatestVersionModifiedTime;

    /**
     * <p>The UTC time when the model was last updated. The time is in the ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The list of labels for the model.</p>
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
     * <p>General sentiment analysis.</p>
     */
    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <p>The model document.</p>
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
     * <p>model-rbvg5wzljz****ks92</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Sentiment analysis</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Checkpoint</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The ordinal number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <p>The source of the model. This indicates the community or organization to which the source model belongs, such as ModelScope and HuggingFace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of parameters, in millions.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("ParameterSize")
    public Long parameterSize;

    /**
     * <p>The provider.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task. This indicates the specific problem that the model is designed to solve, such as text classification.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890******</p>
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

    public static GetModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelResponseBody self = new GetModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelResponseBody setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public GetModelResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetModelResponseBody setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public GetModelResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetModelResponseBody setGmtLatestVersionModifiedTime(String gmtLatestVersionModifiedTime) {
        this.gmtLatestVersionModifiedTime = gmtLatestVersionModifiedTime;
        return this;
    }
    public String getGmtLatestVersionModifiedTime() {
        return this.gmtLatestVersionModifiedTime;
    }

    public GetModelResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetModelResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetModelResponseBody setLatestVersion(ModelVersion latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
    }

    public GetModelResponseBody setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public GetModelResponseBody setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public GetModelResponseBody setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public GetModelResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public GetModelResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public GetModelResponseBody setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public GetModelResponseBody setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetModelResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetModelResponseBody setParameterSize(Long parameterSize) {
        this.parameterSize = parameterSize;
        return this;
    }
    public Long getParameterSize() {
        return this.parameterSize;
    }

    public GetModelResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelResponseBody setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public GetModelResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetModelResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
