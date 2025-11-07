// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ModelTypeDetermineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ModelTypeDetermineResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7B0FC4BC-9E4B-5AD7-9D35-6559BDC0788E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public String success;

    public static ModelTypeDetermineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelTypeDetermineResponseBody self = new ModelTypeDetermineResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelTypeDetermineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelTypeDetermineResponseBody setData(ModelTypeDetermineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelTypeDetermineResponseBodyData getData() {
        return this.data;
    }

    public ModelTypeDetermineResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelTypeDetermineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModelTypeDetermineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelTypeDetermineResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModelTypeDetermineResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("followUp")
        public Boolean followUp;

        @NameInMap("rewriteText")
        public String rewriteText;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("vl")
        public Boolean vl;

        public static ModelTypeDetermineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelTypeDetermineResponseBodyData self = new ModelTypeDetermineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelTypeDetermineResponseBodyData setFollowUp(Boolean followUp) {
            this.followUp = followUp;
            return this;
        }
        public Boolean getFollowUp() {
            return this.followUp;
        }

        public ModelTypeDetermineResponseBodyData setRewriteText(String rewriteText) {
            this.rewriteText = rewriteText;
            return this;
        }
        public String getRewriteText() {
            return this.rewriteText;
        }

        public ModelTypeDetermineResponseBodyData setVl(Boolean vl) {
            this.vl = vl;
            return this;
        }
        public Boolean getVl() {
            return this.vl;
        }

    }

}
