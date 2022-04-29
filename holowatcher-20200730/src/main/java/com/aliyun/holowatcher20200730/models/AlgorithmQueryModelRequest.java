// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmQueryModelRequest extends TeaModel {
    @NameInMap("RequestNumber")
    public String requestNumber;

    public static AlgorithmQueryModelRequest build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmQueryModelRequest self = new AlgorithmQueryModelRequest();
        return TeaModel.build(map, self);
    }

    public AlgorithmQueryModelRequest setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
        return this;
    }
    public String getRequestNumber() {
        return this.requestNumber;
    }

}
