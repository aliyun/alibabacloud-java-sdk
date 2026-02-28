// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechLicenseAvailableQuotaRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QuerySpeechLicenseAvailableQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechLicenseAvailableQuotaRequest self = new QuerySpeechLicenseAvailableQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechLicenseAvailableQuotaRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
