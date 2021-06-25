// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListOauthAccessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListOauthAccessResponseItems> items;

    public static ListOauthAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOauthAccessResponse self = new ListOauthAccessResponse();
        return TeaModel.build(map, self);
    }

    public ListOauthAccessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOauthAccessResponse setItems(java.util.List<ListOauthAccessResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListOauthAccessResponseItems> getItems() {
        return this.items;
    }

    public static class ListOauthAccessResponseItems extends TeaModel {
        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        public static ListOauthAccessResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListOauthAccessResponseItems self = new ListOauthAccessResponseItems();
            return TeaModel.build(map, self);
        }

        public ListOauthAccessResponseItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListOauthAccessResponseItems setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

    }

}
