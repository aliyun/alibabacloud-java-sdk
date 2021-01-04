// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexAccFwdRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeFlexAccFwdRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexAccFwdRulesRequest self = new DescribeFlexAccFwdRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlexAccFwdRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFlexAccFwdRulesRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeFlexAccFwdRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeFlexAccFwdRulesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeFlexAccFwdRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
