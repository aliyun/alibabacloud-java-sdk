// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupRequest extends TeaModel {
    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    @NameInMap("ContactGroups")
    public String contactGroups;

    public static CreateMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupRequest self = new CreateMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

}
