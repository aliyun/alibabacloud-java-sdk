// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserIdRequest extends TeaModel {
    /**
     * <p>The ID of the resource directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The identifier information about the user that is synchronized from an external identity provider (IdP).</p>
     */
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
        /**
         * <p>The identifier of the user that is synchronized from an external IdP.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The method for external identity synchronization. Only System for Cross-domain Identity Management (SCIM) synchronization is supported.</p>
         */
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
