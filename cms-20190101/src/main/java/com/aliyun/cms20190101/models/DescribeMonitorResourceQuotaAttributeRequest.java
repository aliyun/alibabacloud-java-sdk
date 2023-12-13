// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorResourceQuotaAttributeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return information about used quotas. Valid values:</p>
     * <br>
     * <p>*   true (default): yes</p>
     * <p>*   false: no</p>
     */
    @NameInMap("ShowUsed")
    public Boolean showUsed;

    public static DescribeMonitorResourceQuotaAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorResourceQuotaAttributeRequest self = new DescribeMonitorResourceQuotaAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorResourceQuotaAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorResourceQuotaAttributeRequest setShowUsed(Boolean showUsed) {
        this.showUsed = showUsed;
        return this;
    }
    public Boolean getShowUsed() {
        return this.showUsed;
    }

}
