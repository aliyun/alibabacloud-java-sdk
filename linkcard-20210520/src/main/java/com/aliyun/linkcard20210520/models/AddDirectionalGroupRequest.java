// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalGroupRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    public static AddDirectionalGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalGroupRequest self = new AddDirectionalGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddDirectionalGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
