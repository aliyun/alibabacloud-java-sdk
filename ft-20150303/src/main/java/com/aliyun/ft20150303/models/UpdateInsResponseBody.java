// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class UpdateInsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public String success;

    public static UpdateInsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInsResponseBody self = new UpdateInsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
