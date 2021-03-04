// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("KeyVersion")
    public DescribeKeyVersionResponseBodyKeyVersion keyVersion;

    public static DescribeKeyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyVersionResponseBody self = new DescribeKeyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyVersionResponseBody setKeyVersion(DescribeKeyVersionResponseBodyKeyVersion keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }
    public DescribeKeyVersionResponseBodyKeyVersion getKeyVersion() {
        return this.keyVersion;
    }

    public static class DescribeKeyVersionResponseBodyKeyVersion extends TeaModel {
        @NameInMap("KeyVersionId")
        public String keyVersionId;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("CreationDate")
        public String creationDate;

        public static DescribeKeyVersionResponseBodyKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyVersionResponseBodyKeyVersion self = new DescribeKeyVersionResponseBodyKeyVersion();
            return TeaModel.build(map, self);
        }

        public DescribeKeyVersionResponseBodyKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public DescribeKeyVersionResponseBodyKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public DescribeKeyVersionResponseBodyKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

    }

}
