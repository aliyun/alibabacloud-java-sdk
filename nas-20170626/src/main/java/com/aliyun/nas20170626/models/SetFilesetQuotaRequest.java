// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class SetFilesetQuotaRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run for this request.
     * A dry run checks parameter validity and dependencies without actually deleting the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Sends a check request without deleting the export directory. The check items include whether required parameters are specified, the request format, and business limit dependencies. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</p>
     * </li>
     * <li><p>false (default): Sends a normal request. After the check passes, the instance is directly deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file count limit of the quota. Valid values:</p>
     * <ul>
     * <li><p>Minimum value: 10,000.</p>
     * </li>
     * <li><p>Maximum value: 10,000,000,000.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the file count is unlimited.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("FileCountLimit")
    public Long fileCountLimit;

    /**
     * <p>The ID of the CPFS for Lingjun file system. The ID must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya****. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> (FileSystemType=bmcpfs) to query existing file systems.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>Fileset ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fset-1902718ea0ae****</p>
     */
    @NameInMap("FsetId")
    public String fsetId;

    /**
     * <p>The total capacity limit of the quota. Unit: bytes.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
     * </li>
     * <li><p>Increment: 1,073,741,824 (1 GiB).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the capacity is unlimited.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10737418240</p>
     */
    @NameInMap("SizeLimit")
    public Long sizeLimit;

    public static SetFilesetQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFilesetQuotaRequest self = new SetFilesetQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetFilesetQuotaRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetFilesetQuotaRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SetFilesetQuotaRequest setFileCountLimit(Long fileCountLimit) {
        this.fileCountLimit = fileCountLimit;
        return this;
    }
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

    public SetFilesetQuotaRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public SetFilesetQuotaRequest setFsetId(String fsetId) {
        this.fsetId = fsetId;
        return this;
    }
    public String getFsetId() {
        return this.fsetId;
    }

    public SetFilesetQuotaRequest setSizeLimit(Long sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

}
