// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateEventStatusShrinkRequest extends TeaModel {
    /**
     * <p>The application ID that identifies the application to which the operation belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The list of risk event IDs.</p>
     */
    @NameInMap("EventIds")
    public String eventIdsShrink;

    /**
     * <p>The operation code that defines the specific type of event status change operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>resolve</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The operation parameters that contain additional parameter information required to execute the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operation source that identifies the source system or module that triggered this status update request.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Source")
    public String source;

    public static UpdateEventStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStatusShrinkRequest self = new UpdateEventStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventStatusShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEventStatusShrinkRequest setEventIdsShrink(String eventIdsShrink) {
        this.eventIdsShrink = eventIdsShrink;
        return this;
    }
    public String getEventIdsShrink() {
        return this.eventIdsShrink;
    }

    public UpdateEventStatusShrinkRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public UpdateEventStatusShrinkRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public UpdateEventStatusShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEventStatusShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
