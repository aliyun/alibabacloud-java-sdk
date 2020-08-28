// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    @Validation(required = true)
    public java.util.List<Long> id;

    public static DeleteHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAvailabilityRequest self = new DeleteHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

}
