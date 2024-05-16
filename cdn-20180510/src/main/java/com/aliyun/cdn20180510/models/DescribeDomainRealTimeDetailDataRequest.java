// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeDetailDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:40:00Z.</p>
     * <br>
     * <p>> The end time must be later than the start time. The difference between the end time and the start time cannot exceed 10 minutes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of data that you want to query. You can specify multiple data types and separate them with commas (,). Valid values:</p>
     * <br>
     * <p>*   **qps**: queries per second (QPS)</p>
     * <p>*   **bps**: bandwidth</p>
     * <p>*   **http_code**: HTTP status code</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The name of the Internet service provider (ISP). You can call the [DescribeCdnRegionAndIsp](https://help.aliyun.com/document_detail/91077.html) operation to query ISPs. If you do not specify an ISP, data of all ISPs is queried.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region. If you do not specify a region, data in all regions is queried. You can call the [DescribeCdnRegionAndIsp](https://help.aliyun.com/document_detail/91077.html) operation to query regions.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>Specifies whether to return a summary value based on ISPs and regions. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("Merge")
    public String merge;

    /**
     * <p>Specifies whether to return a summary value based on ISPs and regions. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("MergeLocIsp")
    public String mergeLocIsp;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. Example: 2019-11-30T05:33:00Z.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeDetailDataRequest self = new DescribeDomainRealTimeDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeDetailDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeDetailDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeDetailDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeDomainRealTimeDetailDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainRealTimeDetailDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainRealTimeDetailDataRequest setMerge(String merge) {
        this.merge = merge;
        return this;
    }
    public String getMerge() {
        return this.merge;
    }

    public DescribeDomainRealTimeDetailDataRequest setMergeLocIsp(String mergeLocIsp) {
        this.mergeLocIsp = mergeLocIsp;
        return this;
    }
    public String getMergeLocIsp() {
        return this.mergeLocIsp;
    }

    public DescribeDomainRealTimeDetailDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
