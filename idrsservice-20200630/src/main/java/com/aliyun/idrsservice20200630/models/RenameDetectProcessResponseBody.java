// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class RenameDetectProcessResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RenameDetectProcessResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static RenameDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameDetectProcessResponseBody self = new RenameDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameDetectProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RenameDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenameDetectProcessResponseBody setData(RenameDetectProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenameDetectProcessResponseBodyData getData() {
        return this.data;
    }

    public RenameDetectProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RenameDetectProcessResponseBodyData extends TeaModel {
        @NameInMap("Draft")
        public String draft;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static RenameDetectProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenameDetectProcessResponseBodyData self = new RenameDetectProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenameDetectProcessResponseBodyData setDraft(String draft) {
            this.draft = draft;
            return this;
        }
        public String getDraft() {
            return this.draft;
        }

        public RenameDetectProcessResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RenameDetectProcessResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public RenameDetectProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RenameDetectProcessResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RenameDetectProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
