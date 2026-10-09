// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <p>The specific connection configuration of the data source, including the endpoint, access identity, and environment context. The EnvType property of the data source environment is a member attribute of this object. Valid values:</p>
     * <ul>
     * <li>Dev: development environment.</li>
     * <li>Prod: production environment.</li>
     * </ul>
     * <p>Different types of data sources have different attribute specifications in different configuration patterns (ConnectionPropertiesMode). For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">Connection properties</a>.</p>
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
     * <p>The category used to add the data source. Different types have different subtypes and corresponding parameter constraints. Examples:</p>
     * <ul>
     * <li>InstanceMode: instance mode.</li>
     * <li>UrlMode: connection string mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UrlMode</p>
     */
    @NameInMap("ConnectionPropertiesMode")
    public String connectionPropertiesMode;

    /**
     * <p>The description of the data source. The description can be up to 3,000 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The unique identifier of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16033</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5678</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
    }
    public String getConnectionProperties() {
        return this.connectionProperties;
    }

    public UpdateDataSourceRequest setConnectionPropertiesMode(String connectionPropertiesMode) {
        this.connectionPropertiesMode = connectionPropertiesMode;
        return this;
    }
    public String getConnectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    public UpdateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataSourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataSourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
