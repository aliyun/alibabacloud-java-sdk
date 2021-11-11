// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListDictsResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("downloadUrl")
        public String downloadUrl;

        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

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
