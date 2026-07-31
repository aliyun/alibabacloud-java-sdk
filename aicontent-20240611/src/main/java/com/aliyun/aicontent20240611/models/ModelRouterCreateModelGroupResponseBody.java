// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateModelGroupResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("data")
    public ModelRouterCreateModelGroupResponseBodyData data;

    /**
     * <p>The error message code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterCreateModelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateModelGroupResponseBody self = new ModelRouterCreateModelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateModelGroupResponseBody setData(ModelRouterCreateModelGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterCreateModelGroupResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterCreateModelGroupResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterCreateModelGroupResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterCreateModelGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterCreateModelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterCreateModelGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterCreateModelGroupResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the group. The identifier has the mg_ prefix and does not change after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>mg_a1b2c3d4e5f6g7h8i9j0</p>
         */
        @NameInMap("groupId")
        public String groupId;

        public static ModelRouterCreateModelGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterCreateModelGroupResponseBodyData self = new ModelRouterCreateModelGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterCreateModelGroupResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
