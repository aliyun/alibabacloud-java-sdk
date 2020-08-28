// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyMonitorGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ContactGroups")
    public String contactGroups;

    public static ModifyMonitorGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMonitorGroupRequest self = new ModifyMonitorGroupRequest();
        return TeaModel.build(map, self);
    }

}
