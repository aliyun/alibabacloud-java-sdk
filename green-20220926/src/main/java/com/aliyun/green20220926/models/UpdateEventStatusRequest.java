// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateEventStatusRequest extends TeaModel {
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
    public java.util.List<String> eventIds;

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

    public static UpdateEventStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventStatusRequest self = new UpdateEventStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEventStatusRequest setEventIds(java.util.List<String> eventIds) {
        this.eventIds = eventIds;
        return this;
    }
    public java.util.List<String> getEventIds() {
        return this.eventIds;
    }

    public UpdateEventStatusRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public UpdateEventStatusRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public UpdateEventStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEventStatusRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
