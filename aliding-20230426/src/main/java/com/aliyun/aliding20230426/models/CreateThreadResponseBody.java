// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateThreadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("thread")
    public CreateThreadResponseBodyThread thread;

    public static CreateThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadResponseBody self = new CreateThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateThreadResponseBody setThread(CreateThreadResponseBodyThread thread) {
        this.thread = thread;
        return this;
    }
    public CreateThreadResponseBodyThread getThread() {
        return this.thread;
    }

    public static class CreateThreadResponseBodyThread extends TeaModel {
        @NameInMap("createAt")
        public Long createAt;

        @NameInMap("id")
        public String id;

        public static CreateThreadResponseBodyThread build(java.util.Map<String, ?> map) throws Exception {
            CreateThreadResponseBodyThread self = new CreateThreadResponseBodyThread();
            return TeaModel.build(map, self);
        }

        public CreateThreadResponseBodyThread setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public CreateThreadResponseBodyThread setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
