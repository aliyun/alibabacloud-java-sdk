// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainNodesRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    public static DescribeAntChainNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainNodesRequest self = new DescribeAntChainNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainNodesRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
