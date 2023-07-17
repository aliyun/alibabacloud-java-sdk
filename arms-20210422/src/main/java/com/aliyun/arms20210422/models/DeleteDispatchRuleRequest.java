// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteDispatchRuleRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDispatchRuleRequest self = new DeleteDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDispatchRuleRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
