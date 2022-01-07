// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdRequest extends TeaModel {
    @NameInMap("ApplyId")
    public Long applyId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryCertUrlByApplyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertUrlByApplyIdRequest self = new QueryCertUrlByApplyIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCertUrlByApplyIdRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public QueryCertUrlByApplyIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
