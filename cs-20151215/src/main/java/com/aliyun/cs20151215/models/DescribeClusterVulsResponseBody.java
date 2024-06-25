// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterVulsResponseBody extends TeaModel {
    /**
     * <p>An array of vulnerabilities.</p>
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
         * <p>The CVE list.</p>
         */
        @NameInMap("cve_list")
        public java.util.List<String> cveList;

        /**
         * <p>The severity level of the vulnerability.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>nntf: low</li>
         * <li>later: medium     </li>
         * <li>asap: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        @NameInMap("necessity")
        public String necessity;

        /**
         * <p>The number of nodes that have the vulnerability.</p>
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
         * <p>np0156da1082b54fa987e32618dd45f5d3</p>
         */
        @NameInMap("nodepool_id")
        public String nodepoolId;

        /**
         * <p>The name of the node pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("nodepool_name")
        public String nodepoolName;

        /**
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-xxxx:rsync Security vulnerabilities</p>
         */
        @NameInMap("vul_alias_name")
        public String vulAliasName;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:xxxxxxx</p>
         */
        @NameInMap("vul_name")
        public String vulName;

        /**
         * <p>The type of vulnerability.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>app: application vulnerabilities</li>
         * <li>sca: application vulnerabilities (software component analysis)</li>
         * <li>cve: Linux vulnerabilities</li>
         * <li>cms: Web-CMS vulnerabilities</li>
         * <li>sys: Windows vulnerabilities</li>
         * <li>emg:  emergency vulnerabilities</li>
         * </ul>
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
