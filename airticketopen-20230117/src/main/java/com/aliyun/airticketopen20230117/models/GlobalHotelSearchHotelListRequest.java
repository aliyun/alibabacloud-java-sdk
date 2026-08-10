// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelSearchHotelListRequest extends TeaModel {
    /**
     * <p>The distributor account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The city code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("CityCode")
    public String cityCode;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelSearchHotelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelSearchHotelListRequest self = new GlobalHotelSearchHotelListRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelSearchHotelListRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelSearchHotelListRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public GlobalHotelSearchHotelListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GlobalHotelSearchHotelListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GlobalHotelSearchHotelListRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}
