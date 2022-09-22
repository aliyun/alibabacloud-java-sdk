// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNADBResponseBody extends TeaModel {
    @NameInMap("DBList")
    public java.util.List<ListDNADBResponseBodyDBList> DBList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDNADBResponseBody self = new ListDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDNADBResponseBody setDBList(java.util.List<ListDNADBResponseBodyDBList> DBList) {
        this.DBList = DBList;
        return this;
    }
    public java.util.List<ListDNADBResponseBodyDBList> getDBList() {
        return this.DBList;
    }

    public ListDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDNADBResponseBodyDBList extends TeaModel {
        @NameInMap("DBId")
        public String DBId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Model")
        public Integer model;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static ListDNADBResponseBodyDBList build(java.util.Map<String, ?> map) throws Exception {
            ListDNADBResponseBodyDBList self = new ListDNADBResponseBodyDBList();
            return TeaModel.build(map, self);
        }

        public ListDNADBResponseBodyDBList setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public ListDNADBResponseBodyDBList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDNADBResponseBodyDBList setModel(Integer model) {
            this.model = model;
            return this;
        }
        public Integer getModel() {
            return this.model;
        }

        public ListDNADBResponseBodyDBList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDNADBResponseBodyDBList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
