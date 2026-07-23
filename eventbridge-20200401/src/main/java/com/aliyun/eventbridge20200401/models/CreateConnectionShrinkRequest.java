// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionShrinkRequest extends TeaModel {
    /**
     * <p>The authentication configuration.</p>
     */
    @NameInMap("AuthParameters")
    public String authParametersShrink;

    /**
     * <p>The connection configuration name. Maximum length: 127 characters. Minimum length: 2 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the connection configuration. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public String networkParametersShrink;

    /**
     * <p>The data source connection parameters (JSON object). This parameter is required when Type is set to a data source type. This parameter is not required for the Http type. For specific field definitions, call the GetConnectionType operation and refer to ParamsSchema in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, and Http. This parameter is required for data source connections. If this parameter is not specified, the default value Http is used. The Http type is used for HTTP protocol targets such as API Destination. Data source types are used for data connections in the integration marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateConnectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionShrinkRequest self = new CreateConnectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionShrinkRequest setAuthParametersShrink(String authParametersShrink) {
        this.authParametersShrink = authParametersShrink;
        return this;
    }
    public String getAuthParametersShrink() {
        return this.authParametersShrink;
    }

    public CreateConnectionShrinkRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateConnectionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConnectionShrinkRequest setNetworkParametersShrink(String networkParametersShrink) {
        this.networkParametersShrink = networkParametersShrink;
        return this;
    }
    public String getNetworkParametersShrink() {
        return this.networkParametersShrink;
    }

    public CreateConnectionShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public CreateConnectionShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
