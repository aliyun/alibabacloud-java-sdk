// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayBillRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The end time of the bill query. The time is a UNIX timestamp accurate to seconds and must be later than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1646063922</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The aggregation interval of the bill data. Unit: seconds. This parameter is required. If you do not specify this parameter, the ERR_PARAMS_INVALID error is returned. Valid values:</p>
     * <ul>
     * <li>3600: Hourly aggregation.</li>
     * <li>86400: Daily aggregation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.
     * Default value: zh.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paging query. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time of the bill query. The time is a UNIX timestamp accurate to seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePostpayBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayBillRequest self = new DescribePostpayBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostpayBillRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePostpayBillRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePostpayBillRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public DescribePostpayBillRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePostpayBillRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePostpayBillRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
