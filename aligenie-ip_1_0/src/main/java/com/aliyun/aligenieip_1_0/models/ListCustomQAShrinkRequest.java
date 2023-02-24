// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListCustomQAShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String pageShrink;

    public static ListCustomQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomQAShrinkRequest self = new ListCustomQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomQAShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListCustomQAShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListCustomQAShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

}
