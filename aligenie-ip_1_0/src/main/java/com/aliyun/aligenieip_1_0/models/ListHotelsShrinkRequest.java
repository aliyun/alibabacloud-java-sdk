// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelsShrinkRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("HotelRequest")
    public String hotelRequestShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public String pageShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
