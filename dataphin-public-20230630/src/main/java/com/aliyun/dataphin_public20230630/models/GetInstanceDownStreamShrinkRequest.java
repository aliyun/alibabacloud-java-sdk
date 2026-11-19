// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamShrinkRequest extends TeaModel {
    /**
     * <p>The number of levels to expand the DAG downwards. Valid values: 1 to 6.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment. </li>
     * <li>PROD: production environment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The get request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceGet")
    public String instanceGetShrink;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The run status of the instance. Valid values:</p>
     * <ul>
     * <li>INIT</li>
     * <li>WATING</li>
     * <li>RUNNING</li>
     * <li>SUCCESS</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("RunStatus")
    public String runStatus;

    public static GetInstanceDownStreamShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDownStreamShrinkRequest self = new GetInstanceDownStreamShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceDownStreamShrinkRequest setDownStreamDepth(Integer downStreamDepth) {
        this.downStreamDepth = downStreamDepth;
        return this;
    }
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    public GetInstanceDownStreamShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetInstanceDownStreamShrinkRequest setInstanceGetShrink(String instanceGetShrink) {
        this.instanceGetShrink = instanceGetShrink;
        return this;
    }
    public String getInstanceGetShrink() {
        return this.instanceGetShrink;
    }

    public GetInstanceDownStreamShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetInstanceDownStreamShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public GetInstanceDownStreamShrinkRequest setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

}
