// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DetachVscFromFilesystemsRequest extends TeaModel {
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
     * <p>The ID information of the file system and virtual storage channel. A maximum of 10 entries can be specified per batch.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<DetachVscFromFilesystemsRequestResourceIds> resourceIds;

    /**
     * <p>The role chain.</p>
     * <blockquote>
     * <p>This parameter is required only for cross-account scenarios.</p>
     * </blockquote>
     */
    @NameInMap("RoleChain")
    public java.util.List<DetachVscFromFilesystemsRequestRoleChain> roleChain;

    public static DetachVscFromFilesystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromFilesystemsRequest self = new DetachVscFromFilesystemsRequest();
        return TeaModel.build(map, self);
    }

    public DetachVscFromFilesystemsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachVscFromFilesystemsRequest setResourceIds(java.util.List<DetachVscFromFilesystemsRequestResourceIds> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<DetachVscFromFilesystemsRequestResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public DetachVscFromFilesystemsRequest setRoleChain(java.util.List<DetachVscFromFilesystemsRequestRoleChain> roleChain) {
        this.roleChain = roleChain;
        return this;
    }
    public java.util.List<DetachVscFromFilesystemsRequestRoleChain> getRoleChain() {
        return this.roleChain;
    }

    public static class DetachVscFromFilesystemsRequestResourceIds extends TeaModel {
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

        public static DetachVscFromFilesystemsRequestResourceIds build(java.util.Map<String, ?> map) throws Exception {
            DetachVscFromFilesystemsRequestResourceIds self = new DetachVscFromFilesystemsRequestResourceIds();
            return TeaModel.build(map, self);
        }

        public DetachVscFromFilesystemsRequestResourceIds setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DetachVscFromFilesystemsRequestResourceIds setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

    public static class DetachVscFromFilesystemsRequestRoleChain extends TeaModel {
        /**
         * <p>The UID of the Alibaba Cloud account on whose behalf the service assumes the role.</p>
         * 
         * <strong>example:</strong>
         * <p>528394183225****</p>
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

        public static DetachVscFromFilesystemsRequestRoleChain build(java.util.Map<String, ?> map) throws Exception {
            DetachVscFromFilesystemsRequestRoleChain self = new DetachVscFromFilesystemsRequestRoleChain();
            return TeaModel.build(map, self);
        }

        public DetachVscFromFilesystemsRequestRoleChain setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public DetachVscFromFilesystemsRequestRoleChain setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DetachVscFromFilesystemsRequestRoleChain setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

}
