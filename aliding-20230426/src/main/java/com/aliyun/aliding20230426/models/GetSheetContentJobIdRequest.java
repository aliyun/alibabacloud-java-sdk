// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetContentJobIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MNDoBb60VLYDGNPytQe7Gzp4JlemrZQ3</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <strong>example:</strong>
     * <p>dingTalksheetToxlsx</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("TenantContext")
    public GetSheetContentJobIdRequestTenantContext tenantContext;

    public static GetSheetContentJobIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSheetContentJobIdRequest self = new GetSheetContentJobIdRequest();
        return TeaModel.build(map, self);
    }

    public GetSheetContentJobIdRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetSheetContentJobIdRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public GetSheetContentJobIdRequest setTenantContext(GetSheetContentJobIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetSheetContentJobIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetSheetContentJobIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetSheetContentJobIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetSheetContentJobIdRequestTenantContext self = new GetSheetContentJobIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetSheetContentJobIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
