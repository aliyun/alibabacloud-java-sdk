// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskIds")
    public String taskIds;

    @NameInMap("IsDeleteAlarms")
    public Boolean isDeleteAlarms;

    public static DeleteSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsRequest self = new DeleteSiteMonitorsRequest();
        return TeaModel.build(map, self);
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

    public DeleteSiteMonitorsRequest setIsDeleteAlarms(Boolean isDeleteAlarms) {
        this.isDeleteAlarms = isDeleteAlarms;
        return this;
    }
    public Boolean getIsDeleteAlarms() {
        return this.isDeleteAlarms;
    }

}
