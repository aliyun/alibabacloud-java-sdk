// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ReadMessageResponseBody extends TeaModel {
    /**
     * <p>Status code returned by the service. Only &quot;SUCCESS&quot; indicates success; all other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>外部userId映射关系不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Succeeded in marking as read</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ReadMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageResponseBody self = new ReadMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMessageResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
