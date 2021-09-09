// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Headers")
    public ListPipelineResponseBodyHeaders headers;

    @NameInMap("Result")
    public java.util.List<ListPipelineResponseBodyResult> result;

    public static ListPipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineResponseBody self = new ListPipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineResponseBody setHeaders(ListPipelineResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListPipelineResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListPipelineResponseBody setResult(java.util.List<ListPipelineResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPipelineResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListPipelineResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListPipelineResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineResponseBodyHeaders self = new ListPipelineResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListPipelineResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListPipelineResponseBodyResult extends TeaModel {
        @NameInMap("pipelineId")
        public String pipelineId;

        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        @NameInMap("pipelineStatus")
        public String pipelineStatus;

        public static ListPipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineResponseBodyResult self = new ListPipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPipelineResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelineResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public ListPipelineResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public ListPipelineResponseBodyResult setPipelineStatus(String pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

    }

}
