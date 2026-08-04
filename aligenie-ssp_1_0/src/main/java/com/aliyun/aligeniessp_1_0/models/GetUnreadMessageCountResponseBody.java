// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUnreadMessageCountResponseBody extends TeaModel {
    /**
     * <p>Status code returned by the service</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>用户信息不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Number of unread messages</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Result")
    public Integer result;

    public static GetUnreadMessageCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnreadMessageCountResponseBody self = new GetUnreadMessageCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnreadMessageCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnreadMessageCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnreadMessageCountResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
