// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaConnDataRequest extends TeaModel {
    /**
     * <p>The domain names accelerated by IPA. Separate multiple domain names with commas (,).</p>
     * <br>
     * <p>> If you do not specify this parameter, the merged data of all accelerated domain names is returned.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies how query results are grouped. By default, this parameter is empty. Valid values:</p>
     * <br>
     * <p>*   domain: Query results are grouped by accelerated domain name.</p>
     * <p>*   An empty string: Query results are not grouped.</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnDomainIpaConnDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaConnDataRequest self = new DescribeDcdnDomainIpaConnDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaConnDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaConnDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaConnDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeDcdnDomainIpaConnDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
