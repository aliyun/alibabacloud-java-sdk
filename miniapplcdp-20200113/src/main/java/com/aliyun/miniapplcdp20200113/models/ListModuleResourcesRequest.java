// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleResourcesRequest extends TeaModel {
    @NameInMap("ModuleList")
    public String moduleList;

    @NameInMap("Source")
    public String source;

    @NameInMap("Types")
    public String types;

    @NameInMap("WithContent")
    public Boolean withContent;

    public static ListModuleResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModuleResourcesRequest self = new ListModuleResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListModuleResourcesRequest setModuleList(String moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public String getModuleList() {
        return this.moduleList;
    }

    public ListModuleResourcesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListModuleResourcesRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public ListModuleResourcesRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
