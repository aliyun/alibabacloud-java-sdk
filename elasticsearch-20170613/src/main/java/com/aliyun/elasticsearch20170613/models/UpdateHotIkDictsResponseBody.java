// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateHotIkDictsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<UpdateHotIkDictsResponseBodyResult> result;

    public static UpdateHotIkDictsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotIkDictsResponseBody self = new UpdateHotIkDictsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHotIkDictsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHotIkDictsResponseBody setResult(java.util.List<UpdateHotIkDictsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateHotIkDictsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateHotIkDictsResponseBodyResult extends TeaModel {
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
         * <p>The type of the dictionaries. Valid values:</p>
         * <br>
         * <p>*   MAIN: IK main dictionary</p>
         * <p>*   STOP: IK stopword list</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateHotIkDictsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateHotIkDictsResponseBodyResult self = new UpdateHotIkDictsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateHotIkDictsResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateHotIkDictsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateHotIkDictsResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateHotIkDictsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
