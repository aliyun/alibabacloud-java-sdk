// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateDNADBResponseBody extends TeaModel {
    @NameInMap("DBInfo")
    public CreateDNADBResponseBodyDBInfo DBInfo;

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
        @NameInMap("DBId")
        public String DBId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Model")
        public String model;

        @NameInMap("Name")
        public String name;

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
