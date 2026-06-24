// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigRequest extends TeaModel {
    /**
     * <p>The list of access addresses of the Elasticsearch instance where Kibana resides after Kibana pipeline management is enabled.</p>
     */
    @NameInMap("endpoints")
    public java.util.List<String> endpoints;

    @NameInMap("esInstanceId")
    public String esInstanceId;

    /**
     * <p>The password used to log on to Kibana.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The list of pipelines managed by Kibana.</p>
     */
    @NameInMap("pipelineIds")
    public java.util.List<String> pipelineIds;

    /**
     * <p>The pipeline management method. Valid values:</p>
     * <ul>
     * <li>ES: Kibana pipeline management.</li>
     * <li>MULTIPLE_PIPELINE: configuration file management.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ES</p>
     */
    @NameInMap("pipelineManagementType")
    public String pipelineManagementType;

    /**
     * <p>The username used to log on to Kibana.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic</p>
     */
    @NameInMap("userName")
    public String userName;

    /**
     * <p>A unique token used to ensure idempotence of the request. The client generates this value. The value must be unique across different requests and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdatePipelineManagementConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineManagementConfigRequest self = new UpdatePipelineManagementConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineManagementConfigRequest setEndpoints(java.util.List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<String> getEndpoints() {
        return this.endpoints;
    }

    public UpdatePipelineManagementConfigRequest setEsInstanceId(String esInstanceId) {
        this.esInstanceId = esInstanceId;
        return this;
    }
    public String getEsInstanceId() {
        return this.esInstanceId;
    }

    public UpdatePipelineManagementConfigRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdatePipelineManagementConfigRequest setPipelineIds(java.util.List<String> pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }
    public java.util.List<String> getPipelineIds() {
        return this.pipelineIds;
    }

    public UpdatePipelineManagementConfigRequest setPipelineManagementType(String pipelineManagementType) {
        this.pipelineManagementType = pipelineManagementType;
        return this;
    }
    public String getPipelineManagementType() {
        return this.pipelineManagementType;
    }

    public UpdatePipelineManagementConfigRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public UpdatePipelineManagementConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
