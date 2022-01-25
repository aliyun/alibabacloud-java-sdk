// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLiveResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveResponseBody self = new CreateLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLiveResponseBody setData(CreateLiveResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLiveResponseBodyData getData() {
        return this.data;
    }

    public CreateLiveResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLiveResponseBodyData extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static CreateLiveResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveResponseBodyData self = new CreateLiveResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLiveResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateLiveResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLiveResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLiveResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
