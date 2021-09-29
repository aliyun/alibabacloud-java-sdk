// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetCommercialVehicleTrackResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Points")
    public java.util.List<GetCommercialVehicleTrackResponseBodyPoints> points;

    public static GetCommercialVehicleTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCommercialVehicleTrackResponseBody self = new GetCommercialVehicleTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCommercialVehicleTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCommercialVehicleTrackResponseBody setPoints(java.util.List<GetCommercialVehicleTrackResponseBodyPoints> points) {
        this.points = points;
        return this;
    }
    public java.util.List<GetCommercialVehicleTrackResponseBodyPoints> getPoints() {
        return this.points;
    }

    public static class GetCommercialVehicleTrackResponseBodyPoints extends TeaModel {
        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Altitude")
        public String altitude;

        @NameInMap("Speed")
        public Long speed;

        @NameInMap("Direction")
        public Long direction;

        @NameInMap("Time")
        public Long time;

        public static GetCommercialVehicleTrackResponseBodyPoints build(java.util.Map<String, ?> map) throws Exception {
            GetCommercialVehicleTrackResponseBodyPoints self = new GetCommercialVehicleTrackResponseBodyPoints();
            return TeaModel.build(map, self);
        }

        public GetCommercialVehicleTrackResponseBodyPoints setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GetCommercialVehicleTrackResponseBodyPoints setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public GetCommercialVehicleTrackResponseBodyPoints setAltitude(String altitude) {
            this.altitude = altitude;
            return this;
        }
        public String getAltitude() {
            return this.altitude;
        }

        public GetCommercialVehicleTrackResponseBodyPoints setSpeed(Long speed) {
            this.speed = speed;
            return this;
        }
        public Long getSpeed() {
            return this.speed;
        }

        public GetCommercialVehicleTrackResponseBodyPoints setDirection(Long direction) {
            this.direction = direction;
            return this;
        }
        public Long getDirection() {
            return this.direction;
        }

        public GetCommercialVehicleTrackResponseBodyPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
