// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether the returned task details include alert rules.</p>
     * <ul>
     * <li>true: Alert rules are returned.</li>
     * <li>false (default): Alert rules are not returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeAlert")
    public Boolean includeAlert;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc641dff-c19d-45f3-ad0a-818a0c4f****</p>
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
