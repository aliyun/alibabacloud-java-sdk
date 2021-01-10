// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListPreChecksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PreChecks")
    public java.util.List<ListPreChecksResponseBodyPreChecks> preChecks;

    public static ListPreChecksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPreChecksResponseBody self = new ListPreChecksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPreChecksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPreChecksResponseBody setPreChecks(java.util.List<ListPreChecksResponseBodyPreChecks> preChecks) {
        this.preChecks = preChecks;
        return this;
    }
    public java.util.List<ListPreChecksResponseBodyPreChecks> getPreChecks() {
        return this.preChecks;
    }

    public static class ListPreChecksResponseBodyPreChecks extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Link")
        public String link;

        @NameInMap("Price")
        public String price;

        @NameInMap("State")
        public String state;

        public static ListPreChecksResponseBodyPreChecks build(java.util.Map<String, ?> map) throws Exception {
            ListPreChecksResponseBodyPreChecks self = new ListPreChecksResponseBodyPreChecks();
            return TeaModel.build(map, self);
        }

        public ListPreChecksResponseBodyPreChecks setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPreChecksResponseBodyPreChecks setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public ListPreChecksResponseBodyPreChecks setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListPreChecksResponseBodyPreChecks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
