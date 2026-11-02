// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentVoiceprintsRequest extends TeaModel {
    /**
     * <p>The page number. Minimum value: 1.</p>
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
     * <p>The voiceprint registration mode. Default value: Explicit.</p>
     * 
     * <strong>example:</strong>
     * <p>Explicit</p>
     */
    @NameInMap("RegistrationMode")
    public String registrationMode;

    /**
     * <p>The unique ID for voiceprint recognition. This parameter is optional. If you do not specify this parameter, all voiceprint IDs under the account are listed. If you specify this parameter, only the specified voiceprint ID is displayed.</p>
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
