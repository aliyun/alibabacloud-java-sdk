// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RgeoCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39.989027</p>
     */
    @NameInMap("latitude")
    public String latitude;

    /**
     * <strong>example:</strong>
     * <p>116.310918</p>
     */
    @NameInMap("longitude")
    public String longitude;

    public static RgeoCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RgeoCodeRequest self = new RgeoCodeRequest();
        return TeaModel.build(map, self);
    }

    public RgeoCodeRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public RgeoCodeRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

}
