// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DeleteConsoleAccessWhiteListRequest extends TeaModel {
    @NameInMap("DisableWhitelist")
    public String disableWhitelist;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteConsoleAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsoleAccessWhiteListRequest self = new DeleteConsoleAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConsoleAccessWhiteListRequest setDisableWhitelist(String disableWhitelist) {
        this.disableWhitelist = disableWhitelist;
        return this;
    }
    public String getDisableWhitelist() {
        return this.disableWhitelist;
    }

    public DeleteConsoleAccessWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteConsoleAccessWhiteListRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DeleteConsoleAccessWhiteListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
