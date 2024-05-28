// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("targetType")
    public String targetType;

    public static ListProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersRequest self = new ListProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
