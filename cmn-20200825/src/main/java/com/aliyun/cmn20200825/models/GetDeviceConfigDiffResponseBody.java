// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceConfigDiffResponseBody extends TeaModel {
    @NameInMap("DeviceConfigDiff")
    public GetDeviceConfigDiffResponseBodyDeviceConfigDiff deviceConfigDiff;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceConfigDiffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigDiffResponseBody self = new GetDeviceConfigDiffResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigDiffResponseBody setDeviceConfigDiff(GetDeviceConfigDiffResponseBodyDeviceConfigDiff deviceConfigDiff) {
        this.deviceConfigDiff = deviceConfigDiff;
        return this;
    }
    public GetDeviceConfigDiffResponseBodyDeviceConfigDiff getDeviceConfigDiff() {
        return this.deviceConfigDiff;
    }

    public GetDeviceConfigDiffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceConfigDiffResponseBodyDeviceConfigDiff extends TeaModel {
        // 差异提取
        @NameInMap("ExtractDiff")
        public String extractDiff;

        // 全量比对
        @NameInMap("TotalDiff")
        public String totalDiff;

        public static GetDeviceConfigDiffResponseBodyDeviceConfigDiff build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceConfigDiffResponseBodyDeviceConfigDiff self = new GetDeviceConfigDiffResponseBodyDeviceConfigDiff();
            return TeaModel.build(map, self);
        }

        public GetDeviceConfigDiffResponseBodyDeviceConfigDiff setExtractDiff(String extractDiff) {
            this.extractDiff = extractDiff;
            return this;
        }
        public String getExtractDiff() {
            return this.extractDiff;
        }

        public GetDeviceConfigDiffResponseBodyDeviceConfigDiff setTotalDiff(String totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public String getTotalDiff() {
            return this.totalDiff;
        }

    }

}
