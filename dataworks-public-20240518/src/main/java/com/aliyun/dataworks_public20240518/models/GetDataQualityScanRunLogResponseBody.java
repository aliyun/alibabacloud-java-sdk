// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityScanRunLogResponseBody extends TeaModel {
    @NameInMap("LogSegment")
    public GetDataQualityScanRunLogResponseBodyLogSegment logSegment;

    /**
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDataQualityScanRunLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityScanRunLogResponseBody self = new GetDataQualityScanRunLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataQualityScanRunLogResponseBody setLogSegment(GetDataQualityScanRunLogResponseBodyLogSegment logSegment) {
        this.logSegment = logSegment;
        return this;
    }
    public GetDataQualityScanRunLogResponseBodyLogSegment getLogSegment() {
        return this.logSegment;
    }

    public GetDataQualityScanRunLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataQualityScanRunLogResponseBodyLogSegment extends TeaModel {
        @NameInMap("Log")
        public String log;

        /**
         * <strong>example:</strong>
         * <p>512000</p>
         */
        @NameInMap("NextOffset")
        public Long nextOffset;

        public static GetDataQualityScanRunLogResponseBodyLogSegment build(java.util.Map<String, ?> map) throws Exception {
            GetDataQualityScanRunLogResponseBodyLogSegment self = new GetDataQualityScanRunLogResponseBodyLogSegment();
            return TeaModel.build(map, self);
        }

        public GetDataQualityScanRunLogResponseBodyLogSegment setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public GetDataQualityScanRunLogResponseBodyLogSegment setNextOffset(Long nextOffset) {
            this.nextOffset = nextOffset;
            return this;
        }
        public Long getNextOffset() {
            return this.nextOffset;
        }

    }

}
