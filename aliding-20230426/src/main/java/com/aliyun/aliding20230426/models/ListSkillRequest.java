// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListSkillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qweq-1231-jbarr-9940-asdf</p>
     */
    @NameInMap("groupId")
    public String groupId;

    public static ListSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillRequest self = new ListSkillRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
