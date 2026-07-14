// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelServiceShrinkRequest extends TeaModel {
    /**
     * <p>The list of AI nodes used for model deployment.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AiNodes")
    public String aiNodesShrink;

    /**
     * <p>The idempotency check. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable public network access.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePublicConnection")
    public Boolean enablePublicConnection;

    /**
     * <p>The inference engine. Currently, only vllm is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vllm</p>
     */
    @NameInMap("InferenceEngine")
    public String inferenceEngine;

    /**
     * <p>The model name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-Embedding-8B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model parameters. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not yet available.</p>
     */
    @NameInMap("ModelParams")
    public String modelParamsShrink;

    /**
     * <p>The number of model service replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The ID of the resource group to which the instance belongs. For information about how to obtain the resource group ID, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP whitelist.</p>
     * <p>The value 127.0.0.1 indicates that no external IP addresses are allowed to access the instance. After the instance is created, you can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static CreateModelServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceShrinkRequest self = new CreateModelServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceShrinkRequest setAiNodesShrink(String aiNodesShrink) {
        this.aiNodesShrink = aiNodesShrink;
        return this;
    }
    public String getAiNodesShrink() {
        return this.aiNodesShrink;
    }

    public CreateModelServiceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelServiceShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateModelServiceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelServiceShrinkRequest setEnablePublicConnection(Boolean enablePublicConnection) {
        this.enablePublicConnection = enablePublicConnection;
        return this;
    }
    public Boolean getEnablePublicConnection() {
        return this.enablePublicConnection;
    }

    public CreateModelServiceShrinkRequest setInferenceEngine(String inferenceEngine) {
        this.inferenceEngine = inferenceEngine;
        return this;
    }
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    public CreateModelServiceShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelServiceShrinkRequest setModelParamsShrink(String modelParamsShrink) {
        this.modelParamsShrink = modelParamsShrink;
        return this;
    }
    public String getModelParamsShrink() {
        return this.modelParamsShrink;
    }

    public CreateModelServiceShrinkRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateModelServiceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateModelServiceShrinkRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
