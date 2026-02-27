// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateDataServiceAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateDataServiceAppRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateDataServiceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceAppRequest self = new CreateDataServiceAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceAppRequest setCreateCommand(CreateDataServiceAppRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateDataServiceAppRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateDataServiceAppRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateDataServiceAppRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200000000</p>
         */
        @NameInMap("AppGroupId")
        public Integer appGroupId;

        /**
         * <strong>example:</strong>
         * <p>200000001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>默认应用</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>abc123456789</p>
         */
        @NameInMap("AppSecret")
        public String appSecret;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>数据分析</p>
         */
        @NameInMap("Scenarios")
        public String scenarios;

        public static CreateDataServiceAppRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateDataServiceAppRequestCreateCommand self = new CreateDataServiceAppRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateDataServiceAppRequestCreateCommand setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        public CreateDataServiceAppRequestCreateCommand setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public CreateDataServiceAppRequestCreateCommand setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public CreateDataServiceAppRequestCreateCommand setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public CreateDataServiceAppRequestCreateCommand setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

        public CreateDataServiceAppRequestCreateCommand setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

}
