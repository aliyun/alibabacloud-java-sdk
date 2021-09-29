// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetVehicleTrackResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Points")
    public java.util.List<GetVehicleTrackResponseBodyPoints> points;

    public static GetVehicleTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleTrackResponseBody self = new GetVehicleTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVehicleTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVehicleTrackResponseBody setPoints(java.util.List<GetVehicleTrackResponseBodyPoints> points) {
        this.points = points;
        return this;
    }
    public java.util.List<GetVehicleTrackResponseBodyPoints> getPoints() {
        return this.points;
    }

    public static class GetVehicleTrackResponseBodyPoints extends TeaModel {
        @NameInMap("Longitude")
        public Float longitude;

        @NameInMap("Latitude")
        public Float latitude;

        @NameInMap("Altitude")
        public Float altitude;

        @NameInMap("Speed")
        public Integer speed;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetVehicleTrackResponseBodyPoints build(java.util.Map<String, ?> map) throws Exception {
            GetVehicleTrackResponseBodyPoints self = new GetVehicleTrackResponseBodyPoints();
            return TeaModel.build(map, self);
        }

        public GetVehicleTrackResponseBodyPoints setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public GetVehicleTrackResponseBodyPoints setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public GetVehicleTrackResponseBodyPoints setAltitude(Float altitude) {
            this.altitude = altitude;
            return this;
        }
        public Float getAltitude() {
            return this.altitude;
        }

        public GetVehicleTrackResponseBodyPoints setSpeed(Integer speed) {
            this.speed = speed;
            return this;
        }
        public Integer getSpeed() {
            return this.speed;
        }

        public GetVehicleTrackResponseBodyPoints setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
