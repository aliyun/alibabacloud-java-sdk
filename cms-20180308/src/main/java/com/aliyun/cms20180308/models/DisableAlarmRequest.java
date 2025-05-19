// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DisableAlarmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>576fbae7-2fd1-411a-ae13-6f09f4fafdde</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAlarmRequest self = new DisableAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DisableAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DisableAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
