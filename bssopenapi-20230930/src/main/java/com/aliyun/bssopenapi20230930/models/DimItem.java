// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DimItem extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageInfo")
    public DimItemPageInfo pageInfo;

    @NameInMap("Values")
    public java.util.List<ItemValues> values;

    public static DimItem build(java.util.Map<String, ?> map) throws Exception {
        DimItem self = new DimItem();
        return TeaModel.build(map, self);
    }

    public DimItem setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DimItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DimItem setPageInfo(DimItemPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DimItemPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DimItem setValues(java.util.List<ItemValues> values) {
        this.values = values;
        return this;
    }
    public java.util.List<ItemValues> getValues() {
        return this.values;
    }

    public static class DimItemPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DimItemPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DimItemPageInfo self = new DimItemPageInfo();
            return TeaModel.build(map, self);
        }

        public DimItemPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DimItemPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DimItemPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
