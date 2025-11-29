// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelServiceResponseBody extends TeaModel {
    /**
     * <p>The list of AI nodes.</p>
     */
    @NameInMap("AiNodes")
    public java.util.List<String> aiNodes;

    /**
     * <p>The API key.</p>
     * 
     * <strong>example:</strong>
     * <p>cx/Y57lTNf*********</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-08T16:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-Embedding-8B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>Model parameters.</p>
     */
    @NameInMap("ModelParams")
    public java.util.Map<String, ?> modelParams;

    /**
     * <p>The model service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>The internal endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ms-xxxxxxx.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx.xxxx.rds.aliyuncs.com</a></p>
     */
    @NameInMap("PrivateConnectUrl")
    public String privateConnectUrl;

    /**
     * <p>The public endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com</a></p>
     */
    @NameInMap("PublicConnectUrl")
    public String publicConnectUrl;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A comma-separated list of IP addresses and CIDR blocks allowed to connect.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SecurityIpList")
    public String securityIpList;

    /**
     * <p>The status of the model service.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>deployming</li>
     * <li>active</li>
     * </ul>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelServiceResponseBody self = new DescribeModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelServiceResponseBody setAiNodes(java.util.List<String> aiNodes) {
        this.aiNodes = aiNodes;
        return this;
    }
    public java.util.List<String> getAiNodes() {
        return this.aiNodes;
    }

    public DescribeModelServiceResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeModelServiceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeModelServiceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeModelServiceResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeModelServiceResponseBody setModelParams(java.util.Map<String, ?> modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public java.util.Map<String, ?> getModelParams() {
        return this.modelParams;
    }

    public DescribeModelServiceResponseBody setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public DescribeModelServiceResponseBody setPrivateConnectUrl(String privateConnectUrl) {
        this.privateConnectUrl = privateConnectUrl;
        return this;
    }
    public String getPrivateConnectUrl() {
        return this.privateConnectUrl;
    }

    public DescribeModelServiceResponseBody setPublicConnectUrl(String publicConnectUrl) {
        this.publicConnectUrl = publicConnectUrl;
        return this;
    }
    public String getPublicConnectUrl() {
        return this.publicConnectUrl;
    }

    public DescribeModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeModelServiceResponseBody setSecurityIpList(String securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public String getSecurityIpList() {
        return this.securityIpList;
    }

    public DescribeModelServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
