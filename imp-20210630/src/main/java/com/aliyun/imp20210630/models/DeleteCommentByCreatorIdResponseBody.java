// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentByCreatorIdResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用删除直播间弹幕的返回结果。
    @NameInMap("Result")
    public DeleteCommentByCreatorIdResponseBodyResult result;

    public static DeleteCommentByCreatorIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentByCreatorIdResponseBody self = new DeleteCommentByCreatorIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCommentByCreatorIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCommentByCreatorIdResponseBody setResult(DeleteCommentByCreatorIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteCommentByCreatorIdResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteCommentByCreatorIdResponseBodyResult extends TeaModel {
        // 删除的结果
        @NameInMap("DeleteResult")
        public Boolean deleteResult;

        public static DeleteCommentByCreatorIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteCommentByCreatorIdResponseBodyResult self = new DeleteCommentByCreatorIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteCommentByCreatorIdResponseBodyResult setDeleteResult(Boolean deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public Boolean getDeleteResult() {
            return this.deleteResult;
        }

    }

}
