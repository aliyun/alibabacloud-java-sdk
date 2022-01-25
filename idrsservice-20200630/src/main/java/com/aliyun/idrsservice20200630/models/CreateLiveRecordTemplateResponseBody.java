// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLiveRecordTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateResponseBody self = new CreateLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLiveRecordTemplateResponseBody setData(CreateLiveRecordTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLiveRecordTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateLiveRecordTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLiveRecordTemplateResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        public static CreateLiveRecordTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordTemplateResponseBodyData self = new CreateLiveRecordTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordTemplateResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLiveRecordTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
