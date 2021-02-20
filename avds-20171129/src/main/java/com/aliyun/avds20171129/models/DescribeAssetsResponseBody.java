// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAssetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("List")
    public java.util.List<DescribeAssetsResponseBodyList> list;

    @NameInMap("Count")
    public Integer count;

    public static DescribeAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetsResponseBody self = new DescribeAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAssetsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeAssetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAssetsResponseBody setList(java.util.List<DescribeAssetsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeAssetsResponseBodyList> getList() {
        return this.list;
    }

    public DescribeAssetsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public static class DescribeAssetsResponseBodyList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("LastScanDate")
        public Long lastScanDate;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("AssetId")
        public String assetId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Source")
        public String source;

        @NameInMap("Asset")
        public String asset;

        public static DescribeAssetsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetsResponseBodyList self = new DescribeAssetsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetsResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAssetsResponseBodyList setLastScanDate(Long lastScanDate) {
            this.lastScanDate = lastScanDate;
            return this;
        }
        public Long getLastScanDate() {
            return this.lastScanDate;
        }

        public DescribeAssetsResponseBodyList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeAssetsResponseBodyList setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public DescribeAssetsResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAssetsResponseBodyList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeAssetsResponseBodyList setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

    }

}
