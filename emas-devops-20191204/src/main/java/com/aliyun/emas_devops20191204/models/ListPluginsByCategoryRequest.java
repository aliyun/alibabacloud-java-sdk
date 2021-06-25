// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPluginsByCategoryRequest extends TeaModel {
    @NameInMap("PluginCategory")
    public String pluginCategory;

    @NameInMap("PluginEnv")
    @Validation(required = true)
    public String pluginEnv;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    public static ListPluginsByCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsByCategoryRequest self = new ListPluginsByCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginsByCategoryRequest setPluginCategory(String pluginCategory) {
        this.pluginCategory = pluginCategory;
        return this;
    }
    public String getPluginCategory() {
        return this.pluginCategory;
    }

    public ListPluginsByCategoryRequest setPluginEnv(String pluginEnv) {
        this.pluginEnv = pluginEnv;
        return this;
    }
    public String getPluginEnv() {
        return this.pluginEnv;
    }

    public ListPluginsByCategoryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPluginsByCategoryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
