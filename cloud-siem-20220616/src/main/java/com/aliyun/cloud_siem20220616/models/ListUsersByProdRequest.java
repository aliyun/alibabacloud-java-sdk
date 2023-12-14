// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUsersByProdRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
