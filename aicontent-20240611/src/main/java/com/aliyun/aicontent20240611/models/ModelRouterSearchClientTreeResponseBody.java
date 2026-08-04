// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSearchClientTreeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterSearchClientTreeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterSearchClientTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSearchClientTreeResponseBody self = new ModelRouterSearchClientTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterSearchClientTreeResponseBody setData(ModelRouterSearchClientTreeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterSearchClientTreeResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterSearchClientTreeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterSearchClientTreeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterSearchClientTreeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterSearchClientTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterSearchClientTreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterSearchClientTreeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("matchedDeptIds")
        public java.util.List<Long> matchedDeptIds;

        public static ModelRouterSearchClientTreeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterSearchClientTreeResponseBodyData self = new ModelRouterSearchClientTreeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterSearchClientTreeResponseBodyData setMatchedDeptIds(java.util.List<Long> matchedDeptIds) {
            this.matchedDeptIds = matchedDeptIds;
            return this;
        }
        public java.util.List<Long> getMatchedDeptIds() {
            return this.matchedDeptIds;
        }

    }

}
