// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateLiveResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveResponseBody self = new UpdateLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLiveResponseBody setData(UpdateLiveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLiveResponseBodyData getData() {
        return this.data;
    }

    public UpdateLiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLiveResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        public static UpdateLiveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveResponseBodyData self = new UpdateLiveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLiveResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLiveResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
