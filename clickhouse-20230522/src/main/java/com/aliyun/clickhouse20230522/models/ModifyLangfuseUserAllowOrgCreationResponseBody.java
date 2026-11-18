// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyLangfuseUserAllowOrgCreationResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ModifyLangfuseUserAllowOrgCreationResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLangfuseUserAllowOrgCreationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLangfuseUserAllowOrgCreationResponseBody self = new ModifyLangfuseUserAllowOrgCreationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLangfuseUserAllowOrgCreationResponseBody setData(ModifyLangfuseUserAllowOrgCreationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyLangfuseUserAllowOrgCreationResponseBodyData getData() {
        return this.data;
    }

    public ModifyLangfuseUserAllowOrgCreationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyLangfuseUserAllowOrgCreationResponseBodyData extends TeaModel {
        /**
         * <p>Specifies whether the user is allowed to create organizations.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowOrgCreation")
        public Boolean allowOrgCreation;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@company.com">alice@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        public static ModifyLangfuseUserAllowOrgCreationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyLangfuseUserAllowOrgCreationResponseBodyData self = new ModifyLangfuseUserAllowOrgCreationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyLangfuseUserAllowOrgCreationResponseBodyData setAllowOrgCreation(Boolean allowOrgCreation) {
            this.allowOrgCreation = allowOrgCreation;
            return this;
        }
        public Boolean getAllowOrgCreation() {
            return this.allowOrgCreation;
        }

        public ModifyLangfuseUserAllowOrgCreationResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
