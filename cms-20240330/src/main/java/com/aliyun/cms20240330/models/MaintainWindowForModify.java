// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MaintainWindowForModify extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("effective")
    public String effective;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("maintainWindowName")
    public String maintainWindowName;

    @NameInMap("startTime")
    public String startTime;

    public static MaintainWindowForModify build(java.util.Map<String, ?> map) throws Exception {
        MaintainWindowForModify self = new MaintainWindowForModify();
        return TeaModel.build(map, self);
    }

    public MaintainWindowForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public MaintainWindowForModify setEffective(String effective) {
        this.effective = effective;
        return this;
    }
    public String getEffective() {
        return this.effective;
    }

    public MaintainWindowForModify setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MaintainWindowForModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public MaintainWindowForModify setMaintainWindowName(String maintainWindowName) {
        this.maintainWindowName = maintainWindowName;
        return this;
    }
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    public MaintainWindowForModify setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
