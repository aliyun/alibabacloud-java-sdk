// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    /**
     * <p>The ID of the data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectionId")
    public Long connectionId;

    /**
     * <p>Details of the data source.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Describes the data source.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Environment of the data source.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The status of the data source.</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionRequest self = new UpdateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionRequest setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public Long getConnectionId() {
        return this.connectionId;
    }

    public UpdateConnectionRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
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

    public UpdateConnectionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
