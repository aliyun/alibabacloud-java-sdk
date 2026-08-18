// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSnapshotRequest extends TeaModel {
    @NameInMap("body")
    public CreateSnapshotInput body;

    /**
     * <strong>example:</strong>
     * <p>alias</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    public static CreateSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotRequest self = new CreateSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotRequest setBody(CreateSnapshotInput body) {
        this.body = body;
        return this;
    }
    public CreateSnapshotInput getBody() {
        return this.body;
    }

    public CreateSnapshotRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
