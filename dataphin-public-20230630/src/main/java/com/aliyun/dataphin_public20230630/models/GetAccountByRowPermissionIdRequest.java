// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAccountByRowPermissionIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetAccountByRowPermissionIdQuery")
    public GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetAccountByRowPermissionIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountByRowPermissionIdRequest self = new GetAccountByRowPermissionIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountByRowPermissionIdRequest setGetAccountByRowPermissionIdQuery(GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery) {
        this.getAccountByRowPermissionIdQuery = getAccountByRowPermissionIdQuery;
        return this;
    }
    public GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery getGetAccountByRowPermissionIdQuery() {
        return this.getAccountByRowPermissionIdQuery;
    }

    public GetAccountByRowPermissionIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>300001234</p>
         */
        @NameInMap("RowPermissionId")
        public Long rowPermissionId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<Long> ruleIds;

        public static GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery build(java.util.Map<String, ?> map) throws Exception {
            GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery self = new GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery();
            return TeaModel.build(map, self);
        }

        public GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery setRowPermissionId(Long rowPermissionId) {
            this.rowPermissionId = rowPermissionId;
            return this;
        }
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        public GetAccountByRowPermissionIdRequestGetAccountByRowPermissionIdQuery setRuleIds(java.util.List<Long> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<Long> getRuleIds() {
            return this.ruleIds;
        }

    }

}
