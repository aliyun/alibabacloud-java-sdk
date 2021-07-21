// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("IncludeAlert")
    public Boolean includeAlert;

    public static DescribeSiteMonitorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeRequest self = new DescribeSiteMonitorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorAttributeRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorAttributeRequest setIncludeAlert(Boolean includeAlert) {
        this.includeAlert = includeAlert;
        return this;
    }
    public Boolean getIncludeAlert() {
        return this.includeAlert;
    }

}
