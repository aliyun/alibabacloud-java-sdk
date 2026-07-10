// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CostCenterQueryRequest extends TeaModel {
    @NameInMap("disable")
    public Long disable;

    @NameInMap("need_org_entity")
    public Boolean needOrgEntity;

    @NameInMap("thirdpart_id")
    public String thirdpartId;

    @NameInMap("title")
    public String title;

    @NameInMap("user_id")
    public String userId;

    public static CostCenterQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CostCenterQueryRequest self = new CostCenterQueryRequest();
        return TeaModel.build(map, self);
    }

    public CostCenterQueryRequest setDisable(Long disable) {
        this.disable = disable;
        return this;
    }
    public Long getDisable() {
        return this.disable;
    }

    public CostCenterQueryRequest setNeedOrgEntity(Boolean needOrgEntity) {
        this.needOrgEntity = needOrgEntity;
        return this;
    }
    public Boolean getNeedOrgEntity() {
        return this.needOrgEntity;
    }

    public CostCenterQueryRequest setThirdpartId(String thirdpartId) {
        this.thirdpartId = thirdpartId;
        return this;
    }
    public String getThirdpartId() {
        return this.thirdpartId;
    }

    public CostCenterQueryRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CostCenterQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
