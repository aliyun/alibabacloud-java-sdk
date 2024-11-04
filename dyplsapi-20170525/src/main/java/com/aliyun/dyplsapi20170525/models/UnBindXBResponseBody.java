// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnBindXBResponseBody extends TeaModel {
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

    public UnBindXBResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnBindXBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
