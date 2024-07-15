// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    /**
     * <p>The alias information to be updated.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateAliasInput body;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setBody(UpdateAliasInput body) {
        this.body = body;
        return this;
    }
    public UpdateAliasInput getBody() {
        return this.body;
    }

}
