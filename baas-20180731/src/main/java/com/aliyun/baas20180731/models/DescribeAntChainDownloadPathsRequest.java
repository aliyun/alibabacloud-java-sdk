// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static DescribeAntChainDownloadPathsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsRequest self = new DescribeAntChainDownloadPathsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
