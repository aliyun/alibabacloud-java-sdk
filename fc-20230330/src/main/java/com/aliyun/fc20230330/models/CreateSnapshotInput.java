// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateSnapshotInput extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>custom-test-session-id</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static CreateSnapshotInput build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotInput self = new CreateSnapshotInput();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSnapshotInput setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
