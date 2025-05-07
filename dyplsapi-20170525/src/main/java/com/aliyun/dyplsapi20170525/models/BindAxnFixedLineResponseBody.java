// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>响应码 0：成功，其它失败，具体见文档</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindAxnFixedLineResponseBodyData data;

    /**
     * <p>描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4D690962-08CE-5D38-A65A-AB247D7DF7A2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindAxnFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxnFixedLineResponseBody self = new BindAxnFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxnFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAxnFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnFixedLineResponseBody setData(BindAxnFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAxnFixedLineResponseBodyData getData() {
        return this.data;
    }

    public BindAxnFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAxnFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>绑定id</p>
         * 
         * <strong>example:</strong>
         * <p>GHX0534X202504221531579290029-2-1-aliaxn</p>
         */
        @NameInMap("Subid")
        public String subid;

        /**
         * <p>隐私号码</p>
         * 
         * <strong>example:</strong>
         * <p>0571409312</p>
         */
        @NameInMap("TelX")
        public String telX;

        public static BindAxnFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAxnFixedLineResponseBodyData self = new BindAxnFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAxnFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public BindAxnFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
