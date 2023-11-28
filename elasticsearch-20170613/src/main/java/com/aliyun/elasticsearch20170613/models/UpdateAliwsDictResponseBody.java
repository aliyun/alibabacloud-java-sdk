// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateAliwsDictResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<UpdateAliwsDictResponseBodyResult> result;

    public static UpdateAliwsDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliwsDictResponseBody self = new UpdateAliwsDictResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAliwsDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAliwsDictResponseBody setResult(java.util.List<UpdateAliwsDictResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateAliwsDictResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateAliwsDictResponseBodyResult extends TeaModel {
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the uploaded dictionary file.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type of the dictionary file. Valid values:</p>
         * <br>
         * <p>*   OSS</p>
         * <p>*   ORIGIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The dictionary type. The value is fixed as ALI_WS.</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateAliwsDictResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateAliwsDictResponseBodyResult self = new UpdateAliwsDictResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateAliwsDictResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateAliwsDictResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAliwsDictResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateAliwsDictResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
