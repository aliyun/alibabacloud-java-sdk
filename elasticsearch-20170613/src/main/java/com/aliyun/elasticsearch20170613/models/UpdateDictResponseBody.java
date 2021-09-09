// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<UpdateDictResponseBodyResult> result;

    public static UpdateDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDictResponseBody self = new UpdateDictResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDictResponseBody setResult(java.util.List<UpdateDictResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<UpdateDictResponseBodyResult> getResult() {
        return this.result;
    }

    public static class UpdateDictResponseBodyResult extends TeaModel {
        @NameInMap("fileSize")
        public Long fileSize;

        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        public static UpdateDictResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateDictResponseBodyResult self = new UpdateDictResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateDictResponseBodyResult setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public UpdateDictResponseBodyResult setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateDictResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDictResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
