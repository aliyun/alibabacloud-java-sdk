// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceGet")
    public GetInstanceDownStreamRequestInstanceGet instanceGet;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("RunStatus")
    public String runStatus;

    public static GetInstanceDownStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDownStreamRequest self = new GetInstanceDownStreamRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceDownStreamRequest setDownStreamDepth(Integer downStreamDepth) {
        this.downStreamDepth = downStreamDepth;
        return this;
    }
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    public GetInstanceDownStreamRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetInstanceDownStreamRequest setInstanceGet(GetInstanceDownStreamRequestInstanceGet instanceGet) {
        this.instanceGet = instanceGet;
        return this;
    }
    public GetInstanceDownStreamRequestInstanceGet getInstanceGet() {
        return this.instanceGet;
    }

    public GetInstanceDownStreamRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetInstanceDownStreamRequest setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

    public static class GetInstanceDownStreamRequestInstanceGet extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_5929472_20210411_9577721</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        public static GetInstanceDownStreamRequestInstanceGet build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDownStreamRequestInstanceGet self = new GetInstanceDownStreamRequestInstanceGet();
            return TeaModel.build(map, self);
        }

        public GetInstanceDownStreamRequestInstanceGet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceDownStreamRequestInstanceGet setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

    }

}
