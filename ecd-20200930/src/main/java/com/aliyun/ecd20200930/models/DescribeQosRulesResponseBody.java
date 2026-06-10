// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeQosRulesResponseBody extends TeaModel {
    /**
     * <p>A list of QoS rules.</p>
     */
    @NameInMap("QosRules")
    public java.util.List<DescribeQosRulesResponseBodyQosRules> qosRules;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQosRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosRulesResponseBody self = new DescribeQosRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQosRulesResponseBody setQosRules(java.util.List<DescribeQosRulesResponseBodyQosRules> qosRules) {
        this.qosRules = qosRules;
        return this;
    }
    public java.util.List<DescribeQosRulesResponseBodyQosRules> getQosRules() {
        return this.qosRules;
    }

    public DescribeQosRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQosRulesResponseBodyQosRules extends TeaModel {
        /**
         * <p>The number of associated cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DesktopCount")
        public String desktopCount;

        @NameInMap("DesktopGroupCount")
        public Integer desktopGroupCount;

        /**
         * <p>The download bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Download")
        public String download;

        /**
         * <p>The network package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np-5cjh3sqs1ty3s02xq</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <p>The QoS rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-chvkz5ekzgcb6bo0f</p>
         */
        @NameInMap("QosRuleId")
        public String qosRuleId;

        /**
         * <p>The QoS rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosRuleName")
        public String qosRuleName;

        /**
         * <p>The upload bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Upload")
        public String upload;

        public static DescribeQosRulesResponseBodyQosRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeQosRulesResponseBodyQosRules self = new DescribeQosRulesResponseBodyQosRules();
            return TeaModel.build(map, self);
        }

        public DescribeQosRulesResponseBodyQosRules setDesktopCount(String desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public String getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeQosRulesResponseBodyQosRules setDesktopGroupCount(Integer desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Integer getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribeQosRulesResponseBodyQosRules setDownload(String download) {
            this.download = download;
            return this;
        }
        public String getDownload() {
            return this.download;
        }

        public DescribeQosRulesResponseBodyQosRules setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeQosRulesResponseBodyQosRules setQosRuleId(String qosRuleId) {
            this.qosRuleId = qosRuleId;
            return this;
        }
        public String getQosRuleId() {
            return this.qosRuleId;
        }

        public DescribeQosRulesResponseBodyQosRules setQosRuleName(String qosRuleName) {
            this.qosRuleName = qosRuleName;
            return this;
        }
        public String getQosRuleName() {
            return this.qosRuleName;
        }

        public DescribeQosRulesResponseBodyQosRules setUpload(String upload) {
            this.upload = upload;
            return this;
        }
        public String getUpload() {
            return this.upload;
        }

    }

}
