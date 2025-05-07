// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbFixedLineResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>响应码 0-成功</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>响应内容</p>
     */
    @NameInMap("Data")
    public BindAxbFixedLineResponseBodyData data;

    /**
     * <p>响应消息</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>649E9EB5-9436-53CF-B41A-C4F0433212E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否处理成功  true-成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindAxbFixedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxbFixedLineResponseBody self = new BindAxbFixedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxbFixedLineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAxbFixedLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAxbFixedLineResponseBody setData(BindAxbFixedLineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAxbFixedLineResponseBodyData getData() {
        return this.data;
    }

    public BindAxbFixedLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxbFixedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxbFixedLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAxbFixedLineResponseBodyData extends TeaModel {
        /**
         * <p>绑定id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Subid")
        public String subid;

        /**
         * <p>X号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TelX")
        public String telX;

        public static BindAxbFixedLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAxbFixedLineResponseBodyData self = new BindAxbFixedLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAxbFixedLineResponseBodyData setSubid(String subid) {
            this.subid = subid;
            return this;
        }
        public String getSubid() {
            return this.subid;
        }

        public BindAxbFixedLineResponseBodyData setTelX(String telX) {
            this.telX = telX;
            return this;
        }
        public String getTelX() {
            return this.telX;
        }

    }

}
