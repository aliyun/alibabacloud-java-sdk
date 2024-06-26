// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsOfContractChainRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeDownloadPathsOfContractChainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsOfContractChainRequest self = new DescribeDownloadPathsOfContractChainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsOfContractChainRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
