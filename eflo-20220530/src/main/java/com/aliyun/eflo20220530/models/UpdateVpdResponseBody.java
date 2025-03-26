// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVpdResponseBody extends TeaModel {
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
     * <p>The response data.</p>
     */
    @NameInMap("Content")
    public UpdateVpdResponseBodyContent content;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpdResponseBody self = new UpdateVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpdResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateVpdResponseBody setContent(UpdateVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateVpdResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateVpdResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the VPD instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-lg4dppgi</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static UpdateVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateVpdResponseBodyContent self = new UpdateVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
