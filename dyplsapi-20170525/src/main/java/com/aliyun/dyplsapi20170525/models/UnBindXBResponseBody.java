// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindXBResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
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
     * <p>The result of unbinding the work number.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Code&quot;:&quot;0000&quot;,&quot;Message&quot;:&quot;Success&quot;,&quot;Success&quot;:false}</p>
     */
    @NameInMap("Data")
    public UnBindXBResponseBodyData data;

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
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UnBindXBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnBindXBResponseBody self = new UnBindXBResponseBody();
        return TeaModel.build(map, self);
    }

    public UnBindXBResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UnBindXBResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnBindXBResponseBody setData(UnBindXBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnBindXBResponseBodyData getData() {
        return this.data;
    }

    public UnBindXBResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnBindXBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnBindXBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnBindXBResponseBodyData extends TeaModel {
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
         * <p>Indicates whether the request is successful. A value of true indicates success. A value of false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UnBindXBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnBindXBResponseBodyData self = new UnBindXBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnBindXBResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UnBindXBResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UnBindXBResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
