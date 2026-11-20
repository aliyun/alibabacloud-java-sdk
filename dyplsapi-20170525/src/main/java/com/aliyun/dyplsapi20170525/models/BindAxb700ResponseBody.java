// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxb700ResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>OK: The request was successful.
     *  Other values indicate failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public BindAxb700ResponseBodyData data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9297B722-A016-43FB-B51A-E54050******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindAxb700ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxb700ResponseBody self = new BindAxb700ResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxb700ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAxb700ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxb700ResponseBody setData(BindAxb700ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAxb700ResponseBodyData getData() {
        return this.data;
    }

    public BindAxb700ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxb700ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxb700ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAxb700ResponseBodyData extends TeaModel {
        /**
         * <p>The purchased 700 private number, which is the X number.</p>
         * 
         * <strong>example:</strong>
         * <p>700********0001</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <p>The number binding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123*******</p>
         */
        @NameInMap("SubsId")
        public Long subsId;

        public static BindAxb700ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAxb700ResponseBodyData self = new BindAxb700ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAxb700ResponseBodyData setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindAxb700ResponseBodyData setSubsId(Long subsId) {
            this.subsId = subsId;
            return this;
        }
        public Long getSubsId() {
            return this.subsId;
        }

    }

}
