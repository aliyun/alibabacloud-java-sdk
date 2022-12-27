// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainTopUrlVisitRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainTopUrlVisitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainTopUrlVisitRequest self = new DescribeDcdnDomainTopUrlVisitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainTopUrlVisitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainTopUrlVisitRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public DescribeDcdnDomainTopUrlVisitRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
