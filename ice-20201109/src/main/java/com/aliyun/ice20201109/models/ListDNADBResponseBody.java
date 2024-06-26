// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDNADBResponseBody extends TeaModel {
    @NameInMap("DBList")
    public java.util.List<ListDNADBResponseBodyDBList> DBList;

    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("DBId")
        public String DBId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Video</p>
         */
        @NameInMap("Model")
        public Integer model;

        /**
         * <strong>example:</strong>
         * <p>example-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
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
