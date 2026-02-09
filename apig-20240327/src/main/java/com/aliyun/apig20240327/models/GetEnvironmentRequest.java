// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetEnvironmentRequest extends TeaModel {
    /**
     * <p>The request ID, which is used to trace the API call link.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("withStatistics")
    public Boolean withStatistics;

    /**
     * <p>Schema of Response</p>
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
