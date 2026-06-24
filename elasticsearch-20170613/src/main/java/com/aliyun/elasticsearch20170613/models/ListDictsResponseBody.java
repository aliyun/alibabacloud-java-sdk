// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     */
    @NameInMap("Headers")
    public ListDictsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2937F832-F39E-41EF-89BA-B528342A2A3A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListDictsResponseBodyResult> result;

    public static ListDictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDictsResponseBody self = new ListDictsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDictsResponseBody setHeaders(ListDictsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListDictsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListDictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDictsResponseBody setResult(java.util.List<ListDictsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDictsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDictsResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListDictsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListDictsResponseBodyHeaders self = new ListDictsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListDictsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListDictsResponseBodyResult extends TeaModel {
        /**
         * <p>The publicly accessible download URL. The URL is valid for 90 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test_bucket.oss-cn-hangzhou.aliyuncs.com/AliyunEs/test.dic?Expires=162573****&OSSAccessKeyId=LTAI*****V9&Signature=PNPO********BBGsJDO4V3VfU4sE%3D">http://test_bucket.oss-cn-hangzhou.aliyuncs.com/AliyunEs/test.dic?Expires=162573****&amp;OSSAccessKeyId=LTAI*****V9&amp;Signature=PNPO********BBGsJDO4V3VfU4sE%3D</a></p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <p>The size of the dictionary file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2782602</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The file name of the dictionary file.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_MAIN.dic</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>A fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The type of the IK dictionary. Valid values:</p>
         * <ul>
         * <li><p>MAIN: main tokenization dictionary.</p>
         * </li>
         * <li><p>STOP: stopword dictionary.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("type")
        public String type;

        public static ListDictsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDictsResponseBodyResult self = new ListDictsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDictsResponseBodyResult setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListDictsResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListDictsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDictsResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListDictsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
