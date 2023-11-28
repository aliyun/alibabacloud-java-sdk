// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<UpdateSynonymsDictsResponseBodyResult> result;

    public static UpdateSynonymsDictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSynonymsDictsResponseBody self = new UpdateSynonymsDictsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSynonymsDictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSynonymsDictsResponseBody setResult(java.util.List<UpdateSynonymsDictsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateSynonymsDictsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateSynonymsDictsResponseBodyResult extends TeaModel {
        /**
         * <p>The size of the dictionary file. Unit: bytes.</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The name of the dictionary file.</p>
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
         * <p>The dictionary type. The value is fixed as SYNONYMS.</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateSynonymsDictsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSynonymsDictsResponseBodyResult self = new UpdateSynonymsDictsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSynonymsDictsResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateSynonymsDictsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSynonymsDictsResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateSynonymsDictsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
