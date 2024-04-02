// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DeleteKeywordLibRequest extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordLibRequest self = new DeleteKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordLibRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DeleteKeywordLibRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteKeywordLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
