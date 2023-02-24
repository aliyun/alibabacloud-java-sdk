// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListServiceQAShrinkRequest extends TeaModel {
    @NameInMap("Active")
    public Boolean active;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public String pageShrink;

    public static ListServiceQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceQAShrinkRequest self = new ListServiceQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceQAShrinkRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ListServiceQAShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public ListServiceQAShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServiceQAShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

}
