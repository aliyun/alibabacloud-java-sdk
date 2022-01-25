// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateLiveDetectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLiveDetectionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveDetectionResponseBody self = new CreateLiveDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLiveDetectionResponseBody setData(CreateLiveDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLiveDetectionResponseBodyData getData() {
        return this.data;
    }

    public CreateLiveDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLiveDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLiveDetectionResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateLiveDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveDetectionResponseBodyData self = new CreateLiveDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLiveDetectionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
