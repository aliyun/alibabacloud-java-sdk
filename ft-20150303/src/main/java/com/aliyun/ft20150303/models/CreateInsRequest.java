// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20150303.models;

import com.aliyun.tea.*;

public class CreateInsRequest extends TeaModel {
    @NameInMap("Success")
    public String success;

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

}
