// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrepayBillTotalRequest extends TeaModel {
    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li>elastic_traffic: elastic traffic.</li>
     * <li>sdl: sensitive data leak detection traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sdl</p>
     */
    @NameInMap("BillType")
    public String billType;

    /**
     * <p>The page number for a paged query. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The end time. Specify a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1646063922</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>zh</li>
     * <li>en</li>
     * </ul>
     * <p>Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The start time of the query. Specify a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePrepayBillTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrepayBillTotalRequest self = new DescribePrepayBillTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrepayBillTotalRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public DescribePrepayBillTotalRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePrepayBillTotalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePrepayBillTotalRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePrepayBillTotalRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePrepayBillTotalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
