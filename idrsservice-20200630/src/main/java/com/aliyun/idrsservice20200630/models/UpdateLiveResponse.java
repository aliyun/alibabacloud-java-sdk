// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateLiveResponse extends TeaModel {
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
    public UpdateLiveResponseData data;

    public static UpdateLiveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveResponse self = new UpdateLiveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateLiveResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLiveResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLiveResponse setData(UpdateLiveResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateLiveResponseData getData() {
        return this.data;
    }

    public static class UpdateLiveResponseData extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static UpdateLiveResponseData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveResponseData self = new UpdateLiveResponseData();
            return TeaModel.build(map, self);
        }

        public UpdateLiveResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
