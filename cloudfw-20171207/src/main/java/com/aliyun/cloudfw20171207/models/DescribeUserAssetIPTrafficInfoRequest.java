// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoRequest extends TeaModel {
    /**
     * <p>The IP address of the asset.</p>
     */
    @NameInMap("AssetIP")
    public String assetIP;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("TrafficTime")
    public String trafficTime;

    public static DescribeUserAssetIPTrafficInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetIPTrafficInfoRequest self = new DescribeUserAssetIPTrafficInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetIPTrafficInfoRequest setAssetIP(String assetIP) {
        this.assetIP = assetIP;
        return this;
    }
    public String getAssetIP() {
        return this.assetIP;
    }

    public DescribeUserAssetIPTrafficInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUserAssetIPTrafficInfoRequest setTrafficTime(String trafficTime) {
        this.trafficTime = trafficTime;
        return this;
    }
    public String getTrafficTime() {
        return this.trafficTime;
    }

}
