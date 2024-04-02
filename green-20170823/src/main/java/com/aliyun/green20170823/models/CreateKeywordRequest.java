// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordRequest extends TeaModel {
    @NameInMap("KeywordLibId")
    public Long keywordLibId;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordRequest self = new CreateKeywordRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeywordRequest setKeywordLibId(Long keywordLibId) {
        this.keywordLibId = keywordLibId;
        return this;
    }
    public Long getKeywordLibId() {
        return this.keywordLibId;
    }

    public CreateKeywordRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CreateKeywordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateKeywordRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
