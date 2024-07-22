// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAvailableEsInstanceIdsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> result;

    public static ListAvailableEsInstanceIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableEsInstanceIdsResponseBody self = new ListAvailableEsInstanceIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableEsInstanceIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableEsInstanceIdsResponseBody setResult(java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListAvailableEsInstanceIdsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListAvailableEsInstanceIdsResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceName</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The address that is used to access the Elasticsearch cluster over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200">http://es-cn-n6w1o1x0w001c****.elasticsearch.aliyuncs.com:9200</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The ID of the Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("esInstanceId")
        public String esInstanceId;

        /**
         * <p>The address that is used to access the Kibana console of the Elasticsearch cluster over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://es-cn-n6w1o1x0w001c****.kibana.elasticsearch.aliyuncs.com:5601">https://es-cn-n6w1o1x0w001c****.kibana.elasticsearch.aliyuncs.com:5601</a></p>
         */
        @NameInMap("kibanaEndpoint")
        public String kibanaEndpoint;

        public static ListAvailableEsInstanceIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableEsInstanceIdsResponseBodyResult self = new ListAvailableEsInstanceIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setEsInstanceId(String esInstanceId) {
            this.esInstanceId = esInstanceId;
            return this;
        }
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        public ListAvailableEsInstanceIdsResponseBodyResult setKibanaEndpoint(String kibanaEndpoint) {
            this.kibanaEndpoint = kibanaEndpoint;
            return this;
        }
        public String getKibanaEndpoint() {
            return this.kibanaEndpoint;
        }

    }

}
