// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingFlightListRequest extends TeaModel {
    @NameInMap("arr_city")
    public String arrCity;

    @NameInMap("dep_city")
    public String depCity;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    @NameInMap("traveler_info_list")
    public java.util.List<TicketChangingFlightListRequestTravelerInfoList> travelerInfoList;

    public static TicketChangingFlightListRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingFlightListRequest self = new TicketChangingFlightListRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingFlightListRequest setArrCity(String arrCity) {
        this.arrCity = arrCity;
        return this;
    }
    public String getArrCity() {
        return this.arrCity;
    }

    public TicketChangingFlightListRequest setDepCity(String depCity) {
        this.depCity = depCity;
        return this;
    }
    public String getDepCity() {
        return this.depCity;
    }

    public TicketChangingFlightListRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public TicketChangingFlightListRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingFlightListRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public TicketChangingFlightListRequest setTravelerInfoList(java.util.List<TicketChangingFlightListRequestTravelerInfoList> travelerInfoList) {
        this.travelerInfoList = travelerInfoList;
        return this;
    }
    public java.util.List<TicketChangingFlightListRequestTravelerInfoList> getTravelerInfoList() {
        return this.travelerInfoList;
    }

    public static class TicketChangingFlightListRequestTravelerInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static TicketChangingFlightListRequestTravelerInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListRequestTravelerInfoList self = new TicketChangingFlightListRequestTravelerInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListRequestTravelerInfoList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TicketChangingFlightListRequestTravelerInfoList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TicketChangingFlightListRequestTravelerInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TicketChangingFlightListRequestTravelerInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TicketChangingFlightListRequestTravelerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
