// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeDownloadPathsRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    public static DescribeDownloadPathsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadPathsRequest self = new DescribeDownloadPathsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadPathsRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

}
