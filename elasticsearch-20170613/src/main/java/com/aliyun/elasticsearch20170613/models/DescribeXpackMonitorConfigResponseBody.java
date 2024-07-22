// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeXpackMonitorConfigResponseBody extends TeaModel {
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
    public DescribeXpackMonitorConfigResponseBodyResult result;

    public static DescribeXpackMonitorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeXpackMonitorConfigResponseBody self = new DescribeXpackMonitorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeXpackMonitorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeXpackMonitorConfigResponseBody setResult(DescribeXpackMonitorConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeXpackMonitorConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeXpackMonitorConfigResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the X-Pack Monitoring feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: enabled</li>
         * <li>false: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("endpoints")
        public java.util.List<String> endpoints;

        /**
         * <p>The ID of the associated Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        @NameInMap("esInstanceId")
        public String esInstanceId;

        @NameInMap("pipelineIds")
        public java.util.List<String> pipelineIds;

        /**
         * <p>The username that is used to access the associated Elasticsearch cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("userName")
        public String userName;

        public static DescribeXpackMonitorConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeXpackMonitorConfigResponseBodyResult self = new DescribeXpackMonitorConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeXpackMonitorConfigResponseBodyResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeXpackMonitorConfigResponseBodyResult setEndpoints(java.util.List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<String> getEndpoints() {
            return this.endpoints;
        }

        public DescribeXpackMonitorConfigResponseBodyResult setEsInstanceId(String esInstanceId) {
            this.esInstanceId = esInstanceId;
            return this;
        }
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        public DescribeXpackMonitorConfigResponseBodyResult setPipelineIds(java.util.List<String> pipelineIds) {
            this.pipelineIds = pipelineIds;
            return this;
        }
        public java.util.List<String> getPipelineIds() {
            return this.pipelineIds;
        }

        public DescribeXpackMonitorConfigResponseBodyResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
