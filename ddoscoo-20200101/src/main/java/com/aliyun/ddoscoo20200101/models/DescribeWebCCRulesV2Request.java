// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesV2Request extends TeaModel {
    /**
     * <p>The domain name of the website that you want to add to the Anti-DDoS Proxy instance for protection.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The number of entries that you want the system to skip before the system returns entries. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>The method used to create the rule. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong> (default): manually created.</li>
     * <li><strong>clover</strong>: automatically created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The number of entries per page. Maximum value: <strong>20</strong>. Default value: <strong>20</strong>.</p>
     * 
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
