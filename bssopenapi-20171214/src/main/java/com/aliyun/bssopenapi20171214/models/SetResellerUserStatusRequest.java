// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserStatusRequest extends TeaModel {
    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    public static SetResellerUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserStatusRequest self = new SetResellerUserStatusRequest();
        return TeaModel.build(map, self);
    }

}
