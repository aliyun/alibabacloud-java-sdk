// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListVoiceModelsRequest extends TeaModel {
    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resSpecType")
    public String resSpecType;

    @NameInMap("useScene")
    public String useScene;

    @NameInMap("voiceLanguage")
    public String voiceLanguage;

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

    public ListVoiceModelsRequest setResSpecType(String resSpecType) {
        this.resSpecType = resSpecType;
        return this;
    }
    public String getResSpecType() {
        return this.resSpecType;
    }

    public ListVoiceModelsRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public ListVoiceModelsRequest setVoiceLanguage(String voiceLanguage) {
        this.voiceLanguage = voiceLanguage;
        return this;
    }
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    public ListVoiceModelsRequest setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

}
