// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MuteGroupUserResponseBody extends TeaModel {
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
    public MuteGroupUserResponseBodyResult result;

    public static MuteGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MuteGroupUserResponseBody self = new MuteGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public MuteGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MuteGroupUserResponseBody setResult(MuteGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MuteGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class MuteGroupUserResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the mute is successful. Valid values:</p>
         * <ul>
         * <li>true: The mute is successful.</li>
         * <li>false: The mute failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static MuteGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MuteGroupUserResponseBodyResult self = new MuteGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MuteGroupUserResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
