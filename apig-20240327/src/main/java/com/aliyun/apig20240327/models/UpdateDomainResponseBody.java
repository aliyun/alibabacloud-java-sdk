// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateDomainResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public UpdateDomainResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID, used for tracing the API call chain.</p>
     * 
     * <strong>example:</strong>
     * <p>4BACB05C-3FE2-588F-9148-700C5C026B74</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainResponseBody self = new UpdateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDomainResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateDomainResponseBody setData(UpdateDomainResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDomainResponseBodyData getData() {
        return this.data;
    }

    public UpdateDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateDomainResponseBodyData extends TeaModel {
        /**
         * <p>Deploy revision id.</p>
         * 
         * <strong>example:</strong>
         * <p>apr-xxx</p>
         */
        @NameInMap("deployRevisionId")
        public String deployRevisionId;

        public static UpdateDomainResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDomainResponseBodyData self = new UpdateDomainResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDomainResponseBodyData setDeployRevisionId(String deployRevisionId) {
            this.deployRevisionId = deployRevisionId;
            return this;
        }
        public String getDeployRevisionId() {
            return this.deployRevisionId;
        }

    }

}
