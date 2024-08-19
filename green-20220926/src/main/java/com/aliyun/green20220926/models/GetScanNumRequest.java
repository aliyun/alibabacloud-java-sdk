// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetScanNumRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tmpsample</p>
     */
    @NameInMap("Buckets")
    public String buckets;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("MediaType")
    public Integer mediaType;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetScanNumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScanNumRequest self = new GetScanNumRequest();
        return TeaModel.build(map, self);
    }

    public GetScanNumRequest setBuckets(String buckets) {
        this.buckets = buckets;
        return this;
    }
    public String getBuckets() {
        return this.buckets;
    }

    public GetScanNumRequest setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public Integer getMediaType() {
        return this.mediaType;
    }

    public GetScanNumRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
