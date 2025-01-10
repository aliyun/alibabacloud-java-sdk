// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class AssociateVpdCidrBlockResponseBody extends TeaModel {
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
    public AssociateVpdCidrBlockResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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
     * <p>9C50C9CD-E799-54DA-BA7A-1FAF3DF80857</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateVpdCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpdCidrBlockResponseBody self = new AssociateVpdCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateVpdCidrBlockResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AssociateVpdCidrBlockResponseBody setContent(AssociateVpdCidrBlockResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AssociateVpdCidrBlockResponseBodyContent getContent() {
        return this.content;
    }

    public AssociateVpdCidrBlockResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssociateVpdCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssociateVpdCidrBlockResponseBodyContent extends TeaModel {
        /**
         * <p>The ID of the Lingjun CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-eoiy88ju</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        public static AssociateVpdCidrBlockResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AssociateVpdCidrBlockResponseBodyContent self = new AssociateVpdCidrBlockResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AssociateVpdCidrBlockResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
