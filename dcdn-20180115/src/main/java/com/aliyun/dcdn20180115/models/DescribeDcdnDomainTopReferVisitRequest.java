// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopReferVisitRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainTopReferVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopReferVisitRequest self = new DescribeDcdnDomainTopReferVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopReferVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopReferVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDcdnDomainTopReferVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
