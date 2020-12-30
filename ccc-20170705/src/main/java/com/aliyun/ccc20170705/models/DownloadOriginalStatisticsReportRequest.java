// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadOriginalStatisticsReportRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    public static DownloadOriginalStatisticsReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadOriginalStatisticsReportRequest self = new DownloadOriginalStatisticsReportRequest();
        return TeaModel.build(map, self);
    }

    public DownloadOriginalStatisticsReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadOriginalStatisticsReportRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

}
