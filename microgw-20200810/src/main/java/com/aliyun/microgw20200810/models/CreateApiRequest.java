// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateApiRequest extends TeaModel {
    // ApiCreateDTO
    @NameInMap("data")
    public CreateApiRequestData data;

    public static CreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiRequest self = new CreateApiRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiRequest setData(CreateApiRequestData data) {
        this.data = data;
        return this;
    }
    public CreateApiRequestData getData() {
        return this.data;
    }

    public static class CreateApiRequestData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedServices
        @NameInMap("attachedServices")
        public java.util.List<Long> attachedServices;

        // basePath
        @NameInMap("basePath")
        public String basePath;

        // description
        @NameInMap("description")
        public String description;

        // name
        @NameInMap("name")
        public String name;

        // status
        @NameInMap("status")
        public Long status;

        public static CreateApiRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateApiRequestData self = new CreateApiRequestData();
            return TeaModel.build(map, self);
        }

        public CreateApiRequestData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public CreateApiRequestData setAttachedServices(java.util.List<Long> attachedServices) {
            this.attachedServices = attachedServices;
            return this;
        }
        public java.util.List<Long> getAttachedServices() {
            return this.attachedServices;
        }

        public CreateApiRequestData setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public CreateApiRequestData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApiRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApiRequestData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
