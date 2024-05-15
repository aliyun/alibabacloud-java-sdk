// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDriveSpacesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountContext")
    public ListDriveSpacesHeadersAccountContext accountContext;

    public static ListDriveSpacesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListDriveSpacesHeaders self = new ListDriveSpacesHeaders();
        return TeaModel.build(map, self);
    }

    public ListDriveSpacesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListDriveSpacesHeaders setAccountContext(ListDriveSpacesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListDriveSpacesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListDriveSpacesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListDriveSpacesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListDriveSpacesHeadersAccountContext self = new ListDriveSpacesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListDriveSpacesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
