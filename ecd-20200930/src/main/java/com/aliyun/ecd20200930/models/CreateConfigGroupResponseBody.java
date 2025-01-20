// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateConfigGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ccg-0ctwi5zbswtql****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE9472BC-0B5D-5458-85CD-C52BDD******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigGroupResponseBody self = new CreateConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateConfigGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
