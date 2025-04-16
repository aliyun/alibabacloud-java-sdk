// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListPermissionsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListPermissionsHeadersAccountContext accountContext;

    public static ListPermissionsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsHeaders self = new ListPermissionsHeaders();
        return TeaModel.build(map, self);
    }

    public ListPermissionsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListPermissionsHeaders setAccountContext(ListPermissionsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListPermissionsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListPermissionsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListPermissionsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListPermissionsHeadersAccountContext self = new ListPermissionsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListPermissionsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
