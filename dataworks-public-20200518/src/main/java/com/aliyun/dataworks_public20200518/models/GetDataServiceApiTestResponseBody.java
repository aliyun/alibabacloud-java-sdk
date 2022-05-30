// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiTestResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDataServiceApiTestResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDataServiceApiTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiTestResponseBody self = new GetDataServiceApiTestResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiTestResponseBody setData(GetDataServiceApiTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiTestResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDataServiceApiTestResponseBodyData extends TeaModel {
        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("CostTime")
        public String costTime;

        @NameInMap("DebugInfo")
        public String debugInfo;

        @NameInMap("NodesDebugInfo")
        public String nodesDebugInfo;

        @NameInMap("ParamMap")
        public String paramMap;

        @NameInMap("RetCode")
        public Long retCode;

        @NameInMap("RetResult")
        public String retResult;

        @NameInMap("Status")
        public String status;

        public static GetDataServiceApiTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiTestResponseBodyData self = new GetDataServiceApiTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiTestResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetDataServiceApiTestResponseBodyData setCostTime(String costTime) {
            this.costTime = costTime;
            return this;
        }
        public String getCostTime() {
            return this.costTime;
        }

        public GetDataServiceApiTestResponseBodyData setDebugInfo(String debugInfo) {
            this.debugInfo = debugInfo;
            return this;
        }
        public String getDebugInfo() {
            return this.debugInfo;
        }

        public GetDataServiceApiTestResponseBodyData setNodesDebugInfo(String nodesDebugInfo) {
            this.nodesDebugInfo = nodesDebugInfo;
            return this;
        }
        public String getNodesDebugInfo() {
            return this.nodesDebugInfo;
        }

        public GetDataServiceApiTestResponseBodyData setParamMap(String paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public String getParamMap() {
            return this.paramMap;
        }

        public GetDataServiceApiTestResponseBodyData setRetCode(Long retCode) {
            this.retCode = retCode;
            return this;
        }
        public Long getRetCode() {
            return this.retCode;
        }

        public GetDataServiceApiTestResponseBodyData setRetResult(String retResult) {
            this.retResult = retResult;
            return this;
        }
        public String getRetResult() {
            return this.retResult;
        }

        public GetDataServiceApiTestResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
