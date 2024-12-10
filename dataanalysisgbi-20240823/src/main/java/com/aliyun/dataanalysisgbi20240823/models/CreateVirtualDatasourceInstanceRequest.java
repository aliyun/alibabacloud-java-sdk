// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class CreateVirtualDatasourceInstanceRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>virtual-instance-1</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public Integer type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CreateVirtualDatasourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualDatasourceInstanceRequest self = new CreateVirtualDatasourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualDatasourceInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVirtualDatasourceInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVirtualDatasourceInstanceRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public CreateVirtualDatasourceInstanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
