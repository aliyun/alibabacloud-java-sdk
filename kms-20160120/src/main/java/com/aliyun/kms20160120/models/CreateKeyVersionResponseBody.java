// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateKeyVersionResponseBody extends TeaModel {
    /**
     * <p>The metadata of the version.</p>
     */
    @NameInMap("KeyVersion")
    public CreateKeyVersionResponseBodyKeyVersion keyVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>b96f250a-4b75-498c-91be-22c6928f85be</p>
     */
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
        /**
         * <p>The date and time when the version was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-08-02T10:38:27Z</p>
         */
        @NameInMap("CreationDate")
        public String creationDate;

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>c0a3d5dc-0b47-4199-a050-b289349a****</p>
         */
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
