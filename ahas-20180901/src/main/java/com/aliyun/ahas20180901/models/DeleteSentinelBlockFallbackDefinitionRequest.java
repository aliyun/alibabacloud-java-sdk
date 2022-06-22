// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelBlockFallbackDefinitionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    public static DeleteSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelBlockFallbackDefinitionRequest self = new DeleteSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelBlockFallbackDefinitionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DeleteSentinelBlockFallbackDefinitionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteSentinelBlockFallbackDefinitionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
