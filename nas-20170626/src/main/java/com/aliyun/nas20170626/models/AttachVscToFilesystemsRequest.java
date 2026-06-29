// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AttachVscToFilesystemsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID information of file systems and virtual storage channels. A maximum of 10 entries can be specified per batch.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<AttachVscToFilesystemsRequestResourceIds> resourceIds;

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
         * <p>The file system ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The virtual storage channel ID.</p>
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
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        @NameInMap("RoleArn")
        public String roleArn;

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
