// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteCommentResponseBodyResult result;

    public static DeleteCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentResponseBody self = new DeleteCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCommentResponseBody setResult(DeleteCommentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteCommentResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteCommentResponseBodyResult extends TeaModel {
        @NameInMap("DeleteResult")
        public Boolean deleteResult;

        public static DeleteCommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteCommentResponseBodyResult self = new DeleteCommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteCommentResponseBodyResult setDeleteResult(Boolean deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public Boolean getDeleteResult() {
            return this.deleteResult;
        }

    }

}
