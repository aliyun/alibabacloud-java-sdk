// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceUpDownStreamRequest extends TeaModel {
    /**
     * <p>The number of downstream node levels. Default value: 1.</p>
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
     * <li>PROD (default): production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The center node.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public GetInstanceUpDownStreamRequestInstanceId instanceId;

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
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001121</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The number of upstream node levels. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UpStreamDepth")
    public Integer upStreamDepth;

    public static GetInstanceUpDownStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUpDownStreamRequest self = new GetInstanceUpDownStreamRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceUpDownStreamRequest setDownStreamDepth(Integer downStreamDepth) {
        this.downStreamDepth = downStreamDepth;
        return this;
    }
    public Integer getDownStreamDepth() {
        return this.downStreamDepth;
    }

    public GetInstanceUpDownStreamRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetInstanceUpDownStreamRequest setInstanceId(GetInstanceUpDownStreamRequestInstanceId instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public GetInstanceUpDownStreamRequestInstanceId getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceUpDownStreamRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetInstanceUpDownStreamRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetInstanceUpDownStreamRequest setUpStreamDepth(Integer upStreamDepth) {
        this.upStreamDepth = upStreamDepth;
        return this;
    }
    public Integer getUpStreamDepth() {
        return this.upStreamDepth;
    }

    public static class GetInstanceUpDownStreamRequestInstanceId extends TeaModel {
        /**
         * <p>The list of field IDs. This parameter can be specified when the node is a logical table instance ID. If this parameter is not specified, the full table is used by default.</p>
         */
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_123456</p>
         */
        @NameInMap("Id")
        public String id;

        public static GetInstanceUpDownStreamRequestInstanceId build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceUpDownStreamRequestInstanceId self = new GetInstanceUpDownStreamRequestInstanceId();
            return TeaModel.build(map, self);
        }

        public GetInstanceUpDownStreamRequestInstanceId setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public GetInstanceUpDownStreamRequestInstanceId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
