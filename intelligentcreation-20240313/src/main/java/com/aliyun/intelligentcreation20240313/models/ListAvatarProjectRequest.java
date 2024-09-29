// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAvatarProjectRequest extends TeaModel {
    @NameInMap("projectIdList")
    public java.util.List<String> projectIdList;

    public static ListAvatarProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarProjectRequest self = new ListAvatarProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListAvatarProjectRequest setProjectIdList(java.util.List<String> projectIdList) {
        this.projectIdList = projectIdList;
        return this;
    }
    public java.util.List<String> getProjectIdList() {
        return this.projectIdList;
    }

}
