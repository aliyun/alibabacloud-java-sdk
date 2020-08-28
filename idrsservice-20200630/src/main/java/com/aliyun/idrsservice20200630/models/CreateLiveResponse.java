// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateLiveResponseData data;

    public static CreateLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveResponse self = new CreateLiveResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLiveResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveResponse setData(CreateLiveResponseData data) {
        this.data = data;
        return this;
    }
    public CreateLiveResponseData getData() {
        return this.data;
    }

    public static class CreateLiveResponseData extends TeaModel {
        @NameInMap("Channel")
        @Validation(required = true)
        public String channel;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static CreateLiveResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveResponseData self = new CreateLiveResponseData();
            return TeaModel.build(map, self);
        }

        public CreateLiveResponseData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateLiveResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLiveResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
