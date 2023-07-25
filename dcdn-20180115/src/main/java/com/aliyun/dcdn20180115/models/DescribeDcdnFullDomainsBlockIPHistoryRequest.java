// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnFullDomainsBlockIPHistoryRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IP address or CIDR block to query.</p>
     */
    @NameInMap("IPList")
    public String IPList;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     */
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
