// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelServiceRequest extends TeaModel {
    /**
     * <p>A list of AINodes on which to deploy the model.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AiNodes")
    public java.util.List<String> aiNodes;

    /**
     * <p>A token to ensure the idempotence of the request. For more information, see <a href="https://help.aliyun.com/document_detail/327176.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the instance.</p>
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
     * <p>The description of the model service.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable a public network connection.</p>
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
     * <p>The name of the model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-Embedding-8B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model parameters. This parameter is not yet supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not yet available.</p>
     */
    @NameInMap("ModelParams")
    public java.util.Map<String, ?> modelParams;

    /**
     * <p>The number of model service replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP whitelist.</p>
     * <p>Set this parameter to <code>127.0.0.1</code> to deny access from all external IP addresses. After the model service is created, you can call the <a href="https://help.aliyun.com/document_detail/86928.html">ModifySecurityIps</a> operation to modify the IP whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    public static CreateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceRequest self = new CreateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceRequest setAiNodes(java.util.List<String> aiNodes) {
        this.aiNodes = aiNodes;
        return this;
    }
    public java.util.List<String> getAiNodes() {
        return this.aiNodes;
    }

    public CreateModelServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateModelServiceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateModelServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateModelServiceRequest setEnablePublicConnection(Boolean enablePublicConnection) {
        this.enablePublicConnection = enablePublicConnection;
        return this;
    }
    public Boolean getEnablePublicConnection() {
        return this.enablePublicConnection;
    }

    public CreateModelServiceRequest setInferenceEngine(String inferenceEngine) {
        this.inferenceEngine = inferenceEngine;
        return this;
    }
    public String getInferenceEngine() {
        return this.inferenceEngine;
    }

    public CreateModelServiceRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateModelServiceRequest setModelParams(java.util.Map<String, ?> modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public java.util.Map<String, ?> getModelParams() {
        return this.modelParams;
    }

    public CreateModelServiceRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateModelServiceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateModelServiceRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

}
