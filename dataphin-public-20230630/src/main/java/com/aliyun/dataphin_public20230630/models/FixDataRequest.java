// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class FixDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FixDataCommand")
    public FixDataRequestFixDataCommand fixDataCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static FixDataRequest build(java.util.Map<String, ?> map) throws Exception {
        FixDataRequest self = new FixDataRequest();
        return TeaModel.build(map, self);
    }

    public FixDataRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public FixDataRequest setFixDataCommand(FixDataRequestFixDataCommand fixDataCommand) {
        this.fixDataCommand = fixDataCommand;
        return this;
    }
    public FixDataRequestFixDataCommand getFixDataCommand() {
        return this.fixDataCommand;
    }

    public FixDataRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class FixDataRequestFixDataCommandDownStreamInstanceIdList extends TeaModel {
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <strong>example:</strong>
         * <p>t_2323421</p>
         */
        @NameInMap("Id")
        public String id;

        public static FixDataRequestFixDataCommandDownStreamInstanceIdList build(java.util.Map<String, ?> map) throws Exception {
            FixDataRequestFixDataCommandDownStreamInstanceIdList self = new FixDataRequestFixDataCommandDownStreamInstanceIdList();
            return TeaModel.build(map, self);
        }

        public FixDataRequestFixDataCommandDownStreamInstanceIdList setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public FixDataRequestFixDataCommandDownStreamInstanceIdList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class FixDataRequestFixDataCommandRootInstanceId extends TeaModel {
        @NameInMap("FieldInstanceIdList")
        public java.util.List<String> fieldInstanceIdList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t_2323111</p>
         */
        @NameInMap("Id")
        public String id;

        public static FixDataRequestFixDataCommandRootInstanceId build(java.util.Map<String, ?> map) throws Exception {
            FixDataRequestFixDataCommandRootInstanceId self = new FixDataRequestFixDataCommandRootInstanceId();
            return TeaModel.build(map, self);
        }

        public FixDataRequestFixDataCommandRootInstanceId setFieldInstanceIdList(java.util.List<String> fieldInstanceIdList) {
            this.fieldInstanceIdList = fieldInstanceIdList;
            return this;
        }
        public java.util.List<String> getFieldInstanceIdList() {
            return this.fieldInstanceIdList;
        }

        public FixDataRequestFixDataCommandRootInstanceId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class FixDataRequestFixDataCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainRootInstance")
        public Boolean containRootInstance;

        @NameInMap("DownStreamInstanceIdList")
        public java.util.List<FixDataRequestFixDataCommandDownStreamInstanceIdList> downStreamInstanceIdList;

        /**
         * <strong>example:</strong>
         * <p>ALL_INSTANCE</p>
         */
        @NameInMap("DownstreamRange")
        public String downstreamRange;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForceRerun")
        public Boolean forceRerun;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132344</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RootInstanceId")
        public FixDataRequestFixDataCommandRootInstanceId rootInstanceId;

        public static FixDataRequestFixDataCommand build(java.util.Map<String, ?> map) throws Exception {
            FixDataRequestFixDataCommand self = new FixDataRequestFixDataCommand();
            return TeaModel.build(map, self);
        }

        public FixDataRequestFixDataCommand setContainRootInstance(Boolean containRootInstance) {
            this.containRootInstance = containRootInstance;
            return this;
        }
        public Boolean getContainRootInstance() {
            return this.containRootInstance;
        }

        public FixDataRequestFixDataCommand setDownStreamInstanceIdList(java.util.List<FixDataRequestFixDataCommandDownStreamInstanceIdList> downStreamInstanceIdList) {
            this.downStreamInstanceIdList = downStreamInstanceIdList;
            return this;
        }
        public java.util.List<FixDataRequestFixDataCommandDownStreamInstanceIdList> getDownStreamInstanceIdList() {
            return this.downStreamInstanceIdList;
        }

        public FixDataRequestFixDataCommand setDownstreamRange(String downstreamRange) {
            this.downstreamRange = downstreamRange;
            return this;
        }
        public String getDownstreamRange() {
            return this.downstreamRange;
        }

        public FixDataRequestFixDataCommand setForceRerun(Boolean forceRerun) {
            this.forceRerun = forceRerun;
            return this;
        }
        public Boolean getForceRerun() {
            return this.forceRerun;
        }

        public FixDataRequestFixDataCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public FixDataRequestFixDataCommand setRootInstanceId(FixDataRequestFixDataCommandRootInstanceId rootInstanceId) {
            this.rootInstanceId = rootInstanceId;
            return this;
        }
        public FixDataRequestFixDataCommandRootInstanceId getRootInstanceId() {
            return this.rootInstanceId;
        }

    }

}
