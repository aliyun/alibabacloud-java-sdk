// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateReportRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>地域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectTimestamp")
    public Long selectTimestamp;

    public static CreateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportRequest self = new CreateReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReportRequest setSelectTimestamp(Long selectTimestamp) {
        this.selectTimestamp = selectTimestamp;
        return this;
    }
    public Long getSelectTimestamp() {
        return this.selectTimestamp;
    }

}
