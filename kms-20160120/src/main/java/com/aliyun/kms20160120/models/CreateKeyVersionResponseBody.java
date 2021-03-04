// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeyVersion")
    public CreateKeyVersionResponseBodyKeyVersion keyVersion;

    public static CreateKeyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionResponseBody self = new CreateKeyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateKeyVersionResponseBody setKeyVersion(CreateKeyVersionResponseBodyKeyVersion keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }
    public CreateKeyVersionResponseBodyKeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    public static class CreateKeyVersionResponseBodyKeyVersion extends TeaModel {
        @NameInMap("KeyVersionId")
        public String keyVersionId;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("CreationDate")
        public String creationDate;

        public static CreateKeyVersionResponseBodyKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyVersionResponseBodyKeyVersion self = new CreateKeyVersionResponseBodyKeyVersion();
            return TeaModel.build(map, self);
        }

        public CreateKeyVersionResponseBodyKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public CreateKeyVersionResponseBodyKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public CreateKeyVersionResponseBodyKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

    }

}
