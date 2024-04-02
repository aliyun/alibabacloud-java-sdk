// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class MarkWebsiteScanResultRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static MarkWebsiteScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkWebsiteScanResultRequest self = new MarkWebsiteScanResultRequest();
        return TeaModel.build(map, self);
    }

    public MarkWebsiteScanResultRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public MarkWebsiteScanResultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public MarkWebsiteScanResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
