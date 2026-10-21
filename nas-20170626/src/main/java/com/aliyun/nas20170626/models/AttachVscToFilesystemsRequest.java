// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AttachVscToFilesystemsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client and ensure that the value is unique across different requests.</p>
     * <p>The client token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IDs of the file systems and virtual storage channels (VSCs). You can specify up to 10 IDs per batch. This parameter must be passed in a flattened format, such as ResourceIds.1.FileSystemId=bmcpfs-xxx&amp;ResourceIds.1.VscId=vsc-xxx. JSON arrays are not supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<AttachVscToFilesystemsRequestResourceIds> resourceIds;

    /**
     * <p>The role chain.</p>
     * <blockquote>
     * <p>Required only for cross-account scenarios.</p>
     * </blockquote>
     */
    @NameInMap("RoleChain")
    public java.util.List<AttachVscToFilesystemsRequestRoleChain> roleChain;

    public static AttachVscToFilesystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVscToFilesystemsRequest self = new AttachVscToFilesystemsRequest();
        return TeaModel.build(map, self);
    }

    public AttachVscToFilesystemsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachVscToFilesystemsRequest setResourceIds(java.util.List<AttachVscToFilesystemsRequestResourceIds> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<AttachVscToFilesystemsRequestResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public AttachVscToFilesystemsRequest setRoleChain(java.util.List<AttachVscToFilesystemsRequestRoleChain> roleChain) {
        this.roleChain = roleChain;
        return this;
    }
    public java.util.List<AttachVscToFilesystemsRequestRoleChain> getRoleChain() {
        return this.roleChain;
    }

    public static class AttachVscToFilesystemsRequestResourceIds extends TeaModel {
        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The ID of the VSC. You can call the ListVscs operation of the Lingjun AI Computing Service eflo-controller/2022-12-15 API to query the ID. If no VSC is created, you can call the CreateVsc operation to create one.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-8vb864o3ppwfvh****</p>
         */
        @NameInMap("VscId")
        public String vscId;

        public static AttachVscToFilesystemsRequestResourceIds build(java.util.Map<String, ?> map) throws Exception {
            AttachVscToFilesystemsRequestResourceIds self = new AttachVscToFilesystemsRequestResourceIds();
            return TeaModel.build(map, self);
        }

        public AttachVscToFilesystemsRequestResourceIds setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public AttachVscToFilesystemsRequestResourceIds setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

    public static class AttachVscToFilesystemsRequestRoleChain extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account. This parameter specifies the Alibaba Cloud account for which the service assumes the role.</p>
         * 
         * <strong>example:</strong>
         * <p>176498472570****</p>
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
         * <p>The type of the role. Valid values: service and user.</p>
         * 
         * <strong>example:</strong>
         * <p>service</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static AttachVscToFilesystemsRequestRoleChain build(java.util.Map<String, ?> map) throws Exception {
            AttachVscToFilesystemsRequestRoleChain self = new AttachVscToFilesystemsRequestRoleChain();
            return TeaModel.build(map, self);
        }

        public AttachVscToFilesystemsRequestRoleChain setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public AttachVscToFilesystemsRequestRoleChain setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public AttachVscToFilesystemsRequestRoleChain setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
