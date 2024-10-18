// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultiDimTableRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101114</p>
     */
    @NameInMap("BaseId")
    public String baseId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("SheetIdOrName")
    public String sheetIdOrName;

    @NameInMap("TenantContext")
    public GetMultiDimTableRecordRequestTenantContext tenantContext;

    public static GetMultiDimTableRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiDimTableRecordRequest self = new GetMultiDimTableRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiDimTableRecordRequest setBaseId(String baseId) {
        this.baseId = baseId;
        return this;
    }
    public String getBaseId() {
        return this.baseId;
    }

    public GetMultiDimTableRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public GetMultiDimTableRecordRequest setSheetIdOrName(String sheetIdOrName) {
        this.sheetIdOrName = sheetIdOrName;
        return this;
    }
    public String getSheetIdOrName() {
        return this.sheetIdOrName;
    }

    public GetMultiDimTableRecordRequest setTenantContext(GetMultiDimTableRecordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetMultiDimTableRecordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetMultiDimTableRecordRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetMultiDimTableRecordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetMultiDimTableRecordRequestTenantContext self = new GetMultiDimTableRecordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetMultiDimTableRecordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
