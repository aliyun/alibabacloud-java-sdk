// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class ConfigXResponseBody extends TeaModel {
    /**
     * <p>The details of the access denied error.</p>
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
     * <p>The configuration result of the work number.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Code&quot;:&quot;0000&quot;,&quot;Message&quot;:&quot;Success&quot;,&quot;Success&quot;:true}</p>
     */
    @NameInMap("Data")
    public ConfigXResponseBodyData data;

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

    public static ConfigXResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigXResponseBody self = new ConfigXResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigXResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ConfigXResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigXResponseBody setData(ConfigXResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigXResponseBodyData getData() {
        return this.data;
    }

    public ConfigXResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigXResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigXResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfigXResponseBodyData extends TeaModel {
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
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ConfigXResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigXResponseBodyData self = new ConfigXResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigXResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ConfigXResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ConfigXResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
