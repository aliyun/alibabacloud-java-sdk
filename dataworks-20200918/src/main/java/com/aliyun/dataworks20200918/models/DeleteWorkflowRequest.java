// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteWorkflowRequest extends TeaModel {
    @NameInMap("ClientUniqueCode")
    public String clientUniqueCode;

    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
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
