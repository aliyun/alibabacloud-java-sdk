// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstancesRequest extends TeaModel {
    @NameInMap("envUID")
    public String envUID;

    @NameInMap("options")
    public ListProductInstancesRequestOptions options;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstancesRequest self = new ListProductInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListProductInstancesRequest setEnvUID(String envUID) {
        this.envUID = envUID;
        return this;
    }
    public String getEnvUID() {
        return this.envUID;
    }

    public ListProductInstancesRequest setOptions(ListProductInstancesRequestOptions options) {
        this.options = options;
        return this;
    }
    public ListProductInstancesRequestOptions getOptions() {
        return this.options;
    }

    public ListProductInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListProductInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductInstancesRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static class ListProductInstancesRequestOptions extends TeaModel {
        @NameInMap("filterWithSpecUID")
        public Boolean filterWithSpecUID;

        @NameInMap("specUID")
        public String specUID;

        public static ListProductInstancesRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            ListProductInstancesRequestOptions self = new ListProductInstancesRequestOptions();
            return TeaModel.build(map, self);
        }

        public ListProductInstancesRequestOptions setFilterWithSpecUID(Boolean filterWithSpecUID) {
            this.filterWithSpecUID = filterWithSpecUID;
            return this;
        }
        public Boolean getFilterWithSpecUID() {
            return this.filterWithSpecUID;
        }

        public ListProductInstancesRequestOptions setSpecUID(String specUID) {
            this.specUID = specUID;
            return this;
        }
        public String getSpecUID() {
            return this.specUID;
        }

    }

}
