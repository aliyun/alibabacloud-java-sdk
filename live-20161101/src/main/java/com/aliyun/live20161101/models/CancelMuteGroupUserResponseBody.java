// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteGroupUserResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("Result")
    public CancelMuteGroupUserResponseBodyResult result;

    public static CancelMuteGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelMuteGroupUserResponseBody self = new CancelMuteGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelMuteGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelMuteGroupUserResponseBody setResult(CancelMuteGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CancelMuteGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class CancelMuteGroupUserResponseBodyResult extends TeaModel {
        /**
         * <p>Whether unmuting is successful, values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Unsuccessful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CancelMuteGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CancelMuteGroupUserResponseBodyResult self = new CancelMuteGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CancelMuteGroupUserResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
