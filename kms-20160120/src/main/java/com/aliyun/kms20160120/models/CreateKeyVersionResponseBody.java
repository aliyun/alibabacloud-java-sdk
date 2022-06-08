// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponseBody extends TeaModel {
    @NameInMap("KeyVersion")
    public CreateKeyVersionResponseBodyKeyVersion keyVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateKeyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionResponseBody self = new CreateKeyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKeyVersionResponseBody setKeyVersion(CreateKeyVersionResponseBodyKeyVersion keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }
    public CreateKeyVersionResponseBodyKeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    public CreateKeyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateKeyVersionResponseBodyKeyVersion extends TeaModel {
        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("KeyVersionId")
        public String keyVersionId;

        public static CreateKeyVersionResponseBodyKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyVersionResponseBodyKeyVersion self = new CreateKeyVersionResponseBodyKeyVersion();
            return TeaModel.build(map, self);
        }

        public CreateKeyVersionResponseBodyKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public CreateKeyVersionResponseBodyKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public CreateKeyVersionResponseBodyKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

    }

}
