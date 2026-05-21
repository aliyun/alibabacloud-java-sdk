// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetLastUpgradeRecordResponseBody extends TeaModel {
    @NameInMap("data")
    public GetLastUpgradeRecordResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetLastUpgradeRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLastUpgradeRecordResponseBody self = new GetLastUpgradeRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLastUpgradeRecordResponseBody setData(GetLastUpgradeRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLastUpgradeRecordResponseBodyData getData() {
        return this.data;
    }

    public GetLastUpgradeRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLastUpgradeRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>r3.2.11</p>
         */
        @NameInMap("fromVersion")
        public String fromVersion;

        /**
         * <strong>example:</strong>
         * <p>2025-09-24 17:29:57</p>
         */
        @NameInMap("startReadonlyTime")
        public String startReadonlyTime;

        /**
         * <strong>example:</strong>
         * <p>2025-09-24 18:23:22</p>
         */
        @NameInMap("stopReadonlyTime")
        public String stopReadonlyTime;

        /**
         * <strong>example:</strong>
         * <p>r4.0.2</p>
         */
        @NameInMap("toVersion")
        public String toVersion;

        public static GetLastUpgradeRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLastUpgradeRecordResponseBodyData self = new GetLastUpgradeRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLastUpgradeRecordResponseBodyData setFromVersion(String fromVersion) {
            this.fromVersion = fromVersion;
            return this;
        }
        public String getFromVersion() {
            return this.fromVersion;
        }

        public GetLastUpgradeRecordResponseBodyData setStartReadonlyTime(String startReadonlyTime) {
            this.startReadonlyTime = startReadonlyTime;
            return this;
        }
        public String getStartReadonlyTime() {
            return this.startReadonlyTime;
        }

        public GetLastUpgradeRecordResponseBodyData setStopReadonlyTime(String stopReadonlyTime) {
            this.stopReadonlyTime = stopReadonlyTime;
            return this;
        }
        public String getStopReadonlyTime() {
            return this.stopReadonlyTime;
        }

        public GetLastUpgradeRecordResponseBodyData setToVersion(String toVersion) {
            this.toVersion = toVersion;
            return this;
        }
        public String getToVersion() {
            return this.toVersion;
        }

    }

}
