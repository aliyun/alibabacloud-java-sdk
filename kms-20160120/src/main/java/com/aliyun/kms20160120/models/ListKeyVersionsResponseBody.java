// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsResponseBody extends TeaModel {
    @NameInMap("KeyVersions")
    public ListKeyVersionsResponseBodyKeyVersions keyVersions;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f71204c4-53cd-4eea-b405-653ba2db7e86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned key versions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListKeyVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public ListKeyVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListKeyVersionsResponseBodyKeyVersionsKeyVersion extends TeaModel {
        @NameInMap("CreationDate")
        public String creationDate;

        @NameInMap("KeyId")
        public String keyId;

        @NameInMap("KeyVersionId")
        public String keyVersionId;

        public static ListKeyVersionsResponseBodyKeyVersionsKeyVersion build(java.util.Map<String, ?> map) throws Exception {
            ListKeyVersionsResponseBodyKeyVersionsKeyVersion self = new ListKeyVersionsResponseBodyKeyVersionsKeyVersion();
            return TeaModel.build(map, self);
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public String getCreationDate() {
            return this.creationDate;
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public ListKeyVersionsResponseBodyKeyVersionsKeyVersion setKeyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }
        public String getKeyVersionId() {
            return this.keyVersionId;
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
