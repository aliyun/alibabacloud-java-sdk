// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupsByApiKeyResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     */
    @NameInMap("data")
    public ModelRouterQueryModelGroupsByApiKeyResponseBodyData data;

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

    public static ModelRouterQueryModelGroupsByApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupsByApiKeyResponseBody self = new ModelRouterQueryModelGroupsByApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setData(ModelRouterQueryModelGroupsByApiKeyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterQueryModelGroupsByApiKeyResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterQueryModelGroupsByApiKeyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the department to which the key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("clientId")
        public Long clientId;

        /**
         * <p>The list of bound model groups.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("groups")
        public java.util.List<ModelGroupDTO> groups;

        /**
         * <p>The list of individually authorized model IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[200]</p>
         */
        @NameInMap("standaloneModelList")
        public java.util.List<Long> standaloneModelList;

        public static ModelRouterQueryModelGroupsByApiKeyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterQueryModelGroupsByApiKeyResponseBodyData self = new ModelRouterQueryModelGroupsByApiKeyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterQueryModelGroupsByApiKeyResponseBodyData setClientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }
        public Long getClientId() {
            return this.clientId;
        }

        public ModelRouterQueryModelGroupsByApiKeyResponseBodyData setGroups(java.util.List<ModelGroupDTO> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<ModelGroupDTO> getGroups() {
            return this.groups;
        }

        public ModelRouterQueryModelGroupsByApiKeyResponseBodyData setStandaloneModelList(java.util.List<Long> standaloneModelList) {
            this.standaloneModelList = standaloneModelList;
            return this;
        }
        public java.util.List<Long> getStandaloneModelList() {
            return this.standaloneModelList;
        }

    }

}
