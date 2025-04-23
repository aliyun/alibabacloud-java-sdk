// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class InitTenantAliasResponseBody extends TeaModel {
    @NameInMap("AliasInfo")
    public InitTenantAliasResponseBodyAliasInfo aliasInfo;

    /**
     * <strong>example:</strong>
     * <p>WY23***</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitTenantAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitTenantAliasResponseBody self = new InitTenantAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public InitTenantAliasResponseBody setAliasInfo(InitTenantAliasResponseBodyAliasInfo aliasInfo) {
        this.aliasInfo = aliasInfo;
        return this;
    }
    public InitTenantAliasResponseBodyAliasInfo getAliasInfo() {
        return this.aliasInfo;
    }

    public InitTenantAliasResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InitTenantAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitTenantAliasResponseBodyAliasInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FrequencyExceedsLimit</p>
         */
        @NameInMap("AliasEditDisabledReason")
        public String aliasEditDisabledReason;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("AliasEditable")
        public Boolean aliasEditable;

        /**
         * <strong>example:</strong>
         * <p>Customized</p>
         */
        @NameInMap("AliasSourceType")
        public String aliasSourceType;

        /**
         * <strong>example:</strong>
         * <p>2025-04-17 20:31:48</p>
         */
        @NameInMap("NextModifyTime")
        public String nextModifyTime;

        public static InitTenantAliasResponseBodyAliasInfo build(java.util.Map<String, ?> map) throws Exception {
            InitTenantAliasResponseBodyAliasInfo self = new InitTenantAliasResponseBodyAliasInfo();
            return TeaModel.build(map, self);
        }

        public InitTenantAliasResponseBodyAliasInfo setAliasEditDisabledReason(String aliasEditDisabledReason) {
            this.aliasEditDisabledReason = aliasEditDisabledReason;
            return this;
        }
        public String getAliasEditDisabledReason() {
            return this.aliasEditDisabledReason;
        }

        public InitTenantAliasResponseBodyAliasInfo setAliasEditable(Boolean aliasEditable) {
            this.aliasEditable = aliasEditable;
            return this;
        }
        public Boolean getAliasEditable() {
            return this.aliasEditable;
        }

        public InitTenantAliasResponseBodyAliasInfo setAliasSourceType(String aliasSourceType) {
            this.aliasSourceType = aliasSourceType;
            return this;
        }
        public String getAliasSourceType() {
            return this.aliasSourceType;
        }

        public InitTenantAliasResponseBodyAliasInfo setNextModifyTime(String nextModifyTime) {
            this.nextModifyTime = nextModifyTime;
            return this;
        }
        public String getNextModifyTime() {
            return this.nextModifyTime;
        }

    }

}
