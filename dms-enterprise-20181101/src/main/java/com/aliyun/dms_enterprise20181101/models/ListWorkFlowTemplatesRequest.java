// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowTemplatesRequest extends TeaModel {
    @NameInMap("SearchName")
    public String searchName;

    @NameInMap("Tid")
    public Long tid;

    public static ListWorkFlowTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowTemplatesRequest self = new ListWorkFlowTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowTemplatesRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListWorkFlowTemplatesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
