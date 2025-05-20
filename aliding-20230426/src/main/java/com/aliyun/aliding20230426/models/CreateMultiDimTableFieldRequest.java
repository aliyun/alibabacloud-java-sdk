// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateMultiDimTableFieldRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r1R7q3QmWew5lo02fxB7noNyJxxxxxx</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Property")
    public java.util.Map<String, ?> property;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public CreateMultiDimTableFieldRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMultiDimTableFieldRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiDimTableFieldRequest self = new CreateMultiDimTableFieldRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiDimTableFieldRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public CreateMultiDimTableFieldRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMultiDimTableFieldRequest setProperty(java.util.Map<String, ?> property) {
        this.property = property;
        return this;
    }
    public java.util.Map<String, ?> getProperty() {
        return this.property;
    }

    public CreateMultiDimTableFieldRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public CreateMultiDimTableFieldRequest setTenantContext(CreateMultiDimTableFieldRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateMultiDimTableFieldRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateMultiDimTableFieldRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMultiDimTableFieldRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateMultiDimTableFieldRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateMultiDimTableFieldRequestTenantContext self = new CreateMultiDimTableFieldRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateMultiDimTableFieldRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
