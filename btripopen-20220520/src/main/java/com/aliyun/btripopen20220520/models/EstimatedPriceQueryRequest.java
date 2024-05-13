// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class EstimatedPriceQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arr_city")
    public String arrCity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_city")
    public String depCity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("end_time")
    public Long endTime;

    @NameInMap("itinerary_id")
    public String itineraryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("start_time")
    public Long startTime;

    @NameInMap("sub_corp_id")
    public String subCorpId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static EstimatedPriceQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimatedPriceQueryRequest self = new EstimatedPriceQueryRequest();
        return TeaModel.build(map, self);
    }

    public EstimatedPriceQueryRequest setArrCity(String arrCity) {
        this.arrCity = arrCity;
        return this;
    }
    public String getArrCity() {
        return this.arrCity;
    }

    public EstimatedPriceQueryRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public EstimatedPriceQueryRequest setDepCity(String depCity) {
        this.depCity = depCity;
        return this;
    }
    public String getDepCity() {
        return this.depCity;
    }

    public EstimatedPriceQueryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public EstimatedPriceQueryRequest setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
        return this;
    }
    public String getItineraryId() {
        return this.itineraryId;
    }

    public EstimatedPriceQueryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public EstimatedPriceQueryRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public EstimatedPriceQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
