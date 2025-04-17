// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelRequest extends TeaModel {
    /**
     * <p>The visibility of the model in the workspace. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): Visible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: Visible to all users in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The domain of the model. Describes the domain in which the model is for. Example: nlp (Natural Language Processing), cv (computer vision), and others.</p>
     * 
     * <strong>example:</strong>
     * <p>nlp</p>
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
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The model description, which is used to distinguish different models.</p>
     */
    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <p>The documentation of the model.</p>
     * 
     * <strong>example:</strong>
     * <p>https://*.md</p>
     */
    @NameInMap("ModelDoc")
    public String modelDoc;

    /**
     * <p>The name of the model. The name must be 1 to 127 characters in length.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type. Example: Checkpoint or LoRA.</p>
     * 
     * <strong>example:</strong>
     * <p>Checkpoint</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The sequence number of the model. Can be used for custom sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <p>The source of the model. The community or organization to which the source model belongs, such as ModelScope or HuggingFace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The task of the model. Describes the specific problem that the model solves. Example: text-classification.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("Task")
    public String task;

    /**
     * <p>The workspace ID. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>796**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelRequest self = new CreateModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public CreateModelRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateModelRequest setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public CreateModelRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateModelRequest setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public CreateModelRequest setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public CreateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateModelRequest setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public CreateModelRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public CreateModelRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

    public CreateModelRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
