// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsRequest extends TeaModel {
    /**
     * <p>Specifies whether to delete the alert rules configured for the site monitoring tasks. Valid values:</p>
     * <ul>
     * <li>true (default value)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDeleteAlarms")
    public Boolean isDeleteAlarms;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the site monitoring tasks that you want to delete. Separate multiple task IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01adacc2-ece5-41b6-afa2-3143ab5d****,43bd1ead-514f-4524-813e-228ce091****</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static DeleteSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsRequest self = new DeleteSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSiteMonitorsRequest setIsDeleteAlarms(Boolean isDeleteAlarms) {
        this.isDeleteAlarms = isDeleteAlarms;
        return this;
    }
    public Boolean getIsDeleteAlarms() {
        return this.isDeleteAlarms;
    }

    public DeleteSiteMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSiteMonitorsRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
