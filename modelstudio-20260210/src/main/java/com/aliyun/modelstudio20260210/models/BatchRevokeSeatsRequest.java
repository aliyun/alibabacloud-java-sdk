// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class BatchRevokeSeatsRequest extends TeaModel {
    /**
     * <p>The list of revocation items. This parameter is required.</p>
     */
    @NameInMap("Items")
    public java.util.List<BatchRevokeSeatsRequestItems> items;

    /**
     * <p>The language. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    public static BatchRevokeSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokeSeatsRequest self = new BatchRevokeSeatsRequest();
        return TeaModel.build(map, self);
    }

    public BatchRevokeSeatsRequest setItems(java.util.List<BatchRevokeSeatsRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BatchRevokeSeatsRequestItems> getItems() {
        return this.items;
    }

    public BatchRevokeSeatsRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public static class BatchRevokeSeatsRequestItems extends TeaModel {
        /**
         * <p>The ID of the currently associated member.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        public static BatchRevokeSeatsRequestItems build(java.util.Map<String, ?> map) throws Exception {
            BatchRevokeSeatsRequestItems self = new BatchRevokeSeatsRequestItems();
            return TeaModel.build(map, self);
        }

        public BatchRevokeSeatsRequestItems setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
