// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDetectProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateDetectProcessResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectProcessResponseBody self = new UpdateDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDetectProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDetectProcessResponseBody setData(UpdateDetectProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDetectProcessResponseBodyData getData() {
        return this.data;
    }

    public UpdateDetectProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDetectProcessResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Draft")
        public String draft;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        public static UpdateDetectProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDetectProcessResponseBodyData self = new UpdateDetectProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDetectProcessResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateDetectProcessResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateDetectProcessResponseBodyData setDraft(String draft) {
            this.draft = draft;
            return this;
        }
        public String getDraft() {
            return this.draft;
        }

        public UpdateDetectProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateDetectProcessResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public UpdateDetectProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
