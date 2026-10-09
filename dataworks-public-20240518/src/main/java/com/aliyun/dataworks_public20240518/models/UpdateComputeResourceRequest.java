// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceRequest extends TeaModel {
    /**
     * <p>The specific connection configuration information of the compute resource, including the endpoint, access identity, and environment context. The EnvType property of the compute resource environment is a member attribute of this object. Valid values include DEV (development environment) and PROD (production environment). The value is case-insensitive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;envType&quot;: &quot;Prod&quot;,
     *     &quot;regionId&quot;: &quot;cn-beijing&quot;,
     *     &quot;instanceId&quot;: &quot;hgprecn-cn-x0r3oun4k001&quot;,
     *     &quot;database&quot;: &quot;testdb&quot;,
     *     &quot;securityProtocol&quot;: &quot;authTypeNone&quot;,
     *     &quot;authType&quot;: &quot;Executor&quot;,
     *     &quot;authIdentity&quot;: &quot;1107550004253538&quot;
     * }</p>
     */
    @NameInMap("ConnectionProperties")
    public String connectionProperties;

    /**
     * <p>The category of the added compute resource. Different types have different subtypes, which correspond to different parameter schema constraints. Examples: InstanceMode for instance mode and UrlMode for connection string mode.</p>
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
     * <p>Hierarchical description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The compute resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateComputeResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceRequest self = new UpdateComputeResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceRequest setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    public UpdateComputeResourceRequest setConnectionPropertiesMode(String connectionPropertiesMode) {
        this.connectionPropertiesMode = connectionPropertiesMode;
        return this;
    }
    public String getConnectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    public UpdateComputeResourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateComputeResourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateComputeResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
