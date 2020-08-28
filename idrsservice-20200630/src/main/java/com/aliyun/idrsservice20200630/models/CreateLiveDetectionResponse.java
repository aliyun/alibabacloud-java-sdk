// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveDetectionResponse extends TeaModel {
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
    public CreateLiveDetectionResponseData data;

    public static CreateLiveDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveDetectionResponse self = new CreateLiveDetectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLiveDetectionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLiveDetectionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLiveDetectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveDetectionResponse setData(CreateLiveDetectionResponseData data) {
        this.data = data;
        return this;
    }
    public CreateLiveDetectionResponseData getData() {
        return this.data;
    }

    public static class CreateLiveDetectionResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static CreateLiveDetectionResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveDetectionResponseData self = new CreateLiveDetectionResponseData();
            return TeaModel.build(map, self);
        }

        public CreateLiveDetectionResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
