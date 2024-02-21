// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupToInstanceResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeAssetGroupToInstanceResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeAssetGroupToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupToInstanceResponseBody self = new DescribeAssetGroupToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupToInstanceResponseBody setDataList(java.util.List<DescribeAssetGroupToInstanceResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeAssetGroupToInstanceResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeAssetGroupToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetGroupToInstanceResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeAssetGroupToInstanceResponseBodyDataList extends TeaModel {
        /**
         * <p>The ID of the Anti-DDoS Origin instance of a paid edition.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UID of the member to which the asset belongs.</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The ID of the asset.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the asset.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The type of the asset.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAssetGroupToInstanceResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetGroupToInstanceResponseBodyDataList self = new DescribeAssetGroupToInstanceResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetGroupToInstanceResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAssetGroupToInstanceResponseBodyDataList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeAssetGroupToInstanceResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAssetGroupToInstanceResponseBodyDataList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAssetGroupToInstanceResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
