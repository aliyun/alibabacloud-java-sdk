// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteAlarmRequest extends TeaModel {
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

    public static DeleteAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmRequest self = new DeleteAlarmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
