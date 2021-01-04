// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowNodesRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("SearchName")
    public String searchName;

    public static ListWorkFlowNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowNodesRequest self = new ListWorkFlowNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowNodesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListWorkFlowNodesRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

}
