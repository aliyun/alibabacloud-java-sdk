// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeResponseBody extends TeaModel {
    /**
     * <p>The information about the access control policy.</p>
     */
    @NameInMap("AclEntrys")
    public DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys;

    /**
     * <p>The ID of the access control policy.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-uf6fpfdg3b5muska7uqem</p>
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
     * <p>The IP version. Valid values: <strong>ipv4</strong> and <strong>ipv6</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ipv4</p>
     */
    @NameInMap("AddressIPVersion")
    public String addressIPVersion;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccessControlListAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeResponseBody self = new DescribeAccessControlListAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListAttributeResponseBody setAclEntrys(DescribeAccessControlListAttributeResponseBodyAclEntrys aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public DescribeAccessControlListAttributeResponseBodyAclEntrys getAclEntrys() {
        return this.aclEntrys;
    }

    public DescribeAccessControlListAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeAccessControlListAttributeResponseBody setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public DescribeAccessControlListAttributeResponseBody setAddressIPVersion(String addressIPVersion) {
        this.addressIPVersion = addressIPVersion;
        return this;
    }
    public String getAddressIPVersion() {
        return this.addressIPVersion;
    }

    public DescribeAccessControlListAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry extends TeaModel {
        /**
         * <p>The description of an entry.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AclEntryComment")
        public String aclEntryComment;

        /**
         * <p>The entries of the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("AclEntryIp")
        public String aclEntryIp;

        public static DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry self = new DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry setAclEntryComment(String aclEntryComment) {
            this.aclEntryComment = aclEntryComment;
            return this;
        }
        public String getAclEntryComment() {
            return this.aclEntryComment;
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry setAclEntryIp(String aclEntryIp) {
            this.aclEntryIp = aclEntryIp;
            return this;
        }
        public String getAclEntryIp() {
            return this.aclEntryIp;
        }

    }

    public static class DescribeAccessControlListAttributeResponseBodyAclEntrys extends TeaModel {
        @NameInMap("AclEntry")
        public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> aclEntry;

        public static DescribeAccessControlListAttributeResponseBodyAclEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessControlListAttributeResponseBodyAclEntrys self = new DescribeAccessControlListAttributeResponseBodyAclEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeAccessControlListAttributeResponseBodyAclEntrys setAclEntry(java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> aclEntry) {
            this.aclEntry = aclEntry;
            return this;
        }
        public java.util.List<DescribeAccessControlListAttributeResponseBodyAclEntrysAclEntry> getAclEntry() {
            return this.aclEntry;
        }

    }

}
