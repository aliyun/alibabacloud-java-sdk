// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAXBCallResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindAXBCallResponseBodyData data;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BindAXBCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAXBCallResponseBody self = new BindAXBCallResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAXBCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BindAXBCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindAXBCallResponseBody setData(BindAXBCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindAXBCallResponseBodyData getData() {
        return this.data;
    }

    public BindAXBCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAXBCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindAXBCallResponseBodyData extends TeaModel {
        /**
         * <p>绑定关系ID</p>
         * 
         * <strong>example:</strong>
         * <p>476567566</p>
         */
        @NameInMap("BindId")
        public String bindId;

        public static BindAXBCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindAXBCallResponseBodyData self = new BindAXBCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindAXBCallResponseBodyData setBindId(String bindId) {
            this.bindId = bindId;
            return this;
        }
        public String getBindId() {
            return this.bindId;
        }

    }

}
