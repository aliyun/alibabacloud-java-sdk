// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UrlMode</p>
     */
    @NameInMap("ConnectionPropertiesMode")
    public String connectionPropertiesMode;

    /**
     * <strong>example:</strong>
     * <p>this is a holo datasource</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_datasource</p>
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

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    public CreateDataSourceRequest setConnectionPropertiesMode(String connectionPropertiesMode) {
        this.connectionPropertiesMode = connectionPropertiesMode;
        return this;
    }
    public String getConnectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    public CreateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataSourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataSourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataSourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
