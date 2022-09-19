// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlResultsExportHistoryRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSqlResultsExportHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlResultsExportHistoryRequest self = new DescribeSqlResultsExportHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSqlResultsExportHistoryRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSqlResultsExportHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
