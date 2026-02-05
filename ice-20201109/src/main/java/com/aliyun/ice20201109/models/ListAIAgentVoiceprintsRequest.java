// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentVoiceprintsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Value values: [1,100].</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegistrationMode")
    public String registrationMode;

    /**
     * <p>A unique identifier for the voiceprint. This parameter is optional. If provided, only the information for that ID is returned. If not specified, all voiceprints under the account are returned.</p>
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
