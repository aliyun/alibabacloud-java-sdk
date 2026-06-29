// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamRequest extends TeaModel {
    /**
     * <p>Number of levels to expand downstream in the DAG query. Valid values: 1 to 6.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DownStreamDepth")
    public Integer downStreamDepth;

    /**
     * <p>Environment identifier.</p>
     * <ul>
     * <li>DEV: Development environment.</li>
     * <li>PROD (default): Production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceGet")
    public GetInstanceDownStreamRequestInstanceGet instanceGet;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>Run status of the instance.</p>
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
         * <p>Instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_5929472_20210411_9577721</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Node type of the instance.</p>
         * <ul>
         * <li>BBOX_LOGIC_TABLE_NODE</li>
         * <li>BBOX_LOGIC_FIELD_NODE</li>
         * <li>BBOX_LOGIC_FIELD_GROUP_NODE</li>
         * <li>BBOX_INNER_TEMP_NODE</li>
         * <li>DATA_PROCESS</li>
         * <li>STREAM_TASK_NODE</li>
         * <li>FLINK_BATCH</li>
         * </ul>
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
