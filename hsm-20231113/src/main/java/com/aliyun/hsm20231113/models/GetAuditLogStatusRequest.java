// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetAuditLogStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain the list of OSS buckets that can be used to store audit logs. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GetOssBucket")
    public Boolean getOssBucket;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetAuditLogStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuditLogStatusRequest self = new GetAuditLogStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAuditLogStatusRequest setGetOssBucket(Boolean getOssBucket) {
        this.getOssBucket = getOssBucket;
        return this;
    }
    public Boolean getGetOssBucket() {
        return this.getOssBucket;
    }

    public GetAuditLogStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
