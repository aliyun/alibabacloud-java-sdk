// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStreamBatchJobMappingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamBatchJobMappingCreateCommand")
    public String streamBatchJobMappingCreateCommandShrink;

    public static CreateStreamBatchJobMappingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamBatchJobMappingShrinkRequest self = new CreateStreamBatchJobMappingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamBatchJobMappingShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public CreateStreamBatchJobMappingShrinkRequest setStreamBatchJobMappingCreateCommandShrink(String streamBatchJobMappingCreateCommandShrink) {
        this.streamBatchJobMappingCreateCommandShrink = streamBatchJobMappingCreateCommandShrink;
        return this;
    }
    public String getStreamBatchJobMappingCreateCommandShrink() {
        return this.streamBatchJobMappingCreateCommandShrink;
    }

}
