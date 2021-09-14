// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateDCStorageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DCStorage")
    public CreateDCStorageResponseBodyDCStorage DCStorage;

    public static CreateDCStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDCStorageResponseBody self = new CreateDCStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDCStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDCStorageResponseBody setDCStorage(CreateDCStorageResponseBodyDCStorage DCStorage) {
        this.DCStorage = DCStorage;
        return this;
    }
    public CreateDCStorageResponseBodyDCStorage getDCStorage() {
        return this.DCStorage;
    }

    public static class CreateDCStorageResponseBodyDCStorage extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Host")
        public String host;

        @NameInMap("Name")
        public String name;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("Id")
        public Integer id;

        public static CreateDCStorageResponseBodyDCStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateDCStorageResponseBodyDCStorage self = new CreateDCStorageResponseBodyDCStorage();
            return TeaModel.build(map, self);
        }

        public CreateDCStorageResponseBodyDCStorage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDCStorageResponseBodyDCStorage setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreateDCStorageResponseBodyDCStorage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDCStorageResponseBodyDCStorage setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateDCStorageResponseBodyDCStorage setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public CreateDCStorageResponseBodyDCStorage setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
