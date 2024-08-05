// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListsResponseBody extends TeaModel {
    /**
     * <p>The ACLs.</p>
     */
    @NameInMap("Acls")
    public DescribeAccessControlListsResponseBodyAcls acls;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessControlListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListsResponseBody self = new DescribeAccessControlListsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListsResponseBody setAcls(DescribeAccessControlListsResponseBodyAcls acls) {
        this.acls = acls;
        return this;
    }
    public DescribeAccessControlListsResponseBodyAcls getAcls() {
        return this.acls;
    }

    public DescribeAccessControlListsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessControlListsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessControlListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessControlListsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessControlListsResponseBodyAclsAcl extends TeaModel {
        /**
         * <p>The ID of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-3nsohdozz0ru8fi5onwz1</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The name of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testAcl</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>访问控制策略组的IP版本。</p>
         * <ul>
         * <li><strong>IPv4</strong>。</li>
         * <li><strong>IPv6</strong>。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        public static DescribeAccessControlListsResponseBodyAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAclsAcl self = new DescribeAccessControlListsResponseBodyAclsAcl();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

        public DescribeAccessControlListsResponseBodyAclsAcl setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

    }

    public static class DescribeAccessControlListsResponseBodyAcls extends TeaModel {
        @NameInMap("Acl")
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> acl;

        public static DescribeAccessControlListsResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListsResponseBodyAcls self = new DescribeAccessControlListsResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListsResponseBodyAcls setAcl(java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> acl) {
            this.acl = acl;
            return this;
        }
        public java.util.List<DescribeAccessControlListsResponseBodyAclsAcl> getAcl() {
            return this.acl;
        }

    }

}
