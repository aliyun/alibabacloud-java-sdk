// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetContentJobIdShrinkRequest extends TeaModel {
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
    public String tenantContextShrink;

    public static GetSheetContentJobIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSheetContentJobIdShrinkRequest self = new GetSheetContentJobIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetSheetContentJobIdShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetSheetContentJobIdShrinkRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public GetSheetContentJobIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
