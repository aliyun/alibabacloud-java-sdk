// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayForPayUrlResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Model")
    public RepayForPayUrlResponseBodyModel model;

    @NameInMap("Code")
    public String code;

    public static RepayForPayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RepayForPayUrlResponseBody self = new RepayForPayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public RepayForPayUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RepayForPayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepayForPayUrlResponseBody setModel(RepayForPayUrlResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RepayForPayUrlResponseBodyModel getModel() {
        return this.model;
    }

    public RepayForPayUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class RepayForPayUrlResponseBodyModel extends TeaModel {
        @NameInMap("FrontUrl")
        public String frontUrl;

        public static RepayForPayUrlResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RepayForPayUrlResponseBodyModel self = new RepayForPayUrlResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RepayForPayUrlResponseBodyModel setFrontUrl(String frontUrl) {
            this.frontUrl = frontUrl;
            return this;
        }
        public String getFrontUrl() {
            return this.frontUrl;
        }

    }

}
