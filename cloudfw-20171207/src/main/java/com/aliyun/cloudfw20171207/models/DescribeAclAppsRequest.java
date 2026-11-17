// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclAppsRequest extends TeaModel {
    /**
     * <p>The ACL type. Valid values:</p>
     * <ul>
     * <li><strong>Internet</strong>                       </li>
     * <li><strong>NAT</strong></li>
     * <li><strong>VPC</strong></li>
     * <li><strong>All</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether the application is common. Valid values:</p>
     * <ul>
     * <li><p>1: Common.</p>
     * </li>
     * <li><p>0: Uncommon.</p>
     * </li>
     * <li><p>Empty (default): All.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Popular")
    public Integer popular;

    /**
     * <p>The list of protocol types.</p>
     */
    @NameInMap("Protocols")
    public java.util.List<String> protocols;

    public static DescribeAclAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclAppsRequest self = new DescribeAclAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclAppsRequest setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeAclAppsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAclAppsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeAclAppsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAclAppsRequest setPopular(Integer popular) {
        this.popular = popular;
        return this;
    }
    public Integer getPopular() {
        return this.popular;
    }

    public DescribeAclAppsRequest setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

}
