// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteWorkitemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    public static DeleteWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkitemRequest self = new DeleteWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkitemRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
