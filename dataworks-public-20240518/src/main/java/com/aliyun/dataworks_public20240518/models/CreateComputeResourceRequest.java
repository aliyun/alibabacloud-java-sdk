// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComputeResourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;EndpointMode&quot;: &quot;custom&quot;,     &quot;Database&quot;: &quot;testdb&quot;,     &quot;TaskSubmitter&quot;: &quot;1107550004253538&quot;,     &quot;InstanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,     &quot;SecurityProtocol&quot;: &quot;authTypeNone&quot;,     &quot;RegionId&quot;: &quot;cn-beijing&quot;,     &quot;EnvType&quot;: &quot;Prod&quot;,     &quot;AuthType&quot;: &quot;Executor&quot; }</p>
     */
    @NameInMap("ConnectionProperties")
    public String connectionProperties;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConnectionPropertiesMode")
    public String connectionPropertiesMode;

    /**
     * <strong>example:</strong>
     * <p>demo_holo_cs</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_cs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hologres</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateComputeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeResourceRequest self = new CreateComputeResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeResourceRequest setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    public CreateComputeResourceRequest setConnectionPropertiesMode(String connectionPropertiesMode) {
        this.connectionPropertiesMode = connectionPropertiesMode;
        return this;
    }
    public String getConnectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    public CreateComputeResourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateComputeResourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateComputeResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
