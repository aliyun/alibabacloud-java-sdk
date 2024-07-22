// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeSnapshotSettingResponseBody extends TeaModel {
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
        /**
         * <p>Whether to enable automatic backup.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>Automatic backup time configuration, using Quartz Cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 01 ? * * *</p>
         */
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
