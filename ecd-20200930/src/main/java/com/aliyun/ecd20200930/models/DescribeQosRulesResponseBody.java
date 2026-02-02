// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeQosRulesResponseBody extends TeaModel {
    @NameInMap("QosRules")
    public java.util.List<DescribeQosRulesResponseBodyQosRules> qosRules;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DesktopCount")
        public String desktopCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Download")
        public String download;

        /**
         * <strong>example:</strong>
         * <p>np-5cjh3sqs1ty3s02xq</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <strong>example:</strong>
         * <p>qos-chvkz5ekzgcb6bo0f</p>
         */
        @NameInMap("QosRuleId")
        public String qosRuleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("QosRuleName")
        public String qosRuleName;

        /**
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
