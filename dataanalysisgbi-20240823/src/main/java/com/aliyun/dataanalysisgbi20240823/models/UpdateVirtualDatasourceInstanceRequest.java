// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateVirtualDatasourceInstanceRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public Integer type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vdb-E0F693C8-9F72-5830-B81A-696C9D8EBBD1</p>
     */
    @NameInMap("vdbId")
    public String vdbId;

    /**
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateVirtualDatasourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualDatasourceInstanceRequest self = new UpdateVirtualDatasourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualDatasourceInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVirtualDatasourceInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVirtualDatasourceInstanceRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public UpdateVirtualDatasourceInstanceRequest setVdbId(String vdbId) {
        this.vdbId = vdbId;
        return this;
    }
    public String getVdbId() {
        return this.vdbId;
    }

    public UpdateVirtualDatasourceInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
