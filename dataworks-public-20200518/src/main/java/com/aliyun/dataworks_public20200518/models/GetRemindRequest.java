// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindRequest extends TeaModel {
    @NameInMap("RemindId")
    @Validation(required = true)
    public Long remindId;

    public static GetRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRemindRequest self = new GetRemindRequest();
        return TeaModel.build(map, self);
    }

}
