// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetEnvironmentRequest extends TeaModel {
    /**
     * <p>Indicates whether to return online resource info.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withStatistics")
    public Boolean withStatistics;

    /**
     * <p>Option for vpc info.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withVpcInfo")
    public Boolean withVpcInfo;

    public static GetEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentRequest self = new GetEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentRequest setWithStatistics(Boolean withStatistics) {
        this.withStatistics = withStatistics;
        return this;
    }
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

    public GetEnvironmentRequest setWithVpcInfo(Boolean withVpcInfo) {
        this.withVpcInfo = withVpcInfo;
        return this;
    }
    public Boolean getWithVpcInfo() {
        return this.withVpcInfo;
    }

}
