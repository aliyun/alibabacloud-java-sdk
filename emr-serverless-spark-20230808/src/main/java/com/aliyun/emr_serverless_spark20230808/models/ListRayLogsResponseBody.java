// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayLogsResponseBody extends TeaModel {
    /**
     * <p>The response status code. The value 1000000 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListRayLogsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRayLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRayLogsResponseBody self = new ListRayLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRayLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRayLogsResponseBody setData(ListRayLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRayLogsResponseBodyData getData() {
        return this.data;
    }

    public ListRayLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRayLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRayLogsResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>Indicates whether the entry is a directory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDir")
        public Boolean isDir;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>test1.txt</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/test1.txt</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>535345</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17344656363434</p>
         */
        @NameInMap("timeModified")
        public Long timeModified;

        public static ListRayLogsResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListRayLogsResponseBodyDataObjectList self = new ListRayLogsResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListRayLogsResponseBodyDataObjectList setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public ListRayLogsResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRayLogsResponseBodyDataObjectList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListRayLogsResponseBodyDataObjectList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListRayLogsResponseBodyDataObjectList setTimeModified(Long timeModified) {
            this.timeModified = timeModified;
            return this;
        }
        public Long getTimeModified() {
            return this.timeModified;
        }

    }

    public static class ListRayLogsResponseBodyData extends TeaModel {
        /**
         * <p>The OSS bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>mybucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The character used to group object names. All objects whose names contain the specified prefix and between which the delimiter character appears for the first time are grouped as a set of elements (CommonPrefixes).</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("delimiter")
        public String delimiter;

        /**
         * <p>Indicates whether the results returned in the request are truncated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isTruncated")
        public Boolean isTruncated;

        /**
         * <p>The marker after which the returned objects are listed in alphabetical order.</p>
         * 
         * <strong>example:</strong>
         * <p>test1.txt</p>
         */
        @NameInMap("marker")
        public String marker;

        /**
         * <p>The maximum number of objects to return.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxKeys")
        public Long maxKeys;

        /**
         * <p>The marker from which the next listing of files starts.</p>
         * 
         * <strong>example:</strong>
         * <p>test2.txt</p>
         */
        @NameInMap("nextMarker")
        public String nextMarker;

        /**
         * <p>The list of object metadata.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListRayLogsResponseBodyDataObjectList> objectList;

        /**
         * <p>The prefix that the keys of the returned files must start with.</p>
         * 
         * <strong>example:</strong>
         * <p>/w-xxxxxxx/ray/logs/rj-xxxxxxxxxx_default/</p>
         */
        @NameInMap("prefix")
        public String prefix;

        public static ListRayLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRayLogsResponseBodyData self = new ListRayLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRayLogsResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListRayLogsResponseBodyData setDelimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public String getDelimiter() {
            return this.delimiter;
        }

        public ListRayLogsResponseBodyData setIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }
        public Boolean getIsTruncated() {
            return this.isTruncated;
        }

        public ListRayLogsResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public ListRayLogsResponseBodyData setMaxKeys(Long maxKeys) {
            this.maxKeys = maxKeys;
            return this;
        }
        public Long getMaxKeys() {
            return this.maxKeys;
        }

        public ListRayLogsResponseBodyData setNextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }
        public String getNextMarker() {
            return this.nextMarker;
        }

        public ListRayLogsResponseBodyData setObjectList(java.util.List<ListRayLogsResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListRayLogsResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListRayLogsResponseBodyData setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

}
