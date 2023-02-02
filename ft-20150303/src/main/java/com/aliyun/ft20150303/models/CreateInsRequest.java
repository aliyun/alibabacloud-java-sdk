// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class CreateInsRequest extends TeaModel {
    @NameInMap("Success")
    public String success;

    @NameInMap("new-param-1")
    public String newParam1;

    @NameInMap("new-param-2")
    public String newParam2;

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

    public CreateInsRequest setNewParam1(String newParam1) {
        this.newParam1 = newParam1;
        return this;
    }
    public String getNewParam1() {
        return this.newParam1;
    }

    public CreateInsRequest setNewParam2(String newParam2) {
        this.newParam2 = newParam2;
        return this;
    }
    public String getNewParam2() {
        return this.newParam2;
    }

}
