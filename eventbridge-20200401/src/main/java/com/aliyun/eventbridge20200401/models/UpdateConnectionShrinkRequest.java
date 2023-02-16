// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateConnectionShrinkRequest extends TeaModel {
    @NameInMap("AuthParameters")
    public String authParametersShrink;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkParameters")
    public String networkParametersShrink;

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

}
