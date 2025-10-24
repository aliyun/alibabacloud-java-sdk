// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBucketsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeBucketsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("DisplayName")
        public String displayName;

        /**
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
         * <strong>example:</strong>
         * <p>tf-testacceu-central-1ensbucketlifecycle44222</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>5B3C1A2E053D763E1B002CC607C5A0FE1****</p>
         */
        @NameInMap("ETag")
        public String ETag;

        /**
         * <strong>example:</strong>
         * <p>con</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>2012-02-24T08:42:32.000Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Owner")
        public DescribeBucketsResponseBodyDataOssObjectListOwner owner;

        /**
         * <strong>example:</strong>
         * <p>ongoing-request=&quot;true&quot;</p>
         */
        @NameInMap("RestoreInfo")
        public String restoreInfo;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>ARCHIVE</p>
         */
        @NameInMap("StorageClass")
        public String storageClass;

        /**
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
         * <strong>example:</strong>
         * <p>zydctest</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("ExtranetEndpoint")
        public String extranetEndpoint;

        /**
         * <strong>example:</strong>
         * <p>2024-05-15 17:33:59</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
         */
        @NameInMap("IntranetEndpoint")
        public String intranetEndpoint;

        /**
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("Location")
        public String location;

        @NameInMap("OssObjectList")
        public java.util.List<DescribeBucketsResponseBodyDataOssObjectList> ossObjectList;

        /**
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
