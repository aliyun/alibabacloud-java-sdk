// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RebuildResults")
    @Validation(required = true)
    public java.util.List<RebuildDesktopsResponseRebuildResults> rebuildResults;

    public static RebuildDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        RebuildDesktopsResponse self = new RebuildDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public RebuildDesktopsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildDesktopsResponse setRebuildResults(java.util.List<RebuildDesktopsResponseRebuildResults> rebuildResults) {
        this.rebuildResults = rebuildResults;
        return this;
    }
    public java.util.List<RebuildDesktopsResponseRebuildResults> getRebuildResults() {
        return this.rebuildResults;
    }

    public static class RebuildDesktopsResponseRebuildResults extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RebuildDesktopsResponseRebuildResults build(java.util.Map<String, ?> map) throws Exception {
            RebuildDesktopsResponseRebuildResults self = new RebuildDesktopsResponseRebuildResults();
            return TeaModel.build(map, self);
        }

        public RebuildDesktopsResponseRebuildResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public RebuildDesktopsResponseRebuildResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RebuildDesktopsResponseRebuildResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
