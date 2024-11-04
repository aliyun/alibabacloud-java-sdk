// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MaintainWindowForView extends TeaModel {
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("effective")
    public String effective;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

    @NameInMap("workspace")
    public String workspace;

    public static MaintainWindowForView build(java.util.Map<String, ?> map) throws Exception {
        MaintainWindowForView self = new MaintainWindowForView();
        return TeaModel.build(map, self);
    }

    public MaintainWindowForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MaintainWindowForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MaintainWindowForView setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public MaintainWindowForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public MaintainWindowForView setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MaintainWindowForView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public MaintainWindowForView setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public MaintainWindowForView setMaintainWindowName(String maintainWindowName) {
        this.maintainWindowName = maintainWindowName;
        return this;
    }
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    public MaintainWindowForView setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MaintainWindowForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public MaintainWindowForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MaintainWindowForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
