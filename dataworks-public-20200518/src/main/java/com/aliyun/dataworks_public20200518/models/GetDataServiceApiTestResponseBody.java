// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiTestResponseBody extends TeaModel {
    /**
     * <p>Return object</p>
     */
    @NameInMap("Data")
    public GetDataServiceApiTestResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>adssdsewe</p>
     */
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
        /**
         * <p>Test API Id</p>
         * 
         * <strong>example:</strong>
         * <p>12343</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>Time consuming</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CostTime")
        public String costTime;

        /**
         * <p>Debug information</p>
         * 
         * <strong>example:</strong>
         * <p>[&lt;span style=\&quot;color: #92D581;\&quot;&gt;INFO</span>] [16:15:13.240] resource group is 498774069027041[&lt;span style=\&quot;color: #92D581;\&quot;&gt;INFO</span>]</p>
         */
        @NameInMap("DebugInfo")
        public String debugInfo;

        /**
         * <p>Node Debug information</p>
         * 
         * <strong>example:</strong>
         * <p>[&lt;span style=\&quot;color: #92D581;\&quot;&gt;INFO</span>] [16:15:13.240] resource group is 498774069027041[&lt;span style=\&quot;color: #92D581;\&quot;&gt;INFO</span>]</p>
         */
        @NameInMap("NodesDebugInfo")
        public String nodesDebugInfo;

        /**
         * <p>Test API request parameters</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("ParamMap")
        public String paramMap;

        /**
         * <p>The test API returns the code. If it is not completed, the data is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetCode")
        public Long retCode;

        /**
         * <p>Return data</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:2}</p>
         */
        @NameInMap("RetResult")
        public String retResult;

        /**
         * <p>Whether the task has been completed, including: RUNNING,FINISHED</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
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
