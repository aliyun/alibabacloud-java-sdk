// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetUserTokenPageResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public GetUserTokenPageResponseModel model;

    public static GetUserTokenPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenPageResponse self = new GetUserTokenPageResponse();
        return TeaModel.build(map, self);
    }

    public GetUserTokenPageResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserTokenPageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserTokenPageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserTokenPageResponse setModel(GetUserTokenPageResponseModel model) {
        this.model = model;
        return this;
    }
    public GetUserTokenPageResponseModel getModel() {
        return this.model;
    }

    public static class GetUserTokenPageResponseModel extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static GetUserTokenPageResponseModel build(java.util.Map<String, ?> map) throws Exception {
            GetUserTokenPageResponseModel self = new GetUserTokenPageResponseModel();
            return TeaModel.build(map, self);
        }

        public GetUserTokenPageResponseModel setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
