// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
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
        /**
         * <p>The extended field.</p>
         * 
         * <strong>example:</strong>
         * <p>test001</p>
         */
        @NameInMap("Extension")
        public java.util.Map<String, ?> extension;

        /**
         * <p>The ID of the message group.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
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
