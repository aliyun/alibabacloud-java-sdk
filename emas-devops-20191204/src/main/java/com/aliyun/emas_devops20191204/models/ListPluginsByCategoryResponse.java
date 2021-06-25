// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPluginsByCategoryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPluginsByCategoryResponseItems> items;

    public static ListPluginsByCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsByCategoryResponse self = new ListPluginsByCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListPluginsByCategoryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPluginsByCategoryResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPluginsByCategoryResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPluginsByCategoryResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListPluginsByCategoryResponse setItems(java.util.List<ListPluginsByCategoryResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPluginsByCategoryResponseItems> getItems() {
        return this.items;
    }

    public static class ListPluginsByCategoryResponseItems extends TeaModel {
        @NameInMap("PluginName")
        @Validation(required = true)
        public String pluginName;

        @NameInMap("PluginCategory")
        @Validation(required = true)
        public String pluginCategory;

        @NameInMap("PluginDisplayName")
        @Validation(required = true)
        public String pluginDisplayName;

        @NameInMap("PluginDescription")
        @Validation(required = true)
        public String pluginDescription;

        @NameInMap("PluginLatestVersion")
        @Validation(required = true)
        public String pluginLatestVersion;

        public static ListPluginsByCategoryResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsByCategoryResponseItems self = new ListPluginsByCategoryResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPluginsByCategoryResponseItems setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public ListPluginsByCategoryResponseItems setPluginCategory(String pluginCategory) {
            this.pluginCategory = pluginCategory;
            return this;
        }
        public String getPluginCategory() {
            return this.pluginCategory;
        }

        public ListPluginsByCategoryResponseItems setPluginDisplayName(String pluginDisplayName) {
            this.pluginDisplayName = pluginDisplayName;
            return this;
        }
        public String getPluginDisplayName() {
            return this.pluginDisplayName;
        }

        public ListPluginsByCategoryResponseItems setPluginDescription(String pluginDescription) {
            this.pluginDescription = pluginDescription;
            return this;
        }
        public String getPluginDescription() {
            return this.pluginDescription;
        }

        public ListPluginsByCategoryResponseItems setPluginLatestVersion(String pluginLatestVersion) {
            this.pluginLatestVersion = pluginLatestVersion;
            return this;
        }
        public String getPluginLatestVersion() {
            return this.pluginLatestVersion;
        }

    }

}
