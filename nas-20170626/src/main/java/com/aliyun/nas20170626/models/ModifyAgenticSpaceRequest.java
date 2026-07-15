// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAgenticSpaceRequest extends TeaModel {
    /**
     * <p>AgenticSpace Id。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic-229oypxjgpau2****</p>
     */
    @NameInMap("AgenticSpaceId")
    public String agenticSpaceId;

    /**
     * <p>Ensures the idempotence of the request. Generate a unique parameter value from your client to ensure that the value is unique across different requests.</p>
     * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
     * <p>The description of the AgenticSpace.</p>
     * 
     * <strong>example:</strong>
     * <p>Agentic Space Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually modifying the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request without modifying the instance. The check items include whether required parameters are specified, request format, business limits, and NAS resource availability. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but FileSystemId is empty.</li>
     * <li>false (default): Sends a normal request and directly modifies the instance after the check passes.</li>
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
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static ModifyAgenticSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgenticSpaceRequest self = new ModifyAgenticSpaceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAgenticSpaceRequest setAgenticSpaceId(String agenticSpaceId) {
        this.agenticSpaceId = agenticSpaceId;
        return this;
    }
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    public ModifyAgenticSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAgenticSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAgenticSpaceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyAgenticSpaceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}
