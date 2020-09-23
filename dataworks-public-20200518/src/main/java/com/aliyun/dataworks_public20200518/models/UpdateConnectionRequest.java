// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Content")
    public String content;

    @NameInMap("Status")
    public String status;

    @NameInMap("ConnectionId")
    @Validation(required = true)
    public Long connectionId;

    public static UpdateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionRequest self = new UpdateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConnectionRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateConnectionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateConnectionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateConnectionRequest setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public Long getConnectionId() {
        return this.connectionId;
    }

}
