// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetAgenticSpaceQuotaRequest extends TeaModel {
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
     * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually modifying the instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a dry run request without modifying the protocol service. The check items include required parameters, request format, and business dependency conditions. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned.</li>
     * <li>false (default): Sends a normal request. After the check succeeds, the protocol service is directly modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The maximum number of files allowed by the quota. Valid values:</p>
     * <ul>
     * <li><p>Minimum value: 10000.</p>
     * </li>
     * <li><p>Maximum value: 100000000.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("FileCountLimit")
    public Long fileCountLimit;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The total capacity limit of the quota. Unit: bytes.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Minimum value: 10737418240 (10 GiB).</li>
     * <li>Maximum value: 1099511627776000 (1024000 GiB).</li>
     * <li>Increment: 1073741824 (1 GiB).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10737418240</p>
     */
    @NameInMap("SizeLimit")
    public Long sizeLimit;

    public static SetAgenticSpaceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAgenticSpaceQuotaRequest self = new SetAgenticSpaceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetAgenticSpaceQuotaRequest setAgenticSpaceId(String agenticSpaceId) {
        this.agenticSpaceId = agenticSpaceId;
        return this;
    }
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    public SetAgenticSpaceQuotaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetAgenticSpaceQuotaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SetAgenticSpaceQuotaRequest setFileCountLimit(Long fileCountLimit) {
        this.fileCountLimit = fileCountLimit;
        return this;
    }
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

    public SetAgenticSpaceQuotaRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public SetAgenticSpaceQuotaRequest setSizeLimit(Long sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

}
