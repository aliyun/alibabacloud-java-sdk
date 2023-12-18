// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListObjectsResponseBody extends TeaModel {
    /**
     * <p>The name of the bucket.</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The container for all object names between Prefix and the next occurrence of the string specified by a delimiter. A response can contain CommonPrefixes only if you specify a delimiter.</p>
     */
    @NameInMap("CommonPrefixes")
    public java.util.List<String> commonPrefixes;

    /**
     * <p>The list of object metadata.</p>
     */
    @NameInMap("Contents")
    public java.util.List<ListObjectsResponseBodyContents> contents;

    /**
     * <p>The token used in this list operation.</p>
     */
    @NameInMap("ContinuationToken")
    public String continuationToken;

    /**
     * <p>The character used to group objects by name.</p>
     */
    @NameInMap("Delimiter")
    public String delimiter;

    /**
     * <p>The encoding type of the object names in the response.</p>
     */
    @NameInMap("EncodingType")
    public String encodingType;

    /**
     * <p>Indicates whether the listed objects are truncated. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of objects returned for this request.</p>
     */
    @NameInMap("KeyCount")
    public Long keyCount;

    /**
     * <p>The position from which the list operation starts.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The maximum number of objects returned.</p>
     */
    @NameInMap("MaxKeys")
    public Long maxKeys;

    /**
     * <p>The token used in the next list operation.</p>
     */
    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    /**
     * <p>The position from which the next list operation starts.</p>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <p>The prefix contained in the names of returned objects.</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsResponseBody self = new ListObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectsResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListObjectsResponseBody setCommonPrefixes(java.util.List<String> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }
    public java.util.List<String> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public ListObjectsResponseBody setContents(java.util.List<ListObjectsResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ListObjectsResponseBodyContents> getContents() {
        return this.contents;
    }

    public ListObjectsResponseBody setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsResponseBody setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListObjectsResponseBody setKeyCount(Long keyCount) {
        this.keyCount = keyCount;
        return this;
    }
    public Long getKeyCount() {
        return this.keyCount;
    }

    public ListObjectsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListObjectsResponseBody setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsResponseBody setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public ListObjectsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListObjectsResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListObjectsResponseBodyContents extends TeaModel {
        /**
         * <p>The entity tag (ETag). When an object is created, an ETag is created to identify the content of the object.</p>
         * <br>
         * <p>*   For an object that is created by calling the PutObject operation, the ETag value of the object is the MD5 hash of the object content.</p>
         * <p>*   If an object is created by using other methods, the ETag value of the object is the UUID of the object content.</p>
         * <p>*   The ETag of an object can be used to check whether the object content is modified. However, we recommend that you use the MD5 hash of an object rather than the ETag value of the object to verify data integrity.</p>
         */
        @NameInMap("ETag")
        public String ETag;

        /**
         * <p>The name of the object.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time when the object was last modified.</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The size of the returned object. Unit: bytes.</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListObjectsResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            ListObjectsResponseBodyContents self = new ListObjectsResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public ListObjectsResponseBodyContents setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public ListObjectsResponseBodyContents setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListObjectsResponseBodyContents setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListObjectsResponseBodyContents setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
