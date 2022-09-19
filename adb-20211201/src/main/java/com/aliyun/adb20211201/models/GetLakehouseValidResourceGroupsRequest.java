// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLakehouseValidResourceGroupsRequest extends TeaModel {
    @NameInMap("GroupsInfo")
    public String groupsInfo;

    public static GetLakehouseValidResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLakehouseValidResourceGroupsRequest self = new GetLakehouseValidResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetLakehouseValidResourceGroupsRequest setGroupsInfo(String groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public String getGroupsInfo() {
        return this.groupsInfo;
    }

}
