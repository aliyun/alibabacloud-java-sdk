// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListProjectLogStoresRequest extends TeaModel {
    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The log code.</p>
     */
    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    /**
     * <p>The code of the cloud service.</p>
     */
    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
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
