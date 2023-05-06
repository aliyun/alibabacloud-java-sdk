// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("AdaptorUidList")
    public java.util.List<String> adaptorUidList;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setAdaptorUidList(java.util.List<String> adaptorUidList) {
        this.adaptorUidList = adaptorUidList;
        return this;
    }
    public java.util.List<String> getAdaptorUidList() {
        return this.adaptorUidList;
    }

    public CreateAppGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
