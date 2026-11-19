// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateDataServiceAppRequest extends TeaModel {
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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The update command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpdateCommand")
    public UpdateDataServiceAppRequestUpdateCommand updateCommand;

    public static UpdateDataServiceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataServiceAppRequest self = new UpdateDataServiceAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataServiceAppRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateDataServiceAppRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpdateDataServiceAppRequest setUpdateCommand(UpdateDataServiceAppRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateDataServiceAppRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateDataServiceAppRequestUpdateCommand extends TeaModel {
        /**
         * <p>The application group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200000000</p>
         */
        @NameInMap("AppGroupId")
        public Integer appGroupId;

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default application</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The owner IDs.</p>
         */
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        /**
         * <p>The common scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>Data analytics</p>
         */
        @NameInMap("Scenarios")
        public String scenarios;

        public static UpdateDataServiceAppRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataServiceAppRequestUpdateCommand self = new UpdateDataServiceAppRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateDataServiceAppRequestUpdateCommand setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        public UpdateDataServiceAppRequestUpdateCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public UpdateDataServiceAppRequestUpdateCommand setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public UpdateDataServiceAppRequestUpdateCommand setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

        public UpdateDataServiceAppRequestUpdateCommand setScenarios(String scenarios) {
            this.scenarios = scenarios;
            return this;
        }
        public String getScenarios() {
            return this.scenarios;
        }

    }

}
