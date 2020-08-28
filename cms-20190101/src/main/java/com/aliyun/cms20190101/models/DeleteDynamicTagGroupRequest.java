// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteDynamicTagGroupRequest extends TeaModel {
    @NameInMap("DynamicTagRuleId")
    @Validation(required = true)
    public String dynamicTagRuleId;

    public static DeleteDynamicTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicTagGroupRequest self = new DeleteDynamicTagGroupRequest();
        return TeaModel.build(map, self);
    }

}
