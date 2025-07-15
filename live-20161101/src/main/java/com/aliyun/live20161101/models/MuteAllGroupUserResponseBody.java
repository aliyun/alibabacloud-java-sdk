// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MuteAllGroupUserResponseBody extends TeaModel {
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
    public MuteAllGroupUserResponseBodyResult result;

    public static MuteAllGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MuteAllGroupUserResponseBody self = new MuteAllGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public MuteAllGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MuteAllGroupUserResponseBody setResult(MuteAllGroupUserResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public MuteAllGroupUserResponseBodyResult getResult() {
        return this.result;
    }

    public static class MuteAllGroupUserResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the mute was successful. Valid values:</p>
         * <ul>
         * <li>true: The mute was successful.</li>
         * <li>false: The mute failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static MuteAllGroupUserResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            MuteAllGroupUserResponseBodyResult self = new MuteAllGroupUserResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public MuteAllGroupUserResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
