// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeSnapshotSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSnapshotSettingResponseBodyResult result;

    public static DescribeSnapshotSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotSettingResponseBody self = new DescribeSnapshotSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotSettingResponseBody setResult(DescribeSnapshotSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSnapshotSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSnapshotSettingResponseBodyResult extends TeaModel {
        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("QuartzRegex")
        public String quartzRegex;

        public static DescribeSnapshotSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotSettingResponseBodyResult self = new DescribeSnapshotSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotSettingResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeSnapshotSettingResponseBodyResult setQuartzRegex(String quartzRegex) {
            this.quartzRegex = quartzRegex;
            return this;
        }
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

    }

}
