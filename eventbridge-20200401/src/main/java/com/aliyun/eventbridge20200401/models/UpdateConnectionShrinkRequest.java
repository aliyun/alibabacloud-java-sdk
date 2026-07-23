// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateConnectionShrinkRequest extends TeaModel {
    /**
     * <p>The data structure of the authentication parameters.</p>
     */
    @NameInMap("AuthParameters")
    public String authParametersShrink;

    /**
     * <p>The name of the connection to be updated. The maximum length is 127 characters. The minimum length is 2 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the connection configuration</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data structure of the network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public String networkParametersShrink;

    /**
     * <p>The data source connection parameters (JSON object). For specific field definitions, call the GetConnectionType API and refer to the ParamsSchema in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parametersShrink;

    /**
     * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, and Http.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateConnectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionShrinkRequest self = new UpdateConnectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionShrinkRequest setAuthParametersShrink(String authParametersShrink) {
        this.authParametersShrink = authParametersShrink;
        return this;
    }
    public String getAuthParametersShrink() {
        return this.authParametersShrink;
    }

    public UpdateConnectionShrinkRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateConnectionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConnectionShrinkRequest setNetworkParametersShrink(String networkParametersShrink) {
        this.networkParametersShrink = networkParametersShrink;
        return this;
    }
    public String getNetworkParametersShrink() {
        return this.networkParametersShrink;
    }

    public UpdateConnectionShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public UpdateConnectionShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
