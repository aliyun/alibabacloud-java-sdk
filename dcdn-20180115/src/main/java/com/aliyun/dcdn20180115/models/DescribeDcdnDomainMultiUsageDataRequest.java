// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainMultiUsageDataRequest extends TeaModel {
    /**
     * <p>If this parameter is not set, data of all your accelerated domain names is queried.</p>
     * <p>You can specify multiple domain names and separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time must be later than the start time.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</li>
     * <li>You need to set both the start time and the end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query.</p>
     * <ul>
     * <li>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</li>
     * <li>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</li>
     * <li>The resolution of the queried data is 5 minutes.</li>
     * <li>If you do not set this parameter, data in the last 24 hours is queried.</li>
     * <li>You need to set both the start time and the end time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainMultiUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainMultiUsageDataRequest self = new DescribeDcdnDomainMultiUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainMultiUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainMultiUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainMultiUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
