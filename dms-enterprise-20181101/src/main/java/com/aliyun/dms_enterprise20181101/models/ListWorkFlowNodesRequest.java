// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowNodesRequest extends TeaModel {
    /**
     * <p>The name that is used to search for approval nodes.</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListWorkFlowNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowNodesRequest self = new ListWorkFlowNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowNodesRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListWorkFlowNodesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
