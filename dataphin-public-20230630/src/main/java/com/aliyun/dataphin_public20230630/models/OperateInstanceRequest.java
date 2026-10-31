// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OperateInstanceRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: Development environment. </li>
     * <li>PROD: Production environment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The operation request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateCommand")
    public OperateInstanceRequestOperateCommand operateCommand;

    public static OperateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInstanceRequest self = new OperateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public OperateInstanceRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public OperateInstanceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public OperateInstanceRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public OperateInstanceRequest setOperateCommand(OperateInstanceRequestOperateCommand operateCommand) {
        this.operateCommand = operateCommand;
        return this;
    }
    public OperateInstanceRequestOperateCommand getOperateCommand() {
        return this.operateCommand;
    }

    public static class OperateInstanceRequestOperateCommandInstanceIdList extends TeaModel {
        /**
         * <p>The field instance IDs.</p>
         */
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_32111312</p>
         */
        @NameInMap("Id")
        public String id;

        public static OperateInstanceRequestOperateCommandInstanceIdList build(java.util.Map<String, ?> map) throws Exception {
            OperateInstanceRequestOperateCommandInstanceIdList self = new OperateInstanceRequestOperateCommandInstanceIdList();
            return TeaModel.build(map, self);
        }

        public OperateInstanceRequestOperateCommandInstanceIdList setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public OperateInstanceRequestOperateCommandInstanceIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class OperateInstanceRequestOperateCommand extends TeaModel {
        /**
         * <p>The O&amp;M instance list.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("InstanceIdList")
        public java.util.List<OperateInstanceRequestOperateCommandInstanceIdList> instanceIdList;

        /**
         * <p>The operation. Valid values:	</p>
         * <ul>
         * <li>RERUN: Rerun.</li>
         * <li>PAUSE: Pause.</li>
         * <li>RESUME: Resume.</li>
         * <li>TERMINATE: Stop.</li>
         * <li>SET_SUCCESS: Set to success.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RERUN</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132311</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static OperateInstanceRequestOperateCommand build(java.util.Map<String, ?> map) throws Exception {
            OperateInstanceRequestOperateCommand self = new OperateInstanceRequestOperateCommand();
            return TeaModel.build(map, self);
        }

        public OperateInstanceRequestOperateCommand setInstanceIdList(java.util.List<OperateInstanceRequestOperateCommandInstanceIdList> instanceIdList) {
            this.instanceIdList = instanceIdList;
            return this;
        }
        public java.util.List<OperateInstanceRequestOperateCommandInstanceIdList> getInstanceIdList() {
            return this.instanceIdList;
        }

        public OperateInstanceRequestOperateCommand setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public OperateInstanceRequestOperateCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
