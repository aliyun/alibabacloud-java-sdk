// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListPipelineTemplatesRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    // 本次读取的最大数据记录数量
    @NameInMap("PageStart")
    public Integer pageStart;

    // 本次读取的最大数据记录数量
    @NameInMap("PageNum")
    public Integer pageNum;

    public static ListPipelineTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTemplatesRequest self = new ListPipelineTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineTemplatesRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListPipelineTemplatesRequest setPageStart(Integer pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    public Integer getPageStart() {
        return this.pageStart;
    }

    public ListPipelineTemplatesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}
