// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateDNADBResponseBody extends TeaModel {
    @NameInMap("DBInfo")
    public CreateDNADBResponseBodyDBInfo DBInfo;

    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDNADBResponseBody self = new CreateDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDNADBResponseBody setDBInfo(CreateDNADBResponseBodyDBInfo DBInfo) {
        this.DBInfo = DBInfo;
        return this;
    }
    public CreateDNADBResponseBodyDBInfo getDBInfo() {
        return this.DBInfo;
    }

    public CreateDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDNADBResponseBodyDBInfo extends TeaModel {
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
        public String model;

        /**
         * <strong>example:</strong>
         * <p>example name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>offline</p>
         */
        @NameInMap("Status")
        public String status;

        public static CreateDNADBResponseBodyDBInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDNADBResponseBodyDBInfo self = new CreateDNADBResponseBodyDBInfo();
            return TeaModel.build(map, self);
        }

        public CreateDNADBResponseBodyDBInfo setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public CreateDNADBResponseBodyDBInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateDNADBResponseBodyDBInfo setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateDNADBResponseBodyDBInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDNADBResponseBodyDBInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
