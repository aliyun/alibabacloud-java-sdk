// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("IsDeleteAlarms")
    public Boolean isDeleteAlarms;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to delete the alert rules configured for the site monitoring tasks. Valid values:</p>
     * <br>
     * <p>*   true (default value)</p>
     * <p>*   false</p>
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
