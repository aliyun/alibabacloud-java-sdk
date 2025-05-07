// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
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

    /**
     * <p>响应信息</p>
     */
    @NameInMap("Data")
    public BindAxnExtensionFixedLineResponseBodyData data;

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
     * <p>AE2D6997-643A-59CB-9B3C-918572E5CEAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static BindAxnExtensionFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionFixedLineResponseBody self = new BindAxnExtensionFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAxnExtensionFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxnExtensionFixedLineResponseBody setData(BindAxnExtensionFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAxnExtensionFixedLineResponseBodyData getData() {
        return this.data;
    }

    public BindAxnExtensionFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxnExtensionFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxnExtensionFixedLineResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class BindAxnExtensionFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>绑定id</p>
         * 
         * <strong>example:</strong>
         * <p>GHX0534X202504221531579290029</p>
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

        /**
         * <p>分机号，只有4位</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("TelXext")
        public String telXext;

        public static BindAxnExtensionFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAxnExtensionFixedLineResponseBodyData self = new BindAxnExtensionFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAxnExtensionFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public BindAxnExtensionFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

        public BindAxnExtensionFixedLineResponseBodyData setTelXext(String telXext) {
            this.telXext = telXext;
            return this;
        }
        public String getTelXext() {
            return this.telXext;
        }

    }

}
