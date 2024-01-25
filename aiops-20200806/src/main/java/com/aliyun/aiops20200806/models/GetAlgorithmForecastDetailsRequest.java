// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmForecastDetailsRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAlgorithmForecastDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmForecastDetailsRequest self = new GetAlgorithmForecastDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmForecastDetailsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAlgorithmForecastDetailsRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetAlgorithmForecastDetailsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
