// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindXBResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li>0000: Success.</li>
     * </ul>
     * <p>Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The work number binding result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthId&quot;:&quot;4353453456&quot;,&quot;TelX&quot;:&quot;18640577897&quot;}</p>
     */
    @NameInMap("Data")
    public BindXBResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindXBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindXBResponseBody self = new BindXBResponseBody();
        return TeaModel.build(map, self);
    }

    public BindXBResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindXBResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindXBResponseBody setData(BindXBResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindXBResponseBodyData getData() {
        return this.data;
    }

    public BindXBResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindXBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindXBResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the work number binding.</p>
         * 
         * <strong>example:</strong>
         * <p>4353453456</p>
         */
        @NameInMap("AuthId")
        public String authId;

        /**
         * <p>The work number X.</p>
         * 
         * <strong>example:</strong>
         * <p>18640577897</p>
         */
        @NameInMap("TelX")
        public String telX;

        public static BindXBResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindXBResponseBodyData self = new BindXBResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindXBResponseBodyData setAuthId(String authId) {
            this.authId = authId;
            return this;
        }
        public String getAuthId() {
            return this.authId;
        }

        public BindXBResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
