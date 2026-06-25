// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBucketsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * <blockquote>
     * <p>This parameter is returned only when the call fails.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result object.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeBucketsResponseBodyData> data;

    /**
     * <p>The return status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBucketsResponseBody self = new DescribeBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBucketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBucketsResponseBody setData(java.util.List<DescribeBucketsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBucketsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBucketsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBucketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBucketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBucketsResponseBodyDataOssObjectListOwner extends TeaModel {
        /**
         * <p>The name of the bucket owner.</p>
         * 
         * <strong>example:</strong>
         * <p>佳钰</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The unique identifier of the bucket owner.</p>
         * 
         * <strong>example:</strong>
         * <p>395</p>
         */
        @NameInMap("Id")
        public String id;

        public static DescribeBucketsResponseBodyDataOssObjectListOwner build(java.util.Map<String, ?> map) throws Exception {
            DescribeBucketsResponseBodyDataOssObjectListOwner self = new DescribeBucketsResponseBodyDataOssObjectListOwner();
            return TeaModel.build(map, self);
        }

        public DescribeBucketsResponseBodyDataOssObjectListOwner setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeBucketsResponseBodyDataOssObjectListOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeBucketsResponseBodyDataOssObjectList extends TeaModel {
        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testacceu-central-1ensbucketlifecycle44222</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The Entity Tag (ETag) is created when an object is generated. It is used to identify the content of an object.</p>
         * <ul>
         * <li><p>For an object created by a PutObject request, the ETag value is the MD5 hash of the object content.</p>
         * </li>
         * <li><p>For an object created by other methods, the ETag value is a unique value generated based on specific calculation rules. It is not the MD5 hash of the object content.</p>
         * </li>
         * <li><p>The ETag value can be used to check if the object content has changed. Do not use the ETag value as the MD5 hash to verify the data integrity of the object.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5B3C1A2E053D763E1B002CC607C5A0FE1****</p>
         */
        @NameInMap("ETag")
        public String ETag;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>con</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time when the object was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2012-02-24T08:42:32.000Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The information about the bucket owner.</p>
         */
        @NameInMap("Owner")
        public DescribeBucketsResponseBodyDataOssObjectListOwner owner;

        /**
         * <p>The information about database recovery if the database type is MSSQL. The value is a JSON string that contains the following parameters:</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the database.</p>
         * </li>
         * <li><p><strong>files</strong>: The path of the database file.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ongoing-request=&quot;true&quot;</p>
         */
        @NameInMap("RestoreInfo")
        public String restoreInfo;

        /**
         * <p>The size of the file. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The storage class of the bucket. Valid values:</p>
         * <ul>
         * <li><p>Standard (default): Standard</p>
         * </li>
         * <li><p>IA: Infrequent Access</p>
         * </li>
         * <li><p>Archive: Archive Storage</p>
         * </li>
         * <li><p>ColdArchive: Cold Archive</p>
         * </li>
         * <li><p>DeepColdArchive: Deep Cold Archive</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ARCHIVE</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
         * <p>The type of the trigger method.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeBucketsResponseBodyDataOssObjectList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBucketsResponseBodyDataOssObjectList self = new DescribeBucketsResponseBodyDataOssObjectList();
            return TeaModel.build(map, self);
        }

        public DescribeBucketsResponseBodyDataOssObjectList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setOwner(DescribeBucketsResponseBodyDataOssObjectListOwner owner) {
            this.owner = owner;
            return this;
        }
        public DescribeBucketsResponseBodyDataOssObjectListOwner getOwner() {
            return this.owner;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setRestoreInfo(String restoreInfo) {
            this.restoreInfo = restoreInfo;
            return this;
        }
        public String getRestoreInfo() {
            return this.restoreInfo;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeBucketsResponseBodyDataOssObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeBucketsResponseBodyData extends TeaModel {
        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>zydctest</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The public endpoint that is used to access the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("ExtranetEndpoint")
        public String extranetEndpoint;

        /**
         * <p>The time when the bucket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The internal endpoint that is used by a same-region ECS instance to access the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>The storage path, such as a path in Hadoop Distributed File System (HDFS) or OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The information about the objects in the bucket.</p>
         */
        @NameInMap("OssObjectList")
        public java.util.List<DescribeBucketsResponseBodyDataOssObjectList> ossObjectList;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeBucketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBucketsResponseBodyData self = new DescribeBucketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBucketsResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeBucketsResponseBodyData setExtranetEndpoint(String extranetEndpoint) {
            this.extranetEndpoint = extranetEndpoint;
            return this;
        }
        public String getExtranetEndpoint() {
            return this.extranetEndpoint;
        }

        public DescribeBucketsResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeBucketsResponseBodyData setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeBucketsResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeBucketsResponseBodyData setOssObjectList(java.util.List<DescribeBucketsResponseBodyDataOssObjectList> ossObjectList) {
            this.ossObjectList = ossObjectList;
            return this;
        }
        public java.util.List<DescribeBucketsResponseBodyDataOssObjectList> getOssObjectList() {
            return this.ossObjectList;
        }

        public DescribeBucketsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
