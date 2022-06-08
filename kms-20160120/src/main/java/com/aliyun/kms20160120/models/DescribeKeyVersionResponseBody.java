// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeKeyVersionResponseBody extends TeaModel {
    @NameInMap("KeyVersion")
    public DescribeKeyVersionResponseBodyKeyVersion keyVersion;

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
        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("KeyId")
        public String keyId;

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
