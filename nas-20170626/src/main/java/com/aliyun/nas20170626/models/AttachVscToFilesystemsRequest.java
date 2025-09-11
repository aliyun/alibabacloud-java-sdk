// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class AttachVscToFilesystemsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID information of the file system and virtual storage channel. Each batch can contain up to 10 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<AttachVscToFilesystemsRequestResourceIds> resourceIds;

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
         * <p>The ID of the virtual storage channel.</p>
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

}
