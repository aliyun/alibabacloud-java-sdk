// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRemainQpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Qps")
    public Integer qps;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeRemainQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRemainQpsResponseBody self = new DescribeRemainQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRemainQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRemainQpsResponseBody setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

    public DescribeRemainQpsResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

}
