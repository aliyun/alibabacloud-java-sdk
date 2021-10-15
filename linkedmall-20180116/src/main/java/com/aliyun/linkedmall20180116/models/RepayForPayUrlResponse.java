// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayForPayUrlResponse extends TeaModel {
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
    public RepayForPayUrlResponseModel model;

    public static RepayForPayUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        RepayForPayUrlResponse self = new RepayForPayUrlResponse();
        return TeaModel.build(map, self);
    }

    public RepayForPayUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RepayForPayUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RepayForPayUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepayForPayUrlResponse setModel(RepayForPayUrlResponseModel model) {
        this.model = model;
        return this;
    }
    public RepayForPayUrlResponseModel getModel() {
        return this.model;
    }

    public static class RepayForPayUrlResponseModel extends TeaModel {
        @NameInMap("FrontUrl")
        @Validation(required = true)
        public String frontUrl;

        public static RepayForPayUrlResponseModel build(java.util.Map<String, ?> map) throws Exception {
            RepayForPayUrlResponseModel self = new RepayForPayUrlResponseModel();
            return TeaModel.build(map, self);
        }

        public RepayForPayUrlResponseModel setFrontUrl(String frontUrl) {
            this.frontUrl = frontUrl;
            return this;
        }
        public String getFrontUrl() {
            return this.frontUrl;
        }

    }

}
