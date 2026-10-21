// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsVscAttachInfoRequest extends TeaModel {
    /**
     * <p>The number of entries to return per query.</p>
     * <p>Valid values: 10 to 100.
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. The value is the NextToken parameter value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID information of the file systems and virtual storage channels. A maximum of 10 items are supported per batch.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<DescribeFilesystemsVscAttachInfoRequestResourceIds> resourceIds;

    /**
     * <p>The role chain.</p>
     * <blockquote>
     * <p>Required only for cross-account scenarios.</p>
     * </blockquote>
     */
    @NameInMap("RoleChain")
    public java.util.List<DescribeFilesystemsVscAttachInfoRequestRoleChain> roleChain;

    public static DescribeFilesystemsVscAttachInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsVscAttachInfoRequest self = new DescribeFilesystemsVscAttachInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsVscAttachInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFilesystemsVscAttachInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFilesystemsVscAttachInfoRequest setResourceIds(java.util.List<DescribeFilesystemsVscAttachInfoRequestResourceIds> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<DescribeFilesystemsVscAttachInfoRequestResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeFilesystemsVscAttachInfoRequest setRoleChain(java.util.List<DescribeFilesystemsVscAttachInfoRequestRoleChain> roleChain) {
        this.roleChain = roleChain;
        return this;
    }
    public java.util.List<DescribeFilesystemsVscAttachInfoRequestRoleChain> getRoleChain() {
        return this.roleChain;
    }

    public static class DescribeFilesystemsVscAttachInfoRequestResourceIds extends TeaModel {
        /**
         * <p>The ID of the file system. This parameter is required in each ResourceIds entry and must be provided together with VscId.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The ID of the virtual storage channel. This parameter is required in each ResourceIds entry and must be provided together with FileSystemId. The ID starts with vsc-. You can call the ListVscs operation of Lingjun AI Computing Service eflo-controller/2022-12-15 to query the ID. If the virtual storage channel is not created, call CreateVsc to create one.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-8vb864o3ppwfvh****</p>
         */
        @NameInMap("VscId")
        public String vscId;

        public static DescribeFilesystemsVscAttachInfoRequestResourceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsVscAttachInfoRequestResourceIds self = new DescribeFilesystemsVscAttachInfoRequestResourceIds();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsVscAttachInfoRequestResourceIds setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFilesystemsVscAttachInfoRequestResourceIds setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

    public static class DescribeFilesystemsVscAttachInfoRequestRoleChain extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account (the primary account UID). This parameter specifies the Alibaba Cloud account for which the service assumes the role.</p>
         * 
         * <strong>example:</strong>
         * <p>101522855006****</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>The resource descriptor of the specified role. Format: acs:ram::$accountID:role/$roleName.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123472233814****:role/aliyunnasclientvsc****</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The role type. Valid values: service and user.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static DescribeFilesystemsVscAttachInfoRequestRoleChain build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsVscAttachInfoRequestRoleChain self = new DescribeFilesystemsVscAttachInfoRequestRoleChain();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsVscAttachInfoRequestRoleChain setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public DescribeFilesystemsVscAttachInfoRequestRoleChain setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DescribeFilesystemsVscAttachInfoRequestRoleChain setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
