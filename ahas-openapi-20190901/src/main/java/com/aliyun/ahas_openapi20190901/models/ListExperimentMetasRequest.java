// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListExperimentMetasRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ListExperimentMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentMetasRequest self = new ListExperimentMetasRequest();
        return TeaModel.build(map, self);
    }

    public ListExperimentMetasRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListExperimentMetasRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ListExperimentMetasRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListExperimentMetasRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
