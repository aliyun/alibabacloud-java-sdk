// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmConfigRequest extends TeaModel {
    @NameInMap("AlgorithmTypeCode")
    public String algorithmTypeCode;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAlgorithmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmConfigRequest self = new GetAlgorithmConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmConfigRequest setAlgorithmTypeCode(String algorithmTypeCode) {
        this.algorithmTypeCode = algorithmTypeCode;
        return this;
    }
    public String getAlgorithmTypeCode() {
        return this.algorithmTypeCode;
    }

    public GetAlgorithmConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
