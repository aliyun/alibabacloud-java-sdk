// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DashscopeAsyncTaskFinishEventResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("retryAble")
    public Boolean retryAble;

    @NameInMap("success")
    public Boolean success;

    public static DashscopeAsyncTaskFinishEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DashscopeAsyncTaskFinishEventResponseBody self = new DashscopeAsyncTaskFinishEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DashscopeAsyncTaskFinishEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DashscopeAsyncTaskFinishEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DashscopeAsyncTaskFinishEventResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public DashscopeAsyncTaskFinishEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
