// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainRealTimeDetailDataRequest extends TeaModel {
    /**
     * <p>Specifies whether to return a summary value of **LocationNameEn** and **IspNameEn**. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>The default value is **false**.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time, and the maximum time range to query is 10 minutes.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to return a summary value. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     * <br>
     * <p>The default value is **false**.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The information returned.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The type of the information that you want to query. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **qps**: queries per second</p>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **http_code**: HTTP status code</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Merge")
    public String merge;

    /**
     * <p>The name of the region. You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query the region name.</p>
     * <br>
     * <p>If you do not specify a value for this parameter, all regions are queried.</p>
     */
    @NameInMap("MergeLocIsp")
    public String mergeLocIsp;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
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
