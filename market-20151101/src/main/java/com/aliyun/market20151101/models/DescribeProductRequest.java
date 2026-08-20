// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProductRequest extends TeaModel {
    /**
     * <p>AliUid.</p>
     * 
     * <strong>example:</strong>
     * <p>190********569</p>
     */
    @NameInMap("AliUid")
    public String aliUid;

    /**
     * <p>The commodity code of the product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cmjj01**45</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Specifies whether to query the product draft. In most cases, you do not need to query the product draft. Product drafts are used to query product information before the product is officially listed for sale.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("QueryDraft")
    public Boolean queryDraft;

    public static DescribeProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductRequest self = new DescribeProductRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeProductRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProductRequest setQueryDraft(Boolean queryDraft) {
        this.queryDraft = queryDraft;
        return this;
    }
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

}
