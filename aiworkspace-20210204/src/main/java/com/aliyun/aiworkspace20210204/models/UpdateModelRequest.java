// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelRequest extends TeaModel {
    /**
     * <p>The visibility of the model in the workspace. Valid values:</p>
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
     * <p>The domain of the model. This parameter specifies the field where the model is applied. Examples: nlp (natural language processing) and cv (computer vision).</p>
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
     */
    @NameInMap("ExtraInfo")
    public java.util.Map<String, ?> extraInfo;

    /**
     * <p>The model description.</p>
     * 
     * <strong>example:</strong>
     * <p>News classification.</p>
     */
    @NameInMap("ModelDescription")
    public String modelDescription;

    /**
     * <p>The model document.</p>
     * 
     * <strong>example:</strong>
     * <p>https://*.md</p>
     */
    @NameInMap("ModelDoc")
    public String modelDoc;

    /**
     * <p>The name of the model. The name must be 1 to 127 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>News classification</p>
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
     * <p>The ordinal number of the model. You can use this parameter for custom sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <p>The source of the model. This parameter describes the community or organization to which the source model belongs, such as ModelScope and HuggingFace.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelScope</p>
     */
    @NameInMap("Origin")
    public String origin;

    /**
     * <p>The number of parameters, in millions.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("ParameterSize")
    public Long parameterSize;

    /**
     * <p>The task of the model. This parameter describes the specific problem that the model solves. For example, text-classification.</p>
     * 
     * <strong>example:</strong>
     * <p>text-classification</p>
     */
    @NameInMap("Task")
    public String task;

    public static UpdateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelRequest self = new UpdateModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateModelRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateModelRequest setExtraInfo(java.util.Map<String, ?> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateModelRequest setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
        return this;
    }
    public String getModelDescription() {
        return this.modelDescription;
    }

    public UpdateModelRequest setModelDoc(String modelDoc) {
        this.modelDoc = modelDoc;
        return this;
    }
    public String getModelDoc() {
        return this.modelDoc;
    }

    public UpdateModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateModelRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public UpdateModelRequest setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public UpdateModelRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public UpdateModelRequest setParameterSize(Long parameterSize) {
        this.parameterSize = parameterSize;
        return this;
    }
    public Long getParameterSize() {
        return this.parameterSize;
    }

    public UpdateModelRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
