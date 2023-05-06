// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetIconStsCredentialRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceType")
    public Integer sourceType;

    public static GetIconStsCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIconStsCredentialRequest self = new GetIconStsCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetIconStsCredentialRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public GetIconStsCredentialRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetIconStsCredentialRequest setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Integer getSourceType() {
        return this.sourceType;
    }

}
