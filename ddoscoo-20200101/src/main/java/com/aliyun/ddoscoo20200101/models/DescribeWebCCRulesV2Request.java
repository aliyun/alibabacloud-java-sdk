// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesV2Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeWebCCRulesV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesV2Request self = new DescribeWebCCRulesV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesV2Request setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebCCRulesV2Request setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public DescribeWebCCRulesV2Request setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeWebCCRulesV2Request setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
