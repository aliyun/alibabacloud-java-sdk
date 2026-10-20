// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterVulsResponseBody extends TeaModel {
    /**
     * <p>The list of vulnerabilities.</p>
     */
    @NameInMap("vul_records")
    public java.util.List<DescribeClusterVulsResponseBodyVulRecords> vulRecords;

    public static DescribeClusterVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterVulsResponseBody self = new DescribeClusterVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterVulsResponseBody setVulRecords(java.util.List<DescribeClusterVulsResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeClusterVulsResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeClusterVulsResponseBodyVulRecords extends TeaModel {
        /**
         * <p>The list of CVEs.</p>
         */
        @NameInMap("cve_list")
        public java.util.List<String> cveList;

        /**
         * <p>The vulnerability severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        @NameInMap("necessity")
        public String necessity;

        /**
         * <p>The number of nodes that have this vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("node_count")
        public Integer nodeCount;

        /**
         * <p>The node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np0156da1082b54fa987e32618dd******</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>The node pool name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("nodepool_name")
        public String nodepoolName;

        /**
         * <p>The vulnerability alias.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-xxxx:rsync security vulnerability</p>
         */
        @NameInMap("vul_alias_name")
        public String vulAliasName;

        /**
         * <p>The vulnerability name.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:xxxxxxx</p>
         */
        @NameInMap("vul_name")
        public String vulName;

        /**
         * <p>The vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("vul_type")
        public String vulType;

        public static DescribeClusterVulsResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterVulsResponseBodyVulRecords self = new DescribeClusterVulsResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeClusterVulsResponseBodyVulRecords setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

        public DescribeClusterVulsResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeClusterVulsResponseBodyVulRecords setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeClusterVulsResponseBodyVulRecords setNodepoolId(String nodepoolId) {
            this.nodepoolId = nodepoolId;
            return this;
        }
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public DescribeClusterVulsResponseBodyVulRecords setNodepoolName(String nodepoolName) {
            this.nodepoolName = nodepoolName;
            return this;
        }
        public String getNodepoolName() {
            return this.nodepoolName;
        }

        public DescribeClusterVulsResponseBodyVulRecords setVulAliasName(String vulAliasName) {
            this.vulAliasName = vulAliasName;
            return this;
        }
        public String getVulAliasName() {
            return this.vulAliasName;
        }

        public DescribeClusterVulsResponseBodyVulRecords setVulName(String vulName) {
            this.vulName = vulName;
            return this;
        }
        public String getVulName() {
            return this.vulName;
        }

        public DescribeClusterVulsResponseBodyVulRecords setVulType(String vulType) {
            this.vulType = vulType;
            return this;
        }
        public String getVulType() {
            return this.vulType;
        }

    }

}
