// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyRequest extends TeaModel {
    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>test**</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The type of the policy. Valid values:</p>
     * <ul>
     * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
     * <li><strong>l4</strong>: port-specific mitigation policies.</li>
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
