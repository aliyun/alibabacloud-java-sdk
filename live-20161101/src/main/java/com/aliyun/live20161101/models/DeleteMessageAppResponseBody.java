// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMessageAppResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DeleteMessageAppResponseBodyResult result;

    public static DeleteMessageAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageAppResponseBody self = new DeleteMessageAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMessageAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMessageAppResponseBody setResult(DeleteMessageAppResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteMessageAppResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteMessageAppResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the application was deleted. Valid values:</p>
         * <ul>
         * <li>true: The application was deleted.</li>
         * <li>false: The application failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteMessageAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMessageAppResponseBodyResult self = new DeleteMessageAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteMessageAppResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
