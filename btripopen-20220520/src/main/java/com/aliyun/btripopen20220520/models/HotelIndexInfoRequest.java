// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelIndexInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>330000</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("hotel_status")
    public Integer hotelStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1038882</p>
     */
    @NameInMap("page_token")
    public String pageToken;

    public static HotelIndexInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelIndexInfoRequest self = new HotelIndexInfoRequest();
        return TeaModel.build(map, self);
    }

    public HotelIndexInfoRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelIndexInfoRequest setHotelStatus(Integer hotelStatus) {
        this.hotelStatus = hotelStatus;
        return this;
    }
    public Integer getHotelStatus() {
        return this.hotelStatus;
    }

    public HotelIndexInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public HotelIndexInfoRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
