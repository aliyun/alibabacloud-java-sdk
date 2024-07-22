// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public UpdateSnapshotSettingResponseBodyResult result;

    public static UpdateSnapshotSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSnapshotSettingResponseBody self = new UpdateSnapshotSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSnapshotSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSnapshotSettingResponseBody setResult(UpdateSnapshotSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateSnapshotSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateSnapshotSettingResponseBodyResult extends TeaModel {
        /**
         * <p>Specifies whether to enable automatic backup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The start time of automatic backup.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 01 ? * * *</p>
         */
        @NameInMap("quartzRegex")
        public String quartzRegex;

        public static UpdateSnapshotSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSnapshotSettingResponseBodyResult self = new UpdateSnapshotSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSnapshotSettingResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateSnapshotSettingResponseBodyResult setQuartzRegex(String quartzRegex) {
            this.quartzRegex = quartzRegex;
            return this;
        }
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

    }

}
