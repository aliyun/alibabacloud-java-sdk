// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainDownloadPathsV2Request extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeAntChainDownloadPathsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainDownloadPathsV2Request self = new DescribeAntChainDownloadPathsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainDownloadPathsV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainDownloadPathsV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
