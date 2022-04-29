// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class LogOperationRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Params")
    public String params;

    public static LogOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        LogOperationRequest self = new LogOperationRequest();
        return TeaModel.build(map, self);
    }

    public LogOperationRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public LogOperationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
