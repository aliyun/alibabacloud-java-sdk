// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteLogMonitorRequest extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("LogId")
    public Long logId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteLogMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogMonitorRequest self = new DeleteLogMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogMonitorRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }
    public Long getLogId() {
        return this.logId;
    }

    public DeleteLogMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
