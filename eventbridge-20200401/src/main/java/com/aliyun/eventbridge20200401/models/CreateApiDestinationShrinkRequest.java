// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationShrinkRequest extends TeaModel {
    /**
     * <p>The name of the API destination. The name must be 2 to 127 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api-destination-name</p>
     */
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    /**
     * <p>The name of the connection configuration. The name must be 2 to 127 characters in length.
     * <notice>You must first call the Connection operation to create a connection configuration, and specify an existing connection name for ConnectionName.</notice></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the API destination. The description can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is the description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration information of the API destination.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HttpApiParameters")
    public String httpApiParametersShrink;

    public static CreateApiDestinationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiDestinationShrinkRequest self = new CreateApiDestinationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiDestinationShrinkRequest setApiDestinationName(String apiDestinationName) {
        this.apiDestinationName = apiDestinationName;
        return this;
    }
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    public CreateApiDestinationShrinkRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateApiDestinationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiDestinationShrinkRequest setHttpApiParametersShrink(String httpApiParametersShrink) {
        this.httpApiParametersShrink = httpApiParametersShrink;
        return this;
    }
    public String getHttpApiParametersShrink() {
        return this.httpApiParametersShrink;
    }

}
