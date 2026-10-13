// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteProtocolServiceRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a value from your client that is unique across different requests.</p>
     * <p>The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary across API requests.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually modifying the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a dry run request without modifying the protocol service. The check items include whether required parameters are specified, the request format, and business limit dependencies. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</li>
     * <li>false (default): Sends a normal request. After the check passes, the protocol service is directly modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The protocol service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptc-197ed6a00f2b****</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    public static DeleteProtocolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtocolServiceRequest self = new DeleteProtocolServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProtocolServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteProtocolServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteProtocolServiceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DeleteProtocolServiceRequest setProtocolServiceId(String protocolServiceId) {
        this.protocolServiceId = protocolServiceId;
        return this;
    }
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

}
