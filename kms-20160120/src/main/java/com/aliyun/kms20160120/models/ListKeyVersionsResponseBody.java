// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsResponseBody extends TeaModel {
    @NameInMap("KeyVersions")
    public ListKeyVersionsResponseBodyKeyVersions keyVersions;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static ListKeyVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeyVersionsResponseBody self = new ListKeyVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeyVersionsResponseBody setKeyVersions(ListKeyVersionsResponseBodyKeyVersions keyVersions) {
        this.keyVersions = keyVersions;
        return this;
    }
    public ListKeyVersionsResponseBodyKeyVersions getKeyVersions() {
        return this.keyVersions;
    }

    public ListKeyVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListKeyVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKeyVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeyVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class ListKeyVersionsResponseBodyKeyVersionsKeyVersion extends TeaModel {
        @NameInMap("KeyVersionId")
        public String keyVersionId;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("CreationDate")
        public String creationDate;

        public static ListKeyVersionsResponseBodyKeyVersionsKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListKeyVersionsResponseBodyKeyVersionsKeyVersion self = new ListKeyVersionsResponseBodyKeyVersionsKeyVersion();
            return TeaModel.build(map, self);
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

    }

    public static class ListKeyVersionsResponseBodyKeyVersions extends TeaModel {
        @NameInMap("KeyVersion")
        public java.util.List<ListKeyVersionsResponseBodyKeyVersionsKeyVersion> keyVersion;

        public static ListKeyVersionsResponseBodyKeyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListKeyVersionsResponseBodyKeyVersions self = new ListKeyVersionsResponseBodyKeyVersions();
            return TeaModel.build(map, self);
        }

        public ListKeyVersionsResponseBodyKeyVersions setKeyVersion(java.util.List<ListKeyVersionsResponseBodyKeyVersionsKeyVersion> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public java.util.List<ListKeyVersionsResponseBodyKeyVersionsKeyVersion> getKeyVersion() {
            return this.keyVersion;
        }

    }

}
