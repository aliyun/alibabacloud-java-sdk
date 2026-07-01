// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentVoiceprintsRequest extends TeaModel {
    /**
     * <p>The page number to return. Must be 1 or greater.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The registration mode for the voiceprint. The default value is <code>Explicit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Explicit</p>
     */
    @NameInMap("RegistrationMode")
    public String registrationMode;

    /**
     * <p>The unique voiceprint ID. If specified, this operation returns the details of a single voiceprint. If omitted, it returns a paginated list of all voiceprints under your account.</p>
     * 
     * <strong>example:</strong>
     * <p>vp_1699123456_8527</p>
     */
    @NameInMap("VoiceprintId")
    public String voiceprintId;

    public static ListAIAgentVoiceprintsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentVoiceprintsRequest self = new ListAIAgentVoiceprintsRequest();
        return TeaModel.build(map, self);
    }

    public ListAIAgentVoiceprintsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAIAgentVoiceprintsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentVoiceprintsRequest setRegistrationMode(String registrationMode) {
        this.registrationMode = registrationMode;
        return this;
    }
    public String getRegistrationMode() {
        return this.registrationMode;
    }

    public ListAIAgentVoiceprintsRequest setVoiceprintId(String voiceprintId) {
        this.voiceprintId = voiceprintId;
        return this;
    }
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

}
