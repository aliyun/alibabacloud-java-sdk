// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeNodePoolVulsResponseBody extends TeaModel {
    /**
     * <p>The node pool vulnerabilities.</p>
     */
    @NameInMap("vul_records")
    public java.util.List<DescribeNodePoolVulsResponseBodyVulRecords> vulRecords;

    @NameInMap("vuls_fix_service_purchased")
    public Boolean vulsFixServicePurchased;

    public static DescribeNodePoolVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodePoolVulsResponseBody self = new DescribeNodePoolVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodePoolVulsResponseBody setVulRecords(java.util.List<DescribeNodePoolVulsResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeNodePoolVulsResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public DescribeNodePoolVulsResponseBody setVulsFixServicePurchased(Boolean vulsFixServicePurchased) {
        this.vulsFixServicePurchased = vulsFixServicePurchased;
        return this;
    }
    public Boolean getVulsFixServicePurchased() {
        return this.vulsFixServicePurchased;
    }

    public static class DescribeNodePoolVulsResponseBodyVulRecordsVulList extends TeaModel {
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("alias_name")
        public String aliasName;

        /**
         * <p>A list of CVE names corresponding to the vulnerabilities.</p>
         */
        @NameInMap("cve_list")
        public java.util.List<String> cveList;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The severity level of the vulnerability.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   nntf: You can ignore the vulnerability</p>
         * <p>*   later: You can fix the vulnerability later</p>
         * <p>*   asap: You need to fix the vulnerability at the earliest opportunity</p>
         */
        @NameInMap("necessity")
        public String necessity;

        public static DescribeNodePoolVulsResponseBodyVulRecordsVulList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodePoolVulsResponseBodyVulRecordsVulList self = new DescribeNodePoolVulsResponseBodyVulRecordsVulList();
            return TeaModel.build(map, self);
        }

        public DescribeNodePoolVulsResponseBodyVulRecordsVulList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeNodePoolVulsResponseBodyVulRecordsVulList setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        public DescribeNodePoolVulsResponseBodyVulRecordsVulList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNodePoolVulsResponseBodyVulRecordsVulList setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

    }

    public static class DescribeNodePoolVulsResponseBodyVulRecords extends TeaModel {
        /**
         * <p>The node ID.</p>
         */
        @NameInMap("instance_id")
        public String instanceId;

        /**
         * <p>The node name. This name is the identifier of the node in the cluster.</p>
         */
        @NameInMap("node_name")
        public String nodeName;

        /**
         * <p>A list of vulnerabilities.</p>
         */
        @NameInMap("vul_list")
        public java.util.List<DescribeNodePoolVulsResponseBodyVulRecordsVulList> vulList;

        public static DescribeNodePoolVulsResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodePoolVulsResponseBodyVulRecords self = new DescribeNodePoolVulsResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeNodePoolVulsResponseBodyVulRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNodePoolVulsResponseBodyVulRecords setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeNodePoolVulsResponseBodyVulRecords setVulList(java.util.List<DescribeNodePoolVulsResponseBodyVulRecordsVulList> vulList) {
            this.vulList = vulList;
            return this;
        }
        public java.util.List<DescribeNodePoolVulsResponseBodyVulRecordsVulList> getVulList() {
            return this.vulList;
        }

    }

}
