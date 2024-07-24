// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetSnapshotSettingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B6CE6E1-5BA0-56DA-BFFD-8D90692F1EFC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetSnapshotSettingResponseBodyResult result;

    public static GetSnapshotSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotSettingResponseBody self = new GetSnapshotSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSnapshotSettingResponseBody setResult(GetSnapshotSettingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSnapshotSettingResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetSnapshotSettingResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>0 0 01 ? * * *</p>
         */
        @NameInMap("quartzRegex")
        public String quartzRegex;

        public static GetSnapshotSettingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotSettingResponseBodyResult self = new GetSnapshotSettingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSnapshotSettingResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetSnapshotSettingResponseBodyResult setQuartzRegex(String quartzRegex) {
            this.quartzRegex = quartzRegex;
            return this;
        }
        public String getQuartzRegex() {
            return this.quartzRegex;
        }

    }

}
