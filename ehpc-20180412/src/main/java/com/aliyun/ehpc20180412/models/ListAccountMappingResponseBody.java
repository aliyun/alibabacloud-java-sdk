// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAccountMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserMappings")
    public java.util.List<ListAccountMappingResponseBodyUserMappings> userMappings;

    public static ListAccountMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccountMappingResponseBody self = new ListAccountMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccountMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccountMappingResponseBody setUserMappings(java.util.List<ListAccountMappingResponseBodyUserMappings> userMappings) {
        this.userMappings = userMappings;
        return this;
    }
    public java.util.List<ListAccountMappingResponseBodyUserMappings> getUserMappings() {
        return this.userMappings;
    }

    public static class ListAccountMappingResponseBodyUserMappings extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AccountName")
        public String accountName;

        public static ListAccountMappingResponseBodyUserMappings build(java.util.Map<String, ?> map) throws Exception {
            ListAccountMappingResponseBodyUserMappings self = new ListAccountMappingResponseBodyUserMappings();
            return TeaModel.build(map, self);
        }

        public ListAccountMappingResponseBodyUserMappings setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAccountMappingResponseBodyUserMappings setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListAccountMappingResponseBodyUserMappings setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
