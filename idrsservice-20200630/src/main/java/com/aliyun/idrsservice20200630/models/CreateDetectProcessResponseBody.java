// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDetectProcessResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDetectProcessResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectProcessResponseBody self = new CreateDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDetectProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDetectProcessResponseBody setData(CreateDetectProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDetectProcessResponseBodyData getData() {
        return this.data;
    }

    public CreateDetectProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDetectProcessResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Disabled")
        public Boolean disabled;

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

        public static CreateDetectProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDetectProcessResponseBodyData self = new CreateDetectProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDetectProcessResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateDetectProcessResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateDetectProcessResponseBodyData setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public CreateDetectProcessResponseBodyData setDraft(String draft) {
            this.draft = draft;
            return this;
        }
        public String getDraft() {
            return this.draft;
        }

        public CreateDetectProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateDetectProcessResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreateDetectProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
