// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeDetailDataRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Field")
    public String field;

    @NameInMap("IspNameEn")
    public String ispNameEn;

    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("Merge")
    public String merge;

    @NameInMap("MergeLocIsp")
    public String mergeLocIsp;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainRealTimeDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainRealTimeDetailDataRequest self = new DescribeDcdnDomainRealTimeDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setMerge(String merge) {
        this.merge = merge;
        return this;
    }
    public String getMerge() {
        return this.merge;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setMergeLocIsp(String mergeLocIsp) {
        this.mergeLocIsp = mergeLocIsp;
        return this;
    }
    public String getMergeLocIsp() {
        return this.mergeLocIsp;
    }

    public DescribeDcdnDomainRealTimeDetailDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
