// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProjectRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("identifier")
    public String identifier;

    public static DeleteProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRequest self = new DeleteProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
