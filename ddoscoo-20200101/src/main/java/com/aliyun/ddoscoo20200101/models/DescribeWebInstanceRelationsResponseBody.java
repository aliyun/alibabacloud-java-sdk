// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebInstanceRelationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0222382B-5FE5-4FF7-BC9B-97EE31D58818</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the instances to which a website service is added.</p>
     */
    @NameInMap("WebInstanceRelations")
    public java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelations> webInstanceRelations;

    public static DescribeWebInstanceRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebInstanceRelationsResponseBody self = new DescribeWebInstanceRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebInstanceRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebInstanceRelationsResponseBody setWebInstanceRelations(java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelations> webInstanceRelations) {
        this.webInstanceRelations = webInstanceRelations;
        return this;
    }
    public java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelations> getWebInstanceRelations() {
        return this.webInstanceRelations;
    }

    public static class DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails extends TeaModel {
        /**
         * <p>The IP addresses of the instance.</p>
         */
        @NameInMap("EipList")
        public java.util.List<String> eipList;

        /**
         * <p>The function plan of the instance. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Standard function plan</li>
         * <li><strong>enhance</strong>: Enhanced function plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enhance</p>
         */
        @NameInMap("FunctionVersion")
        public String functionVersion;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-0pp163pd****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails self = new DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails();
            return TeaModel.build(map, self);
        }

        public DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails setEipList(java.util.List<String> eipList) {
            this.eipList = eipList;
            return this;
        }
        public java.util.List<String> getEipList() {
            return this.eipList;
        }

        public DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails setFunctionVersion(String functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        public DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeWebInstanceRelationsResponseBodyWebInstanceRelations extends TeaModel {
        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The information about the instance to which a website service is added.</p>
         */
        @NameInMap("InstanceDetails")
        public java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails> instanceDetails;

        public static DescribeWebInstanceRelationsResponseBodyWebInstanceRelations build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebInstanceRelationsResponseBodyWebInstanceRelations self = new DescribeWebInstanceRelationsResponseBodyWebInstanceRelations();
            return TeaModel.build(map, self);
        }

        public DescribeWebInstanceRelationsResponseBodyWebInstanceRelations setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebInstanceRelationsResponseBodyWebInstanceRelations setInstanceDetails(java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            return this;
        }
        public java.util.List<DescribeWebInstanceRelationsResponseBodyWebInstanceRelationsInstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

    }

}
