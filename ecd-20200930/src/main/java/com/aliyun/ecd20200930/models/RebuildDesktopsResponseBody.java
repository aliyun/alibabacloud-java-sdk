// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RebuildResults")
    public java.util.List<RebuildDesktopsResponseBodyRebuildResults> rebuildResults;

    public static RebuildDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildDesktopsResponseBody self = new RebuildDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildDesktopsResponseBody setRebuildResults(java.util.List<RebuildDesktopsResponseBodyRebuildResults> rebuildResults) {
        this.rebuildResults = rebuildResults;
        return this;
    }
    public java.util.List<RebuildDesktopsResponseBodyRebuildResults> getRebuildResults() {
        return this.rebuildResults;
    }

    public static class RebuildDesktopsResponseBodyRebuildResults extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("DesktopId")
        public String desktopId;

        public static RebuildDesktopsResponseBodyRebuildResults build(java.util.Map<String, ?> map) throws Exception {
            RebuildDesktopsResponseBodyRebuildResults self = new RebuildDesktopsResponseBodyRebuildResults();
            return TeaModel.build(map, self);
        }

        public RebuildDesktopsResponseBodyRebuildResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RebuildDesktopsResponseBodyRebuildResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RebuildDesktopsResponseBodyRebuildResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

    }

}
