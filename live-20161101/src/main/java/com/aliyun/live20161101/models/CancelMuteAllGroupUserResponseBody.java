// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteAllGroupUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
    public CancelMuteAllGroupUserResponseBodyResult result;

    public static CancelMuteAllGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteAllGroupUserResponseBody self = new CancelMuteAllGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMuteAllGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelMuteAllGroupUserResponseBody setResult(CancelMuteAllGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CancelMuteAllGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class CancelMuteAllGroupUserResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the cancellation was successful, with values:</p>
         * <ul>
         * <li>true: Success. </li>
         * <li>false: Not successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CancelMuteAllGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CancelMuteAllGroupUserResponseBodyResult self = new CancelMuteAllGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CancelMuteAllGroupUserResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
