// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CancelMuteGroupUserResponseBody extends TeaModel {
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
         * <p>Indicates whether the members are unmuted. Valid values:</p>
         * <ul>
         * <li>true: The members are unmuted.</li>
         * <li>false: The members failed to be unmuted.</li>
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
