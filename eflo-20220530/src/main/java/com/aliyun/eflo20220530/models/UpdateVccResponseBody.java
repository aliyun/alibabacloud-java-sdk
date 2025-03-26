// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVccResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public UpdateVccResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F906C4D3-7444-58E2-9819-E3D8563571A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVccResponseBody self = new UpdateVccResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVccResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateVccResponseBody setContent(UpdateVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateVccResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateVccResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-2r42v22cn03</p>
         */
        @NameInMap("VccId")
        public String vccId;

        public static UpdateVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateVccResponseBodyContent self = new UpdateVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateVccResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

    }

}
