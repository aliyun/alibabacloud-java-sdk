// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindAXBResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned status code. Valid values:</p>
     * <ul>
     * <li><p>0000: Success.</p>
     * </li>
     * <li><p>Other values: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of dissociating the AXB call binding.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Code&quot;:&quot;0000&quot;,&quot;Message&quot;:&quot;Success&quot;,&quot;Success&quot;:true}</p>
     */
    @NameInMap("Data")
    public UnBindAXBResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A2568E1-7D83-5491-8DEF-600D8AFF97E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: Success.</p>
     * </li>
     * <li><p>false: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnBindAXBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnBindAXBResponseBody self = new UnBindAXBResponseBody();
        return TeaModel.build(map, self);
    }

    public UnBindAXBResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UnBindAXBResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnBindAXBResponseBody setData(UnBindAXBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnBindAXBResponseBodyData getData() {
        return this.data;
    }

    public UnBindAXBResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnBindAXBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnBindAXBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnBindAXBResponseBodyData extends TeaModel {
        /**
         * <p>The returned status code. A value of 0000 indicates success. Other values indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>0000</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the request is successful. A value of true indicates success, and a value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UnBindAXBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnBindAXBResponseBodyData self = new UnBindAXBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnBindAXBResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnBindAXBResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnBindAXBResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
