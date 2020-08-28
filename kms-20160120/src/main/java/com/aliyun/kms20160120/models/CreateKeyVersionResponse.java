// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("KeyVersion")
    @Validation(required = true)
    public CreateKeyVersionResponseKeyVersion keyVersion;

    public static CreateKeyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKeyVersionResponse self = new CreateKeyVersionResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateKeyVersionResponseKeyVersion extends TeaModel {
        @NameInMap("KeyId")
        @Validation(required = true)
        public String keyId;

        @NameInMap("KeyVersionId")
        @Validation(required = true)
        public String keyVersionId;

        @NameInMap("CreationDate")
        @Validation(required = true)
        public String creationDate;

        public static CreateKeyVersionResponseKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            CreateKeyVersionResponseKeyVersion self = new CreateKeyVersionResponseKeyVersion();
            return TeaModel.build(map, self);
        }

    }

}
