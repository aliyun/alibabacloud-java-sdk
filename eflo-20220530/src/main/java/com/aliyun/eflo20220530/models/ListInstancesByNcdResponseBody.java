// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListInstancesByNcdResponseBody extends TeaModel {
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
    public ListInstancesByNcdResponseBodyContent content;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>You don\&quot;t have the permission of this operation, action=eflo:ListInstancesByNcd, arn=acs:eflo:cn-heyuan:1263399219805497:networkinterface/*, resourceGroup=null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancesByNcdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesByNcdResponseBody self = new ListInstancesByNcdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesByNcdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListInstancesByNcdResponseBody setContent(ListInstancesByNcdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListInstancesByNcdResponseBodyContent getContent() {
        return this.content;
    }

    public ListInstancesByNcdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesByNcdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancesByNcdResponseBodyContentInstanceInfos extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1235****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>network communication distance</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Ncd")
        public Integer ncd;

        public static ListInstancesByNcdResponseBodyContentInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesByNcdResponseBodyContentInstanceInfos self = new ListInstancesByNcdResponseBodyContentInstanceInfos();
            return TeaModel.build(map, self);
        }

        public ListInstancesByNcdResponseBodyContentInstanceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesByNcdResponseBodyContentInstanceInfos setNcd(Integer ncd) {
            this.ncd = ncd;
            return this;
        }
        public Integer getNcd() {
            return this.ncd;
        }

    }

    public static class ListInstancesByNcdResponseBodyContent extends TeaModel {
        /**
         * <p>A collection of instances whose network communication distance from the source instance ID does not exceed maxNcd</p>
         */
        @NameInMap("InstanceInfos")
        public java.util.List<ListInstancesByNcdResponseBodyContentInstanceInfos> instanceInfos;

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
         * <p>Maximum communication distance between nodes</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxNcd")
        public Integer maxNcd;

        /**
         * <p>The ID of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1234****</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        public static ListInstancesByNcdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesByNcdResponseBodyContent self = new ListInstancesByNcdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListInstancesByNcdResponseBodyContent setInstanceInfos(java.util.List<ListInstancesByNcdResponseBodyContentInstanceInfos> instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }
        public java.util.List<ListInstancesByNcdResponseBodyContentInstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        public ListInstancesByNcdResponseBodyContent setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesByNcdResponseBodyContent setMaxNcd(Integer maxNcd) {
            this.maxNcd = maxNcd;
            return this;
        }
        public Integer getMaxNcd() {
            return this.maxNcd;
        }

        public ListInstancesByNcdResponseBodyContent setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

}
