// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListScalingConfigStatusOutput extends TeaModel {
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("result")
    public java.util.List<ScalingConfigStatus> result;

    public static ListScalingConfigStatusOutput build(java.util.Map<String, ?> map) throws Exception {
        ListScalingConfigStatusOutput self = new ListScalingConfigStatusOutput();
        return TeaModel.build(map, self);
    }

    public ListScalingConfigStatusOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListScalingConfigStatusOutput setResult(java.util.List<ScalingConfigStatus> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ScalingConfigStatus> getResult() {
        return this.result;
    }

}
