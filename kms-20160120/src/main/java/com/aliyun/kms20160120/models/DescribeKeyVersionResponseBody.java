// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponseBody extends TeaModel {
    /**
     * <p>The metadata of the CMK version.</p>
     */
    @NameInMap("KeyVersion")
    public DescribeKeyVersionResponseBodyKeyVersion keyVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKeyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionResponseBody self = new DescribeKeyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyVersionResponseBody setKeyVersion(DescribeKeyVersionResponseBodyKeyVersion keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }
    public DescribeKeyVersionResponseBodyKeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    public DescribeKeyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeKeyVersionResponseBodyKeyVersion extends TeaModel {
        /**
         * <p>The date and time when the CMK version was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-03-25T10:42:40Z</p>
         */
        @NameInMap("CreationDate")
        public String creationDate;

        /**
         * <p>The globally unique ID of the CMK.</p>
         * <blockquote>
         * <p> If you set the KeyId parameter in the request to an alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The globally unique ID of the CMK version.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        @NameInMap("KeyVersionId")
        public String keyVersionId;

        public static DescribeKeyVersionResponseBodyKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyVersionResponseBodyKeyVersion self = new DescribeKeyVersionResponseBodyKeyVersion();
            return TeaModel.build(map, self);
        }

        public DescribeKeyVersionResponseBodyKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public DescribeKeyVersionResponseBodyKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeKeyVersionResponseBodyKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

    }

}
