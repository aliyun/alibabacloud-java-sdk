// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeNfsAclResponseBody extends TeaModel {
    /**
     * <p>The information about the ACL feature.</p>
     */
    @NameInMap("Acl")
    public DescribeNfsAclResponseBodyAcl acl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1098673-1746-505E-A5F1-08527B7EDBDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNfsAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNfsAclResponseBody self = new DescribeNfsAclResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNfsAclResponseBody setAcl(DescribeNfsAclResponseBodyAcl acl) {
        this.acl = acl;
        return this;
    }
    public DescribeNfsAclResponseBodyAcl getAcl() {
        return this.acl;
    }

    public DescribeNfsAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNfsAclResponseBodyAcl extends TeaModel {
        /**
         * <p>Indicates whether the NFS ACL feature is enabled.</p>
         * <ul>
         * <li>true: The NFS ACL feature is enabled.</li>
         * <li>false: The NFS ACL feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static DescribeNfsAclResponseBodyAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeNfsAclResponseBodyAcl self = new DescribeNfsAclResponseBodyAcl();
            return TeaModel.build(map, self);
        }

        public DescribeNfsAclResponseBodyAcl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

}
