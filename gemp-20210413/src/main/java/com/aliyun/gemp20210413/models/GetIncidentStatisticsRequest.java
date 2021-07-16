// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentStatisticsRequest extends TeaModel {
    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    public static GetIncidentStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentStatisticsRequest self = new GetIncidentStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentStatisticsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
