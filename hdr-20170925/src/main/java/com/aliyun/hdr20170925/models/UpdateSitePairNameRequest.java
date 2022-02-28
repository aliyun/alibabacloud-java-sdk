// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpdateSitePairNameRequest extends TeaModel {
    @NameInMap("PrimarySiteName")
    public String primarySiteName;

    @NameInMap("SecondarySiteName")
    public String secondarySiteName;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static UpdateSitePairNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSitePairNameRequest self = new UpdateSitePairNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSitePairNameRequest setPrimarySiteName(String primarySiteName) {
        this.primarySiteName = primarySiteName;
        return this;
    }
    public String getPrimarySiteName() {
        return this.primarySiteName;
    }

    public UpdateSitePairNameRequest setSecondarySiteName(String secondarySiteName) {
        this.secondarySiteName = secondarySiteName;
        return this;
    }
    public String getSecondarySiteName() {
        return this.secondarySiteName;
    }

    public UpdateSitePairNameRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdateSitePairNameRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
