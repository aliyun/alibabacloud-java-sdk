// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSResourceInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    public static DescribeMPCoSResourceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSResourceInfoRequest self = new DescribeMPCoSResourceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSResourceInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeMPCoSResourceInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

}
