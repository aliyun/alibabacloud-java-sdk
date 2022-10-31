// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByTimeStampRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("IspNames")
    public String ispNames;

    @NameInMap("LocationNames")
    public String locationNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeLiveDomainBpsDataByTimeStampRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByTimeStampRequest self = new DescribeLiveDomainBpsDataByTimeStampRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByTimeStampRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataByTimeStampRequest setIspNames(String ispNames) {
        this.ispNames = ispNames;
        return this;
    }
    public String getIspNames() {
        return this.ispNames;
    }

    public DescribeLiveDomainBpsDataByTimeStampRequest setLocationNames(String locationNames) {
        this.locationNames = locationNames;
        return this;
    }
    public String getLocationNames() {
        return this.locationNames;
    }

    public DescribeLiveDomainBpsDataByTimeStampRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainBpsDataByTimeStampRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
