// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class PageGetHotelRoomDevicesRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static PageGetHotelRoomDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        PageGetHotelRoomDevicesRequest self = new PageGetHotelRoomDevicesRequest();
        return TeaModel.build(map, self);
    }

    public PageGetHotelRoomDevicesRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public PageGetHotelRoomDevicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PageGetHotelRoomDevicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
