// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictInformationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7C4334EA-D22B-48BD-AE28-08EE68******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public ListDictInformationResponseBodyResult result;

    public static ListDictInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDictInformationResponseBody self = new ListDictInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDictInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDictInformationResponseBody setResult(ListDictInformationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDictInformationResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDictInformationResponseBodyResultOssObject extends TeaModel {
        /**
         * <p>The name of the OSS bucket where the file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>es-osstest*</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The MD5 checksum (ETag) of the OSS file, in uppercase.</p>
         * 
         * <strong>example:</strong>
         * <p>2ABAB5E70BBF631145647F6BE533****</p>
         */
        @NameInMap("etag")
        public String etag;

        /**
         * <p>The storage path of the dictionary file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss/dict_0*.dic</p>
         */
        @NameInMap("key")
        public String key;

        public static ListDictInformationResponseBodyResultOssObject build(java.util.Map<String, ?> map) throws Exception {
            ListDictInformationResponseBodyResultOssObject self = new ListDictInformationResponseBodyResultOssObject();
            return TeaModel.build(map, self);
        }

        public ListDictInformationResponseBodyResultOssObject setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListDictInformationResponseBodyResultOssObject setEtag(String etag) {
            this.etag = etag;
            return this;
        }
        public String getEtag() {
            return this.etag;
        }

        public ListDictInformationResponseBodyResultOssObject setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class ListDictInformationResponseBodyResult extends TeaModel {
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2202301</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The details of the OSS file.</p>
         */
        @NameInMap("ossObject")
        public ListDictInformationResponseBodyResultOssObject ossObject;

        /**
         * <p>The dictionary type. Valid values:</p>
         * <ul>
         * <li><p>MAIN: primary tokenization dictionary</p>
         * </li>
         * <li><p>STOP: stopword dictionary.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDictInformationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDictInformationResponseBodyResult self = new ListDictInformationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDictInformationResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListDictInformationResponseBodyResult setOssObject(ListDictInformationResponseBodyResultOssObject ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public ListDictInformationResponseBodyResultOssObject getOssObject() {
            return this.ossObject;
        }

        public ListDictInformationResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
