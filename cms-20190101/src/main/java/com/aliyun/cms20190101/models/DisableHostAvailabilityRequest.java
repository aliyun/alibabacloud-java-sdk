// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public java.util.List<Long> id;

    public static DisableHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableHostAvailabilityRequest self = new DisableHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

}
