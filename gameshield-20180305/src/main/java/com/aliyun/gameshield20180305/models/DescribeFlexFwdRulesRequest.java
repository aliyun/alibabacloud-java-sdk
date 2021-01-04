// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexFwdRulesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeFlexFwdRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexFwdRulesRequest self = new DescribeFlexFwdRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlexFwdRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFlexFwdRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFlexFwdRulesRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public DescribeFlexFwdRulesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeFlexFwdRulesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeFlexFwdRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
