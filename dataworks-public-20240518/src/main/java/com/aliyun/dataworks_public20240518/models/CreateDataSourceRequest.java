// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
     * <p>The specific connection configuration of the data source, including the endpoint, access identity, and environment context. The envType property of this object specifies the data source environment. Valid values:</p>
     * <ul>
     * <li>Dev: Development environment.</li>
     * <li>Prod: Production environment.</li>
     * </ul>
     * <p>Different data source types have different property specifications in different configuration patterns (ConnectionPropertiesMode). For more information, see <a href="https://help.aliyun.com/document_detail/2852465.html">ConnectionProperties</a>.</p>
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
     * <p>The category in which the data source is added. Different data source types have different subtypes and parameter constraints. For example, a MySQL data source supports the following modes:</p>
     * <ul>
     * <li>InstanceMode: Instance mode.</li>
     * <li>UrlMode: Connection string mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>this is a holo datasource</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the data source. The name can contain letters, digits, and underscores (_), and cannot start with a digit or an underscore. The name can be up to 255 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_holo_datasource</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://dataworks.console.aliyun.com/overview">DataWorks console</a> and go to the Workspace Management page to obtain the ID.</p>
     * <p>This parameter specifies the DataWorks workspace used for this API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the data source. More than 70 data source types are supported. References: <a href="https://help.aliyun.com/document_detail/2852465.html">Data source types</a>.</p>
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
