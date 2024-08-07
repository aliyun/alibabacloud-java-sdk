// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribePipelineManagementConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DescribePipelineManagementConfigResponseBodyResult result;

    public static DescribePipelineManagementConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineManagementConfigResponseBody self = new DescribePipelineManagementConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePipelineManagementConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineManagementConfigResponseBody setResult(DescribePipelineManagementConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePipelineManagementConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePipelineManagementConfigResponseBodyResult extends TeaModel {
        /**
         * <p>The access addresses of the Elasticsearch cluster. Specify each address in the <code>http://Endpoint of the Elasticsearch cluster:Port number</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<a href="http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200%22%5D">http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200&quot;]</a></p>
         */
        @NameInMap("endpoints")
        public String endpoints;

        /**
         * <p>The ID of the Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("esInstanceId")
        public String esInstanceId;

        @NameInMap("pipelineIds")
        public java.util.List<String> pipelineIds;

        /**
         * <p>The pipeline management method. Valid values: Kibana and MULTIPLE_PIPELINE.</p>
         * 
         * <strong>example:</strong>
         * <p>MULTIPLE_PIPELINE</p>
         */
        @NameInMap("pipelineManagementType")
        public String pipelineManagementType;

        /**
         * <p>The username that is used to access the Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("userName")
        public String userName;

        public static DescribePipelineManagementConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineManagementConfigResponseBodyResult self = new DescribePipelineManagementConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePipelineManagementConfigResponseBodyResult setEndpoints(String endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public String getEndpoints() {
            return this.endpoints;
        }

        public DescribePipelineManagementConfigResponseBodyResult setEsInstanceId(String esInstanceId) {
            this.esInstanceId = esInstanceId;
            return this;
        }
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        public DescribePipelineManagementConfigResponseBodyResult setPipelineIds(java.util.List<String> pipelineIds) {
            this.pipelineIds = pipelineIds;
            return this;
        }
        public java.util.List<String> getPipelineIds() {
            return this.pipelineIds;
        }

        public DescribePipelineManagementConfigResponseBodyResult setPipelineManagementType(String pipelineManagementType) {
            this.pipelineManagementType = pipelineManagementType;
            return this;
        }
        public String getPipelineManagementType() {
            return this.pipelineManagementType;
        }

        public DescribePipelineManagementConfigResponseBodyResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
