// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateMessageGroupResponseBodyResult result;

    public static CreateMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageGroupResponseBody self = new CreateMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMessageGroupResponseBody setResult(CreateMessageGroupResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMessageGroupResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateMessageGroupResponseBodyResult extends TeaModel {
        @NameInMap("Extension")
        public java.util.Map<String, ?> extension;

        @NameInMap("GroupId")
        public String groupId;

        public static CreateMessageGroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMessageGroupResponseBodyResult self = new CreateMessageGroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMessageGroupResponseBodyResult setExtension(java.util.Map<String, ?> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, ?> getExtension() {
            return this.extension;
        }

        public CreateMessageGroupResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
