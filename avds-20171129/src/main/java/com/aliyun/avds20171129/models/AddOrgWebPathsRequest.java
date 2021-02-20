// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgWebPathsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("URLs")
    public java.util.List<String> URLs;

    public static AddOrgWebPathsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrgWebPathsRequest self = new AddOrgWebPathsRequest();
        return TeaModel.build(map, self);
    }

    public AddOrgWebPathsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddOrgWebPathsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public AddOrgWebPathsRequest setURLs(java.util.List<String> URLs) {
        this.URLs = URLs;
        return this;
    }
    public java.util.List<String> getURLs() {
        return this.URLs;
    }

}
