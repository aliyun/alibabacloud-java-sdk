// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    public static ListUserProdLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserProdLogsRequest self = new ListUserProdLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserProdLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserProdLogsRequest setSourceLogCode(String sourceLogCode) {
        this.sourceLogCode = sourceLogCode;
        return this;
    }
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    public ListUserProdLogsRequest setSourceProdCode(String sourceProdCode) {
        this.sourceProdCode = sourceProdCode;
        return this;
    }
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

}
