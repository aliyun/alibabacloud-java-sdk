// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEtlJobLogsRequest extends TeaModel {
    /**
     * <p>The ID of the ETL task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides. You can call the [DescribeRegions](~~25609~~) operation to query the available Alibaba Cloud regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEtlJobLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEtlJobLogsRequest self = new DescribeEtlJobLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEtlJobLogsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeEtlJobLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
