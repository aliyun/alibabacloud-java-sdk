// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainBlockRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Height")
    public Long height;

    public static DescribeAntChainBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainBlockRequest self = new DescribeAntChainBlockRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainBlockRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainBlockRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
