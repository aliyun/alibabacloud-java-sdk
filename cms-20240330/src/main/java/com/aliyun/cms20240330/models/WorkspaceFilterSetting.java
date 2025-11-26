// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class WorkspaceFilterSetting extends TeaModel {
    @NameInMap("tagSelector")
    public FilterSetting tagSelector;

    @NameInMap("workspaceUuids")
    public java.util.List<String> workspaceUuids;

    public static WorkspaceFilterSetting build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceFilterSetting self = new WorkspaceFilterSetting();
        return TeaModel.build(map, self);
    }

    public WorkspaceFilterSetting setTagSelector(FilterSetting tagSelector) {
        this.tagSelector = tagSelector;
        return this;
    }
    public FilterSetting getTagSelector() {
        return this.tagSelector;
    }

    public WorkspaceFilterSetting setWorkspaceUuids(java.util.List<String> workspaceUuids) {
        this.workspaceUuids = workspaceUuids;
        return this;
    }
    public java.util.List<String> getWorkspaceUuids() {
        return this.workspaceUuids;
    }

}
