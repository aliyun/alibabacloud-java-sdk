// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListSubAccountInfoResult extends TeaModel {
    @NameInMap("subAccountInfos")
    public java.util.List<ListSubAccountInfoResultSubAccountInfos> subAccountInfos;

    public static ListSubAccountInfoResult build(java.util.Map<String, ?> map) throws Exception {
        ListSubAccountInfoResult self = new ListSubAccountInfoResult();
        return TeaModel.build(map, self);
    }

    public ListSubAccountInfoResult setSubAccountInfos(java.util.List<ListSubAccountInfoResultSubAccountInfos> subAccountInfos) {
        this.subAccountInfos = subAccountInfos;
        return this;
    }
    public java.util.List<ListSubAccountInfoResultSubAccountInfos> getSubAccountInfos() {
        return this.subAccountInfos;
    }

    public static class ListSubAccountInfoResultSubAccountInfos extends TeaModel {
        @NameInMap("accountName")
        public String accountName;

        public static ListSubAccountInfoResultSubAccountInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSubAccountInfoResultSubAccountInfos self = new ListSubAccountInfoResultSubAccountInfos();
            return TeaModel.build(map, self);
        }

        public ListSubAccountInfoResultSubAccountInfos setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
