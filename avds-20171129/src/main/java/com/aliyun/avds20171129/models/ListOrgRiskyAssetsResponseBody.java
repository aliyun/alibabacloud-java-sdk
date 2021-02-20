// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgRiskyAssetsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Assets")
    public java.util.List<ListOrgRiskyAssetsResponseBodyAssets> assets;

    @NameInMap("Total")
    public Integer total;

    public static ListOrgRiskyAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgRiskyAssetsResponseBody self = new ListOrgRiskyAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgRiskyAssetsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgRiskyAssetsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgRiskyAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgRiskyAssetsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgRiskyAssetsResponseBody setAssets(java.util.List<ListOrgRiskyAssetsResponseBodyAssets> assets) {
        this.assets = assets;
        return this;
    }
    public java.util.List<ListOrgRiskyAssetsResponseBodyAssets> getAssets() {
        return this.assets;
    }

    public ListOrgRiskyAssetsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOrgRiskyAssetsResponseBodyAssets extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Asset")
        public String asset;

        @NameInMap("Count")
        public Integer count;

        public static ListOrgRiskyAssetsResponseBodyAssets build(java.util.Map<String, ?> map) throws Exception {
            ListOrgRiskyAssetsResponseBodyAssets self = new ListOrgRiskyAssetsResponseBodyAssets();
            return TeaModel.build(map, self);
        }

        public ListOrgRiskyAssetsResponseBodyAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOrgRiskyAssetsResponseBodyAssets setAsset(String asset) {
            this.asset = asset;
            return this;
        }
        public String getAsset() {
            return this.asset;
        }

        public ListOrgRiskyAssetsResponseBodyAssets setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
