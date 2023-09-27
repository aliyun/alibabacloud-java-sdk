// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeSecretKeysResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecretKeys")
    public DescribeSecretKeysResponseBodySecretKeys secretKeys;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecretKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecretKeysResponseBody self = new DescribeSecretKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecretKeysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecretKeysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecretKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecretKeysResponseBody setSecretKeys(DescribeSecretKeysResponseBodySecretKeys secretKeys) {
        this.secretKeys = secretKeys;
        return this;
    }
    public DescribeSecretKeysResponseBodySecretKeys getSecretKeys() {
        return this.secretKeys;
    }

    public DescribeSecretKeysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecretKeysResponseBodySecretKeysSecretKey extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecretKey")
        public String secretKey;

        @NameInMap("SecretKeyId")
        public String secretKeyId;

        @NameInMap("SecretKeyName")
        public String secretKeyName;

        @NameInMap("SecretKeyValue")
        public String secretKeyValue;

        public static DescribeSecretKeysResponseBodySecretKeysSecretKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretKeysResponseBodySecretKeysSecretKey self = new DescribeSecretKeysResponseBodySecretKeysSecretKey();
            return TeaModel.build(map, self);
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setSecretKeyId(String secretKeyId) {
            this.secretKeyId = secretKeyId;
            return this;
        }
        public String getSecretKeyId() {
            return this.secretKeyId;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setSecretKeyName(String secretKeyName) {
            this.secretKeyName = secretKeyName;
            return this;
        }
        public String getSecretKeyName() {
            return this.secretKeyName;
        }

        public DescribeSecretKeysResponseBodySecretKeysSecretKey setSecretKeyValue(String secretKeyValue) {
            this.secretKeyValue = secretKeyValue;
            return this;
        }
        public String getSecretKeyValue() {
            return this.secretKeyValue;
        }

    }

    public static class DescribeSecretKeysResponseBodySecretKeys extends TeaModel {
        @NameInMap("SecretKey")
        public java.util.List<DescribeSecretKeysResponseBodySecretKeysSecretKey> secretKey;

        public static DescribeSecretKeysResponseBodySecretKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecretKeysResponseBodySecretKeys self = new DescribeSecretKeysResponseBodySecretKeys();
            return TeaModel.build(map, self);
        }

        public DescribeSecretKeysResponseBodySecretKeys setSecretKey(java.util.List<DescribeSecretKeysResponseBodySecretKeysSecretKey> secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public java.util.List<DescribeSecretKeysResponseBodySecretKeysSecretKey> getSecretKey() {
            return this.secretKey;
        }

    }

}
