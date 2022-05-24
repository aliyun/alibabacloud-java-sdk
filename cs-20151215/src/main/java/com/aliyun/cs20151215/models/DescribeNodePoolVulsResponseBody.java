// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeNodePoolVulsResponseBody extends TeaModel {
    @NameInMap("vul_records")
    public java.util.List<DescribeNodePoolVulsResponseBodyVulRecords> vulRecords;

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

    public static class DescribeNodePoolVulsResponseBodyVulRecordsVulList extends TeaModel {
        @NameInMap("alias_name")
        public String aliasName;

        @NameInMap("cve_list")
        public java.util.List<String> cveList;

        @NameInMap("name")
        public String name;

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
        @NameInMap("instance_id")
        public String instanceId;

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

        public DescribeNodePoolVulsResponseBodyVulRecords setVulList(java.util.List<DescribeNodePoolVulsResponseBodyVulRecordsVulList> vulList) {
            this.vulList = vulList;
            return this;
        }
        public java.util.List<DescribeNodePoolVulsResponseBodyVulRecordsVulList> getVulList() {
            return this.vulList;
        }

    }

}
