// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyCommand")
    public ApplyDataServiceAppRequestApplyCommand applyCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>102102</p>
     */
    @NameInMap("ProjectId")
    public Integer projectId;

    public static ApplyDataServiceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceAppRequest self = new ApplyDataServiceAppRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceAppRequest setApplyCommand(ApplyDataServiceAppRequestApplyCommand applyCommand) {
        this.applyCommand = applyCommand;
        return this;
    }
    public ApplyDataServiceAppRequestApplyCommand getApplyCommand() {
        return this.applyCommand;
    }

    public ApplyDataServiceAppRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ApplyDataServiceAppRequest setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }
    public Integer getProjectId() {
        return this.projectId;
    }

    public static class ApplyDataServiceAppRequestApplyCommand extends TeaModel {
        /**
         * <p>appId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2011</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static ApplyDataServiceAppRequestApplyCommand build(java.util.Map<String, ?> map) throws Exception {
            ApplyDataServiceAppRequestApplyCommand self = new ApplyDataServiceAppRequestApplyCommand();
            return TeaModel.build(map, self);
        }

        public ApplyDataServiceAppRequestApplyCommand setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public ApplyDataServiceAppRequestApplyCommand setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ApplyDataServiceAppRequestApplyCommand setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
