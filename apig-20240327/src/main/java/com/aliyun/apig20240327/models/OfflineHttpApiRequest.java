// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class OfflineHttpApiRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    public static OfflineHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineHttpApiRequest self = new OfflineHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public OfflineHttpApiRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

}
