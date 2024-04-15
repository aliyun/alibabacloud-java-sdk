// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebuildDesktopsResponseBody extends TeaModel {
    /**
     * <p>The recreation results.</p>
     */
    @NameInMap("RebuildResults")
    public java.util.List<RebuildDesktopsResponseBodyRebuildResults> rebuildResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebuildDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildDesktopsResponseBody self = new RebuildDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildDesktopsResponseBody setRebuildResults(java.util.List<RebuildDesktopsResponseBodyRebuildResults> rebuildResults) {
        this.rebuildResults = rebuildResults;
        return this;
    }
    public java.util.List<RebuildDesktopsResponseBodyRebuildResults> getRebuildResults() {
        return this.rebuildResults;
    }

    public RebuildDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RebuildDesktopsResponseBodyRebuildResults extends TeaModel {
        /**
         * <p>The recreation result code. If the request was successful, `success` is returned. If the request failed, an error message is returned.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The IDs of the cloud computers.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The error message. This parameter is invalid if the value of `Code` is `success`.</p>
         */
        @NameInMap("Message")
        public String message;

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

        public RebuildDesktopsResponseBodyRebuildResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public RebuildDesktopsResponseBodyRebuildResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
