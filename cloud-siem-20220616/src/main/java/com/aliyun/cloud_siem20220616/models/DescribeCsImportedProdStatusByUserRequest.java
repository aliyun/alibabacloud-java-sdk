// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserRequest extends TeaModel {
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
    @NameInMap("SourceLogProd")
    public String sourceLogProd;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DescribeCsImportedProdStatusByUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCsImportedProdStatusByUserRequest self = new DescribeCsImportedProdStatusByUserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCsImportedProdStatusByUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCsImportedProdStatusByUserRequest setSourceLogProd(String sourceLogProd) {
        this.sourceLogProd = sourceLogProd;
        return this;
    }
    public String getSourceLogProd() {
        return this.sourceLogProd;
    }

    public DescribeCsImportedProdStatusByUserRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
