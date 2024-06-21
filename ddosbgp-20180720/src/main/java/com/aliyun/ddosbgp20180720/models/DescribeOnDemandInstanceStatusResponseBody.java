// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The details of the on-demand instance.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> instances;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC49FF51-612F-429B-AB1E-374B3F115396</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOnDemandInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceStatusResponseBody self = new DescribeOnDemandInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceStatusResponseBody setInstances(java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeOnDemandInstanceStatusResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeOnDemandInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOnDemandInstanceStatusResponseBodyInstances extends TeaModel {
        /**
         * <p>The details of route advertisement for data centers outside the Chinese mainland. This parameter is a JSON string. The following fields are included in the value:</p>
         * <ul>
         * <li><strong>region</strong>: The code of the data center outside the Chinese mainland. The value is of the STRING type. For more information, see <strong>Codes of data centers outside the Chinese mainland</strong>.</li>
         * <li><strong>declared</strong>: indicates whether the data center advertised the route. The value is of the STRING type. Valid values: <strong>0</strong> and <strong>1</strong>. The value of 0 indicates that the data center did not advertise the route. The value of 1 indicates that the data center advertised the route.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;region\&quot;:\&quot;oe24\&quot;,\&quot;declared\&quot;:0},{\&quot;region\&quot;:\&quot;oe26\&quot;,\&quot;declared\&quot;:0},{\&quot;region\&quot;:\&quot;oe28\&quot;,\&quot;declared\&quot;:0},{\&quot;region\&quot;:\&quot;oi39\&quot;,\&quot;declared\&quot;:0},{\&quot;region\&quot;:\&quot;us50\&quot;,\&quot;declared\&quot;:0},{\&quot;region\&quot;:\&quot;jp141\&quot;,\&quot;declared\&quot;:0}]</p>
         */
        @NameInMap("Declared")
        public String declared;

        /**
         * <p>The description of the on-demand instance.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only when the information about multiple on-demand instances is returned. The value of this parameter is not returned because the information about only one on-demand instance is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The ID of the on-demand instance.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only when the information about multiple on-demand instances is returned. The value of this parameter is not returned because the information about only one on-demand instance is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The mode used to start the on-demand instance. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong>: The instance is manually started.</li>
         * <li><strong>netflow-auto</strong>: The instance is automatically started by using NetFlow that monitors network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>netflow-auto</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The CIDR block of the on-demand instance.</p>
         * 
         * <strong>example:</strong>
         * <p>47.<em><strong>.</strong></em>.0/24</p>
         */
        @NameInMap("Net")
        public String net;

        /**
         * <p>The number of the autonomous system (AS). Set the value to <strong>0</strong>, which indicates that AS is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RegistedAs")
        public String registedAs;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>171986973287****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeOnDemandInstanceStatusResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandInstanceStatusResponseBodyInstances self = new DescribeOnDemandInstanceStatusResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setDeclared(String declared) {
            this.declared = declared;
            return this;
        }
        public String getDeclared() {
            return this.declared;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setNet(String net) {
            this.net = net;
            return this;
        }
        public String getNet() {
            return this.net;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setRegistedAs(String registedAs) {
            this.registedAs = registedAs;
            return this;
        }
        public String getRegistedAs() {
            return this.registedAs;
        }

        public DescribeOnDemandInstanceStatusResponseBodyInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
