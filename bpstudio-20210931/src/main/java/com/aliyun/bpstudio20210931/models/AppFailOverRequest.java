// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailOverRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE68D71ZY5YYIU9R</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("FailZone")
    public String failZone;

    public static AppFailOverRequest build(java.util.Map<String, ?> map) throws Exception {
        AppFailOverRequest self = new AppFailOverRequest();
        return TeaModel.build(map, self);
    }

    public AppFailOverRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public AppFailOverRequest setFailZone(String failZone) {
        this.failZone = failZone;
        return this;
    }
    public String getFailZone() {
        return this.failZone;
    }

}
