// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UnAssociateVpdCidrBlockResponseBody extends TeaModel {
    /**
     * <p>访问被拒绝详细信息。</p>
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
    public UnAssociateVpdCidrBlockResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnAssociateVpdCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnAssociateVpdCidrBlockResponseBody self = new UnAssociateVpdCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public UnAssociateVpdCidrBlockResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UnAssociateVpdCidrBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnAssociateVpdCidrBlockResponseBody setContent(UnAssociateVpdCidrBlockResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UnAssociateVpdCidrBlockResponseBodyContent getContent() {
        return this.content;
    }

    public UnAssociateVpdCidrBlockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnAssociateVpdCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnAssociateVpdCidrBlockResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-ze3na0wf</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static UnAssociateVpdCidrBlockResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UnAssociateVpdCidrBlockResponseBodyContent self = new UnAssociateVpdCidrBlockResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UnAssociateVpdCidrBlockResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
