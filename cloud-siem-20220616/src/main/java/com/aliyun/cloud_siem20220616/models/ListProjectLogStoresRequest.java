// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListProjectLogStoresRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    @NameInMap("SubUserId")
    public Long subUserId;

    public static ListProjectLogStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLogStoresRequest self = new ListProjectLogStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectLogStoresRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProjectLogStoresRequest setSourceLogCode(String sourceLogCode) {
        this.sourceLogCode = sourceLogCode;
        return this;
    }
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    public ListProjectLogStoresRequest setSourceProdCode(String sourceProdCode) {
        this.sourceProdCode = sourceProdCode;
        return this;
    }
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    public ListProjectLogStoresRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}
