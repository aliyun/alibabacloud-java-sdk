// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleModelsRequest extends TeaModel {
    @NameInMap("ModuleList")
    public String moduleList;

    @NameInMap("Source")
    public String source;

    @NameInMap("SubTypes")
    public String subTypes;

    @NameInMap("WithContent")
    public Boolean withContent;

    public static ListModuleModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModuleModelsRequest self = new ListModuleModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModuleModelsRequest setModuleList(String moduleList) {
        this.moduleList = moduleList;
        return this;
    }
    public String getModuleList() {
        return this.moduleList;
    }

    public ListModuleModelsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListModuleModelsRequest setSubTypes(String subTypes) {
        this.subTypes = subTypes;
        return this;
    }
    public String getSubTypes() {
        return this.subTypes;
    }

    public ListModuleModelsRequest setWithContent(Boolean withContent) {
        this.withContent = withContent;
        return this;
    }
    public Boolean getWithContent() {
        return this.withContent;
    }

}
