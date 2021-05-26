// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ListGroupByIdRequest extends TeaModel {
    @NameInMap("GroupIds")
    public String groupIds;

    public static ListGroupByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupByIdRequest self = new ListGroupByIdRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupByIdRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

}
