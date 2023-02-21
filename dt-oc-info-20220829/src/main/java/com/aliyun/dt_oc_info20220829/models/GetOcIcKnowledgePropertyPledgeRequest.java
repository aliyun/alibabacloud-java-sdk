// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcKnowledgePropertyPledgeRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetOcIcKnowledgePropertyPledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcKnowledgePropertyPledgeRequest self = new GetOcIcKnowledgePropertyPledgeRequest();
        return TeaModel.build(map, self);
    }

    public GetOcIcKnowledgePropertyPledgeRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOcIcKnowledgePropertyPledgeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOcIcKnowledgePropertyPledgeRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOcIcKnowledgePropertyPledgeRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
