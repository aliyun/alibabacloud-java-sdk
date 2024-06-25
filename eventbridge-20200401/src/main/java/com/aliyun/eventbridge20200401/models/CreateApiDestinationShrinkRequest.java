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
     * <p>The name of the connection. The name must be 2 to 127 characters in length.</p>
     * <blockquote>
     * <p> Before you configure this parameter, you must call the CreateConnection operation to create a connection. Then, set this parameter to the name of the connection that you created.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the API destination. The description can be up to 255 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The parameters that are configured for the API destination.</p>
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
