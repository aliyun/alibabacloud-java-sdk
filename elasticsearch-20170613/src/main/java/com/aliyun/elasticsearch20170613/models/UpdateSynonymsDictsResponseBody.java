// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSynonymsDictsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("name")
        public String name;

        @NameInMap("sourceType")
        public String sourceType;

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
