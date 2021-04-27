// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDataAPIServiceDetailRequest extends TeaModel {
    @NameInMap("ApiSrn")
    public String apiSrn;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GetDataAPIServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataAPIServiceDetailRequest self = new GetDataAPIServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataAPIServiceDetailRequest setApiSrn(String apiSrn) {
        this.apiSrn = apiSrn;
        return this;
    }
    public String getApiSrn() {
        return this.apiSrn;
    }

    public GetDataAPIServiceDetailRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
