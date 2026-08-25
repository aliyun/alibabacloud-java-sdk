// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteWorkflowRequest extends TeaModel {
    /**
     * <p>The client unique code of the workflow, which is used to implement asynchronous operations and idempotence. If you do not specify this parameter during creation, the system automatically generates one. This code is uniquely bound to the resource ID. If you specify this parameter during update or deletion, it must be the same as the client unique code specified during creation.</p>
     * 
     * <strong>example:</strong>
     * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
     */
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production</li>
     * <li>Dev: development</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The unique identifier of the workflow.</p>
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
