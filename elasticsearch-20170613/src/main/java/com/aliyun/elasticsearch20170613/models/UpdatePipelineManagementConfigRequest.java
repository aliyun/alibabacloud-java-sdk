// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelineManagementConfigRequest extends TeaModel {
    @NameInMap("endpoints")
    public java.util.List<String> endpoints;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    @NameInMap("pipelineIds")
    public java.util.List<String> pipelineIds;

    /**
     * <strong>example:</strong>
     * <p>ES</p>
     */
    @NameInMap("pipelineManagementType")
    public String pipelineManagementType;

    /**
     * <strong>example:</strong>
     * <p>elastic</p>
     */
    @NameInMap("userName")
    public String userName;

    /**
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
