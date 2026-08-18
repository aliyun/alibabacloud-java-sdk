// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComputeResourceRequest extends TeaModel {
    /**
     * <p>The connection configuration of the compute resource, including the endpoint, access identity, and environment context. The EnvType field is a member property of this object and specifies the environment of the compute resource. Valid values: DEV (development environment) and PROD (production environment). The EnvType value is case-insensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;EndpointMode&quot;: &quot;custom&quot;,     &quot;Database&quot;: &quot;testdb&quot;,     &quot;TaskSubmitter&quot;: &quot;1107550004253538&quot;,     &quot;InstanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,     &quot;SecurityProtocol&quot;: &quot;authTypeNone&quot;,     &quot;RegionId&quot;: &quot;cn-beijing&quot;,     &quot;EnvType&quot;: &quot;Prod&quot;,     &quot;AuthType&quot;: &quot;Executor&quot; }</p>
     */
    @NameInMap("ConnectionProperties")
    public String connectionProperties;

    /**
     * <p>The category for adding the compute resource. Different types have different subtypes with different parameter constraints. For example, a Hologres compute resource supports InstanceMode (instance mode) and UrlMode (connection string mode).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceMode</p>
     */
    @NameInMap("ConnectionPropertiesMode")
    public String connectionPropertiesMode;

    /**
     * <p>The description of the compute resource. The description can be up to 3,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_cs</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the compute resource. The name can contain letters, digits, and underscores (_), and cannot start with a digit or underscore. The name can be up to 255 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_cs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the compute resource. Multiple compute resource types are supported.</p>
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
