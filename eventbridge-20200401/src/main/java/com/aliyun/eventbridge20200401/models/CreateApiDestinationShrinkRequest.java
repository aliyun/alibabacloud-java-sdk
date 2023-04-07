// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationShrinkRequest extends TeaModel {
    @NameInMap("ApiDestinationName")
    public String apiDestinationName;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

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
