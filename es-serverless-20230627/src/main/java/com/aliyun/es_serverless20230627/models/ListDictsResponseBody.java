// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListDictsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E92BCBB9-3CFE-58DD-8D8C-56DF46AB3BF3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListDictsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDictsResponseBody self = new ListDictsResponseBody();
        return TeaModel.build(map, self);
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

    public ListDictsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDictsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://es-serverless-****.oss-cn-hangzhou.aliyuncs.com/app/es7**190/0/config/analysis-ik/stopword.dic?Expires=1705923089&OSSAccessKeyId=STS.NV18q****UkVp6LNj&Signat">http://es-serverless-****.oss-cn-hangzhou.aliyuncs.com/app/es7**190/0/config/analysis-ik/stopword.dic?Expires=1705923089&amp;OSSAccessKeyId=STS.NV18q****UkVp6LNj&amp;Signat</a></p>
         */
        @NameInMap("downloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>a.dic</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
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
