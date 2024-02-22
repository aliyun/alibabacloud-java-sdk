// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUsersByProdRequest extends TeaModel {
    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The code of the cloud service.</p>
     */
    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    public static ListUsersByProdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByProdRequest self = new ListUsersByProdRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersByProdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUsersByProdRequest setSourceProdCode(String sourceProdCode) {
        this.sourceProdCode = sourceProdCode;
        return this;
    }
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

}
