// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteWorkflowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkflowRequest self = new DeleteWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkflowRequest setClientUniqueCode(String clientUniqueCode) {
        this.clientUniqueCode = clientUniqueCode;
        return this;
    }
    public String getClientUniqueCode() {
        return this.clientUniqueCode;
    }

    public DeleteWorkflowRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public DeleteWorkflowRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
