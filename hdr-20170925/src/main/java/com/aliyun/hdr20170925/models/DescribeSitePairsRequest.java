// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSitePairsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SitePairType")
    public String sitePairType;

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

    public DescribeSitePairsRequest setSitePairType(String sitePairType) {
        this.sitePairType = sitePairType;
        return this;
    }
    public String getSitePairType() {
        return this.sitePairType;
    }

}
