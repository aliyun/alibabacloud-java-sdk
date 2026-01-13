// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ManageAccountResult extends TeaModel {
    @NameInMap("success")
    public Boolean success;

    public static ManageAccountResult build(java.util.Map<String, ?> map) throws Exception {
        ManageAccountResult self = new ManageAccountResult();
        return TeaModel.build(map, self);
    }

    public ManageAccountResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
