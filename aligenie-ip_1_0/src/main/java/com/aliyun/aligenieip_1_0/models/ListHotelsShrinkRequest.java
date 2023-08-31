// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsShrinkRequest extends TeaModel {
    @NameInMap("HotelRequest")
    public String hotelRequestShrink;

    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("Status")
    public Integer status;

    public static ListHotelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotelsShrinkRequest self = new ListHotelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHotelsShrinkRequest setHotelRequestShrink(String hotelRequestShrink) {
        this.hotelRequestShrink = hotelRequestShrink;
        return this;
    }
    public String getHotelRequestShrink() {
        return this.hotelRequestShrink;
    }

    public ListHotelsShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListHotelsShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
