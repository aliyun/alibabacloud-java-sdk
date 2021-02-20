// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CheckQuotaRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("ResourceAttribute")
    public String resourceAttribute;

    @NameInMap("GroupUuid")
    public String groupUuid;

    public static CheckQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckQuotaRequest self = new CheckQuotaRequest();
        return TeaModel.build(map, self);
    }

    public CheckQuotaRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CheckQuotaRequest setResourceAttribute(String resourceAttribute) {
        this.resourceAttribute = resourceAttribute;
        return this;
    }
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    public CheckQuotaRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

}
