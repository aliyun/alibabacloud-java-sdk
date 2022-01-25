// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLiveRecordTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordTemplateResponseBody self = new UpdateLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLiveRecordTemplateResponseBody setData(UpdateLiveRecordTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLiveRecordTemplateResponseBodyData getData() {
        return this.data;
    }

    public UpdateLiveRecordTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLiveRecordTemplateResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        public static UpdateLiveRecordTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveRecordTemplateResponseBodyData self = new UpdateLiveRecordTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLiveRecordTemplateResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLiveRecordTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
