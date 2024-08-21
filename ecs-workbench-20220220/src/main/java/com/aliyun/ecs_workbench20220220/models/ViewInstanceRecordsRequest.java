// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ViewInstanceRecordsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("TerminalSessionToken")
    public String terminalSessionToken;

    public static ViewInstanceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewInstanceRecordsRequest self = new ViewInstanceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ViewInstanceRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ViewInstanceRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewInstanceRecordsRequest setTerminalSessionToken(String terminalSessionToken) {
        this.terminalSessionToken = terminalSessionToken;
        return this;
    }
    public String getTerminalSessionToken() {
        return this.terminalSessionToken;
    }

}
