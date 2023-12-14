// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCsImportedProdStatusByUserRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceLogProd")
    public String sourceLogProd;

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
