// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateSheetRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantContext")
    public CreateSheetRequestTenantContext tenantContext;

    @NameInMap("WorkbookId")
    public String workbookId;

    public static CreateSheetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSheetRequest self = new CreateSheetRequest();
        return TeaModel.build(map, self);
    }

    public CreateSheetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSheetRequest setTenantContext(CreateSheetRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateSheetRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateSheetRequest setWorkbookId(String workbookId) {
        this.workbookId = workbookId;
        return this;
    }
    public String getWorkbookId() {
        return this.workbookId;
    }

    public static class CreateSheetRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateSheetRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateSheetRequestTenantContext self = new CreateSheetRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateSheetRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
