// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrganizationsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgIds")
    public java.util.List<String> orgIds;

    public static DeleteOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrganizationsRequest self = new DeleteOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOrganizationsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteOrganizationsRequest setOrgIds(java.util.List<String> orgIds) {
        this.orgIds = orgIds;
        return this;
    }
    public java.util.List<String> getOrgIds() {
        return this.orgIds;
    }

}
