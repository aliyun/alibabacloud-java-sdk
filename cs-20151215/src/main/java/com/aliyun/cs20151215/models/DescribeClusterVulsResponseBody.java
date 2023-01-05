// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterVulsResponseBody extends TeaModel {
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
        @NameInMap("cve_list")
        public java.util.List<String> cveList;

        @NameInMap("necessity")
        public String necessity;

        @NameInMap("node_count")
        public Integer nodeCount;

        @NameInMap("nodepool_id")
        public String nodepoolId;

        @NameInMap("nodepool_name")
        public String nodepoolName;

        @NameInMap("vul_alias_name")
        public String vulAliasName;

        @NameInMap("vul_name")
        public String vulName;

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
