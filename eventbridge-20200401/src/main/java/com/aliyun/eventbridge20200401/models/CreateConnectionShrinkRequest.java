// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are configured for authentication.</p>
     */
    @NameInMap("AuthParameters")
    public String authParametersShrink;

    /**
     * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the connection. The description can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters that are configured for the network.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public String networkParametersShrink;

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

}
