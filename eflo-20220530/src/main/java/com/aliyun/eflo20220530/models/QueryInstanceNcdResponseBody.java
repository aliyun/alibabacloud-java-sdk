// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class QueryInstanceNcdResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public QueryInstanceNcdResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission of this operation, action=eflo:QueryInstanceNcd, arn=acs:eflo:cn-shenzhen:1263399219805497:networkinterface/*, resourceGroup=null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryInstanceNcdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceNcdResponseBody self = new QueryInstanceNcdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceNcdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryInstanceNcdResponseBody setContent(QueryInstanceNcdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public QueryInstanceNcdResponseBodyContent getContent() {
        return this.content;
    }

    public QueryInstanceNcdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceNcdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryInstanceNcdResponseBodyContent extends TeaModel {
        /**
         * <p>Instance 1ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1235****</p>
         */
        @NameInMap("InstanceId1")
        public String instanceId1;

        /**
         * <p>Instance 2ID</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1234****</p>
         */
        @NameInMap("InstanceId2")
        public String instanceId2;

        /**
         * <p>Instance Type</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>node: Lingjun node.</li>
         * <li>lni: lingjun network interface controller.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lni</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>network communication distance between instances</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Ncd")
        public Integer ncd;

        public static QueryInstanceNcdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceNcdResponseBodyContent self = new QueryInstanceNcdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryInstanceNcdResponseBodyContent setInstanceId1(String instanceId1) {
            this.instanceId1 = instanceId1;
            return this;
        }
        public String getInstanceId1() {
            return this.instanceId1;
        }

        public QueryInstanceNcdResponseBodyContent setInstanceId2(String instanceId2) {
            this.instanceId2 = instanceId2;
            return this;
        }
        public String getInstanceId2() {
            return this.instanceId2;
        }

        public QueryInstanceNcdResponseBodyContent setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public QueryInstanceNcdResponseBodyContent setNcd(Integer ncd) {
            this.ncd = ncd;
            return this;
        }
        public Integer getNcd() {
            return this.ncd;
        }

    }

}
