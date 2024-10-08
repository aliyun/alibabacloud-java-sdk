// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class AppFailBackRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61ZW1DY5Y3FSAOO2</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static AppFailBackRequest build(java.util.Map<String, ?> map) throws Exception {
        AppFailBackRequest self = new AppFailBackRequest();
        return TeaModel.build(map, self);
    }

    public AppFailBackRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
