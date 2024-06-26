// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePublicAntChainDownloadPathsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribePublicAntChainDownloadPathsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePublicAntChainDownloadPathsRequest self = new DescribePublicAntChainDownloadPathsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePublicAntChainDownloadPathsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
