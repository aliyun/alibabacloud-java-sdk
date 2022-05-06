// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HomeDMapValue extends TeaModel {
    // detail
    @NameInMap("Detail")
    public String detail;

    // location
    @NameInMap("Location")
    public HomeDMapValueLocation location;

    public static HomeDMapValue build(java.util.Map<String, ?> map) throws Exception {
        HomeDMapValue self = new HomeDMapValue();
        return TeaModel.build(map, self);
    }

    public HomeDMapValue setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public HomeDMapValue setLocation(HomeDMapValueLocation location) {
        this.location = location;
        return this;
    }
    public HomeDMapValueLocation getLocation() {
        return this.location;
    }

    public static class HomeDMapValueLocation extends TeaModel {
        // late
        @NameInMap("Late")
        public Long late;

        // Lon
        @NameInMap("Lon")
        public Long lon;

        public static HomeDMapValueLocation build(java.util.Map<String, ?> map) throws Exception {
            HomeDMapValueLocation self = new HomeDMapValueLocation();
            return TeaModel.build(map, self);
        }

        public HomeDMapValueLocation setLate(Long late) {
            this.late = late;
            return this;
        }
        public Long getLate() {
            return this.late;
        }

        public HomeDMapValueLocation setLon(Long lon) {
            this.lon = lon;
            return this;
        }
        public Long getLon() {
            return this.lon;
        }

    }

}
