// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSuggestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>23141</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <strong>example:</strong>
     * <p>2024-06-19</p>
     */
    @NameInMap("check_in")
    public String checkIn;

    /**
     * <strong>example:</strong>
     * <p>2024-10-30</p>
     */
    @NameInMap("check_out")
    public String checkOut;

    /**
     * <strong>example:</strong>
     * <p>330100</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("search_type")
    public Integer searchType;

    public static HotelSuggestRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelSuggestRequest self = new HotelSuggestRequest();
        return TeaModel.build(map, self);
    }

    public HotelSuggestRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelSuggestRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelSuggestRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelSuggestRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public HotelSuggestRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public HotelSuggestRequest setSearchType(Integer searchType) {
        this.searchType = searchType;
        return this;
    }
    public Integer getSearchType() {
        return this.searchType;
    }

}
