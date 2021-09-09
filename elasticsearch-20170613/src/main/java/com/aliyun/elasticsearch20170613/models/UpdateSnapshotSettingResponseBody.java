// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateSnapshotSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("quartzRegex")
        public String quartzRegex;

        @NameInMap("enable")
        public Boolean enable;

        public static UpdateSnapshotSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSnapshotSettingResponseBodyResult self = new UpdateSnapshotSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSnapshotSettingResponseBodyResult setQuartzRegex(String quartzRegex) {
            this.quartzRegex = quartzRegex;
            return this;
        }
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

        public UpdateSnapshotSettingResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
