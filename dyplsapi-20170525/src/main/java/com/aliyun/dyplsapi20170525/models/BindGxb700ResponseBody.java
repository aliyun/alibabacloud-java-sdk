// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindGxb700ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindGxb700ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9297B722-A016-43FB-B51A-E54050******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindGxb700ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindGxb700ResponseBody self = new BindGxb700ResponseBody();
        return TeaModel.build(map, self);
    }

    public BindGxb700ResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindGxb700ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindGxb700ResponseBody setData(BindGxb700ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindGxb700ResponseBodyData getData() {
        return this.data;
    }

    public BindGxb700ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindGxb700ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindGxb700ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindGxb700ResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>700********0001</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <strong>example:</strong>
         * <p>123*******</p>
         */
        @NameInMap("SubsId")
        public Long subsId;

        public static BindGxb700ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindGxb700ResponseBodyData self = new BindGxb700ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindGxb700ResponseBodyData setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public BindGxb700ResponseBodyData setSubsId(Long subsId) {
            this.subsId = subsId;
            return this;
        }
        public Long getSubsId() {
            return this.subsId;
        }

    }

}
