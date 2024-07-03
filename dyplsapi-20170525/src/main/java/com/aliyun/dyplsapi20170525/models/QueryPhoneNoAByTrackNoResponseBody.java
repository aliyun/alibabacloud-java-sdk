// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QueryPhoneNoAByTrackNoResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information returned after the phone numbers were bound.</p>
     */
    @NameInMap("Module")
    public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8906582E-6722</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPhoneNoAByTrackNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNoAByTrackNoResponseBody self = new QueryPhoneNoAByTrackNoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNoAByTrackNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneNoAByTrackNoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneNoAByTrackNoResponseBody setModule(java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<QueryPhoneNoAByTrackNoResponseBodyModule> getModule() {
        return this.module;
    }

    public QueryPhoneNoAByTrackNoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPhoneNoAByTrackNoResponseBodyModule extends TeaModel {
        /**
         * <p>The extension of phone number X.</p>
         * 
         * <strong>example:</strong>
         * <p>130</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Phone number A.</p>
         * 
         * <strong>example:</strong>
         * <p>1310000****</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>The private number, that is, phone number X.</p>
         * 
         * <strong>example:</strong>
         * <p>1710000****</p>
         */
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        public static QueryPhoneNoAByTrackNoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNoAByTrackNoResponseBodyModule self = new QueryPhoneNoAByTrackNoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public QueryPhoneNoAByTrackNoResponseBodyModule setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

    }

}
