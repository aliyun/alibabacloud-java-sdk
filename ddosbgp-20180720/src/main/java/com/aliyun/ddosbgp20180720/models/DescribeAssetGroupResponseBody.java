// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the asset.</p>
     */
    @NameInMap("AssetGroupList")
    public java.util.List<DescribeAssetGroupResponseBodyAssetGroupList> assetGroupList;

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

    public static DescribeAssetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupResponseBody self = new DescribeAssetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupResponseBody setAssetGroupList(java.util.List<DescribeAssetGroupResponseBodyAssetGroupList> assetGroupList) {
        this.assetGroupList = assetGroupList;
        return this;
    }
    public java.util.List<DescribeAssetGroupResponseBodyAssetGroupList> getAssetGroupList() {
        return this.assetGroupList;
    }

    public DescribeAssetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetGroupResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeAssetGroupResponseBodyAssetGroupList extends TeaModel {
        /**
         * <p>The ID of the asset.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region to which the asset belongs.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The type of the asset.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAssetGroupResponseBodyAssetGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetGroupResponseBodyAssetGroupList self = new DescribeAssetGroupResponseBodyAssetGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetGroupResponseBodyAssetGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAssetGroupResponseBodyAssetGroupList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAssetGroupResponseBodyAssetGroupList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
