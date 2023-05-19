// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPHistoryRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IPList")
    public String IPList;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnFullDomainsBlockIPHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnFullDomainsBlockIPHistoryRequest self = new DescribeDcdnFullDomainsBlockIPHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnFullDomainsBlockIPHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

    public DescribeDcdnFullDomainsBlockIPHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
