// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadRequest extends TeaModel {
    /**
     * <p>The Agent or client source that initiates the call, such as codex, cursor, or openapi. Maximum length: 32 characters. Used only for statistics and does not participate in authentication, throttling, quota, or billing.</p>
     * 
     * <strong>example:</strong>
     * <p>codex</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    @NameInMap("BatchSize")
    public String batchSize;

    /**
     * <p>The format of the file to be uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileFormat")
    public String fileFormat;

    /**
     * <p>The region ID, such as cn-beijing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AuthorizeFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadRequest self = new AuthorizeFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeFileUploadRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AuthorizeFileUploadRequest setBatchSize(String batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public String getBatchSize() {
        return this.batchSize;
    }

    public AuthorizeFileUploadRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public AuthorizeFileUploadRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
