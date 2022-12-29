// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateNightModeRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("NightMode")
    public AddOrUpdateNightModeRequestNightMode nightMode;

    public static AddOrUpdateNightModeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateNightModeRequest self = new AddOrUpdateNightModeRequest();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateNightModeRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddOrUpdateNightModeRequest setNightMode(AddOrUpdateNightModeRequestNightMode nightMode) {
        this.nightMode = nightMode;
        return this;
    }
    public AddOrUpdateNightModeRequestNightMode getNightMode() {
        return this.nightMode;
    }

    public static class AddOrUpdateNightModeRequestNightMode extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("End")
        public String end;

        @NameInMap("MaxBright")
        public String maxBright;

        @NameInMap("MaxVolume")
        public String maxVolume;

        @NameInMap("StandbyAction")
        public String standbyAction;

        @NameInMap("Start")
        public String start;

        public static AddOrUpdateNightModeRequestNightMode build(java.util.Map<String, ?> map) throws Exception {
            AddOrUpdateNightModeRequestNightMode self = new AddOrUpdateNightModeRequestNightMode();
            return TeaModel.build(map, self);
        }

        public AddOrUpdateNightModeRequestNightMode setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public AddOrUpdateNightModeRequestNightMode setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public AddOrUpdateNightModeRequestNightMode setMaxBright(String maxBright) {
            this.maxBright = maxBright;
            return this;
        }
        public String getMaxBright() {
            return this.maxBright;
        }

        public AddOrUpdateNightModeRequestNightMode setMaxVolume(String maxVolume) {
            this.maxVolume = maxVolume;
            return this;
        }
        public String getMaxVolume() {
            return this.maxVolume;
        }

        public AddOrUpdateNightModeRequestNightMode setStandbyAction(String standbyAction) {
            this.standbyAction = standbyAction;
            return this;
        }
        public String getStandbyAction() {
            return this.standbyAction;
        }

        public AddOrUpdateNightModeRequestNightMode setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
