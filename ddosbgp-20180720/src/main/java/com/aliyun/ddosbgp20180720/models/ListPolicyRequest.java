// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyRequest extends TeaModel {
    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test**</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number of the current page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page in a paging query. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The applicable product type. Valid values:</p>
     * <ul>
     * <li><p><strong>ecs</strong>: queries the default policy applicable to ECS.</p>
     * </li>
     * <li><p><strong>slb</strong>: queries the default policy applicable to SLB.</p>
     * </li>
     * <li><p><strong>eip</strong>: queries the default policy applicable to EIP.</p>
     * </li>
     * <li><p><strong>gf-eip</strong>: queries the default policy applicable to elastic IP addresses (EIPs) with Anti-DDoS Proxy Enabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when the policy type is <code>default</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><p><strong>default</strong>: the default mitigation policy.</p>
     * </li>
     * <li><p><strong>l3</strong>: the IP-specific mitigation policy.</p>
     * </li>
     * <li><p><strong>l4</strong>: the port-specific mitigation policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>l3</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyRequest self = new ListPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPolicyRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListPolicyRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPolicyRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
