// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of key versions.</p>
     */
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
     * <p>The ID of the request.</p>
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
         * <p> If you set the KeyId parameter to the alias of the CMK, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
         */
        @NameInMap("KeyId")
        public String keyId;

        /**
         * <p>The globally unique ID of the CMK version.</p>
         * 
         * <strong>example:</strong>
         * <p>1e3304fd-68ac-4d5b-8886-ae5f01a1****</p>
         */
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
