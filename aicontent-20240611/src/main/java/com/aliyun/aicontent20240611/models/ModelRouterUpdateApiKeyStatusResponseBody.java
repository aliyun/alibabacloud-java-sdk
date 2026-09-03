// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateApiKeyStatusResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    /**
     * <p>The data object.</p>
     */
    @NameInMap("data")
    public ModelRouterUpdateApiKeyStatusResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterUpdateApiKeyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateApiKeyStatusResponseBody self = new ModelRouterUpdateApiKeyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateApiKeyStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ModelRouterUpdateApiKeyStatusResponseBody setData(ModelRouterUpdateApiKeyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterUpdateApiKeyStatusResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterUpdateApiKeyStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModelRouterUpdateApiKeyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterUpdateApiKeyStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterUpdateApiKeyStatusResponseBodyData extends TeaModel {
        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>3220</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The status of the API key. Valid values:</p>
         * <ul>
         * <li>active: The API key is valid.</li>
         * <li>disabled: The API key is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        public static ModelRouterUpdateApiKeyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterUpdateApiKeyStatusResponseBodyData self = new ModelRouterUpdateApiKeyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterUpdateApiKeyStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModelRouterUpdateApiKeyStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
