// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclAppsRequest extends TeaModel {
    /**
     * <p>The ACL type. Valid values:</p>
     * <ul>
     * <li><p><strong>Internet</strong></p>
     * </li>
     * <li><p><strong>NAT</strong></p>
     * </li>
     * <li><p><strong>VPC</strong></p>
     * </li>
     * <li><p><strong>All</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("AclType")
    public String aclType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
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
     * <p>The page size.</p>
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
     * <li><p><strong>1</strong>: common</p>
     * </li>
     * <li><p><strong>0</strong>: not common</p>
     * </li>
     * <li><p>If you omit this parameter (the default), all applications are returned.</p>
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
