// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserIdRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("ExternalId")
    public GetUserIdRequestExternalId externalId;

    public static GetUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdRequest self = new GetUserIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserIdRequest setExternalId(GetUserIdRequestExternalId externalId) {
        this.externalId = externalId;
        return this;
    }
    public GetUserIdRequestExternalId getExternalId() {
        return this.externalId;
    }

    public static class GetUserIdRequestExternalId extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Issuer")
        public String issuer;

        public static GetUserIdRequestExternalId build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdRequestExternalId self = new GetUserIdRequestExternalId();
            return TeaModel.build(map, self);
        }

        public GetUserIdRequestExternalId setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserIdRequestExternalId setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

}
