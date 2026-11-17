// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateAiModelSourceRequest extends TeaModel {
    /**
     * <p>The display name of the model source or model provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Model Studio model source</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The expected object version. Use the version returned by the most recent query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("expectedVersion")
    public Long expectedVersion;

    /**
     * <p>The ID of the actual AI service bound to the model source.</p>
     * 
     * <strong>example:</strong>
     * <p>svc-d00000000000000000000</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    public static UpdateAiModelSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiModelSourceRequest self = new UpdateAiModelSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiModelSourceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateAiModelSourceRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateAiModelSourceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
