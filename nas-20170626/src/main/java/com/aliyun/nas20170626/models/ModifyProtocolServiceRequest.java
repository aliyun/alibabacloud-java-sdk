// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyProtocolServiceRequest extends TeaModel {
    /**
     * <p>Ensures the idempotency of the request. Generate a parameter value from your client to ensure that the value is unique across different requests.</p>
     * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the protocol service.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * <li><strong>Spaces and other special characters are not allowed.</strong> Valid example: <code>My-Protocol-Service_01</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>My-Protocol-Service_01</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this modification request.
     * A dry run checks parameter validity and dependencies without actually modifying the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a dry run request without modifying the protocol service. The dry run checks whether required parameters are specified, whether the request format is valid, and whether business limit dependencies are met. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned.</li>
     * <li>false (default): Sends a normal request. After the check succeeds, the protocol service is directly modified.</li>
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
     * <p>The ID of the protocol service. This ID is returned when you call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> operation to create a protocol service, or you can obtain it by calling the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptc-197ed6a00f2b****</p>
     */
    @NameInMap("ProtocolServiceId")
    public String protocolServiceId;

    public static ModifyProtocolServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProtocolServiceRequest self = new ModifyProtocolServiceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProtocolServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyProtocolServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProtocolServiceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyProtocolServiceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyProtocolServiceRequest setProtocolServiceId(String protocolServiceId) {
        this.protocolServiceId = protocolServiceId;
        return this;
    }
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

}
