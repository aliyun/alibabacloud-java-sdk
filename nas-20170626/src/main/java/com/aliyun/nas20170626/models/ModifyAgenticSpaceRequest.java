// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAgenticSpaceRequest extends TeaModel {
    /**
     * <p>The AgenticSpace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentic-229oypxjgpau2****</p>
     */
    @NameInMap("AgenticSpaceId")
    public String agenticSpaceId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.</p>
     * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Agentic space.</p>
     * 
     * <strong>example:</strong>
     * <p>Agentic Space Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on this request.</p>
     * <p>A dry run checks parameter validity and verifies inventory, but does not actually create an instance or incur any fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: A dry run is performed and no instance is created. The system checks whether required parameters are specified, the request format, business limits, and NAS inventory. If the request fails the check, an error is returned. If the request passes the check, the HTTP status code 200 is returned, but the FileSystemId is empty.</li>
     * <li>false (default): A normal request is sent. If the request passes the check, the instance is directly modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
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
