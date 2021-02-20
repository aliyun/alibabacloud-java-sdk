// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgRiskyAssetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgId")
    public Integer orgId;

    public static ListOrgRiskyAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrgRiskyAssetsRequest self = new ListOrgRiskyAssetsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrgRiskyAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListOrgRiskyAssetsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

}
