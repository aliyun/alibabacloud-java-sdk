// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the information of the alert rules that are configured for the site monitoring task. Valid values:</p>
     * <br>
     * <p>*   true: The system returns the information of the alert rules that are configured for the site monitoring task.</p>
     * <p>*   false (default): The system does not return the information of the alert rules that are configured for the site monitoring task.</p>
     */
    @NameInMap("IncludeAlert")
    public Boolean includeAlert;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the site monitoring task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeSiteMonitorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeRequest self = new DescribeSiteMonitorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorAttributeRequest setIncludeAlert(Boolean includeAlert) {
        this.includeAlert = includeAlert;
        return this;
    }
    public Boolean getIncludeAlert() {
        return this.includeAlert;
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

}
