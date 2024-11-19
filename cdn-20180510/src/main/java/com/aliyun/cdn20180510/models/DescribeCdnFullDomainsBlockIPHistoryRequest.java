// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnFullDomainsBlockIPHistoryRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The end time must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-24T19:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IP address or CIDR blocks to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
     */
    @NameInMap("IPList")
    public String IPList;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-24T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnFullDomainsBlockIPHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnFullDomainsBlockIPHistoryRequest self = new DescribeCdnFullDomainsBlockIPHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnFullDomainsBlockIPHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnFullDomainsBlockIPHistoryRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

    public DescribeCdnFullDomainsBlockIPHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
