// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("KeywordLibId")
    public String keywordLibId;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordRequest self = new DeleteKeywordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DeleteKeywordRequest setKeywordLibId(String keywordLibId) {
        this.keywordLibId = keywordLibId;
        return this;
    }
    public String getKeywordLibId() {
        return this.keywordLibId;
    }

    public DeleteKeywordRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public DeleteKeywordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteKeywordRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
