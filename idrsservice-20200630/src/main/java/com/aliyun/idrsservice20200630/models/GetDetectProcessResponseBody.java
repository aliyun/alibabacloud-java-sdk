// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectProcessResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetDetectProcessResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetDetectProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectProcessResponseBody self = new GetDetectProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectProcessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetectProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetectProcessResponseBody setData(GetDetectProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDetectProcessResponseBodyData getData() {
        return this.data;
    }

    public GetDetectProcessResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetDetectProcessResponseBodyData extends TeaModel {
        @NameInMap("Draft")
        public String draft;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewVersion")
        public Boolean newVersion;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public String id;

        public static GetDetectProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDetectProcessResponseBodyData self = new GetDetectProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDetectProcessResponseBodyData setDraft(String draft) {
            this.draft = draft;
            return this;
        }
        public String getDraft() {
            return this.draft;
        }

        public GetDetectProcessResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDetectProcessResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetDetectProcessResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetDetectProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDetectProcessResponseBodyData setNewVersion(Boolean newVersion) {
            this.newVersion = newVersion;
            return this;
        }
        public Boolean getNewVersion() {
            return this.newVersion;
        }

        public GetDetectProcessResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDetectProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
