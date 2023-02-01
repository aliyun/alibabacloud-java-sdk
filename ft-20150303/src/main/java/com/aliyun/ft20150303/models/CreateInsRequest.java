// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class CreateInsRequest extends TeaModel {
    @NameInMap("Success")
    public String success;

    @NameInMap("new-param-6")
    public String newParam6;

    public static CreateInsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInsRequest self = new CreateInsRequest();
        return TeaModel.build(map, self);
    }

    public CreateInsRequest setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateInsRequest setNewParam6(String newParam6) {
        this.newParam6 = newParam6;
        return this;
    }
    public String getNewParam6() {
        return this.newParam6;
    }

}
