// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DownloadFlexAccRulesFileRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizId")
    public Long bizId;

    public static DownloadFlexAccRulesFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFlexAccRulesFileRequest self = new DownloadFlexAccRulesFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFlexAccRulesFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadFlexAccRulesFileRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

}
