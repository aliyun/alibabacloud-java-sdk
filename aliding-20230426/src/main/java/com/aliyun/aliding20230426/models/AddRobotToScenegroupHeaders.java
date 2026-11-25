// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRobotToScenegroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddRobotToScenegroupHeadersAccountContext accountContext;

    public static AddRobotToScenegroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddRobotToScenegroupHeaders self = new AddRobotToScenegroupHeaders();
        return TeaModel.build(map, self);
    }

    public AddRobotToScenegroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddRobotToScenegroupHeaders setAccountContext(AddRobotToScenegroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddRobotToScenegroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddRobotToScenegroupHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddRobotToScenegroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddRobotToScenegroupHeadersAccountContext self = new AddRobotToScenegroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddRobotToScenegroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
