// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapToHavanaBindIdRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("HavanaBindStations")
    public java.util.Map<String, ?> havanaBindStations;

    @NameInMap("Pk")
    public String pk;

    public static MapToHavanaBindIdRequest build(java.util.Map<String, ?> map) throws Exception {
        MapToHavanaBindIdRequest self = new MapToHavanaBindIdRequest();
        return TeaModel.build(map, self);
    }

    public MapToHavanaBindIdRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapToHavanaBindIdRequest setHavanaBindStations(java.util.Map<String, ?> havanaBindStations) {
        this.havanaBindStations = havanaBindStations;
        return this;
    }
    public java.util.Map<String, ?> getHavanaBindStations() {
        return this.havanaBindStations;
    }

    public MapToHavanaBindIdRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
