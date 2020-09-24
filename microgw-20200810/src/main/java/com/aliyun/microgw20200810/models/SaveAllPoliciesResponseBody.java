// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class SaveAllPoliciesResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    // message
    @NameInMap("message")
    public String message;

    public static SaveAllPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAllPoliciesResponseBody self = new SaveAllPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAllPoliciesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SaveAllPoliciesResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SaveAllPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
