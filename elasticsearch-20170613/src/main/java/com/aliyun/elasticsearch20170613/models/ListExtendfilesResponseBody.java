// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListExtendfilesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListExtendfilesResponseBodyResult> result;

    public static ListExtendfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExtendfilesResponseBody self = new ListExtendfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExtendfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExtendfilesResponseBody setResult(java.util.List<ListExtendfilesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListExtendfilesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListExtendfilesResponseBodyResult extends TeaModel {
        @NameInMap("filePath")
        public String filePath;

        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

        public static ListExtendfilesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListExtendfilesResponseBodyResult self = new ListExtendfilesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListExtendfilesResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListExtendfilesResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListExtendfilesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListExtendfilesResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
