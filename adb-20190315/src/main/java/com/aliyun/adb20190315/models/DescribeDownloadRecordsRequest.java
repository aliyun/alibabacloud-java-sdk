// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDownloadRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusters](~~129857~~) operation to query the detailed information of all AnalyticDB for MySQL clusters within a specific region, including cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The languages available for file titles and some error messages. Default value: zh. Valid values:</p>
     * <br>
     * <p>*   **zh**: Simplified Chinese</p>
     * <p>*   **en**: English</p>
     * <p>*   **ja**: Japanese</p>
     * <p>*   **zh-tw**: Traditional Chinese</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~143074~~) operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDownloadRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadRecordsRequest self = new DescribeDownloadRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDownloadRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDownloadRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
