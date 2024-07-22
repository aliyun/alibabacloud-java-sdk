// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListVoiceModelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>offlineSynthesis</p>
     */
    @NameInMap("useScene")
    public String useScene;

    /**
     * <strong>example:</strong>
     * <p>PRIVATE_VOICE</p>
     */
    @NameInMap("voiceType")
    public String voiceType;

    public static ListVoiceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceModelsRequest self = new ListVoiceModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListVoiceModelsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVoiceModelsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVoiceModelsRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public ListVoiceModelsRequest setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

}
