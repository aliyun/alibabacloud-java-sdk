// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayForPayUrlResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>The specified parameter %s value is not valid.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RepayForPayUrlResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>1AF23E47-D8FB-576A-B069-CA98B4DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RepayForPayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RepayForPayUrlResponseBody self = new RepayForPayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public RepayForPayUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RepayForPayUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RepayForPayUrlResponseBody setModel(RepayForPayUrlResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RepayForPayUrlResponseBodyModel getModel() {
        return this.model;
    }

    public RepayForPayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RepayForPayUrlResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
