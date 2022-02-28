// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairType")
    public String sitePairType;

    @NameInMap("UserUid")
    public Long userUid;

    public static DescribeSitePairsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSitePairsRequest self = new DescribeSitePairsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSitePairsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSitePairsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSitePairsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSitePairsRequest setSitePairType(String sitePairType) {
        this.sitePairType = sitePairType;
        return this;
    }
    public String getSitePairType() {
        return this.sitePairType;
    }

    public DescribeSitePairsRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
