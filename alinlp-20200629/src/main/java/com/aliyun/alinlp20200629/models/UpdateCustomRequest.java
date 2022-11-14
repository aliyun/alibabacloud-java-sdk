// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateCustomRequest extends TeaModel {
    @NameInMap("CustomFileName")
    public String customFileName;

    @NameInMap("CustomId")
    public Integer customId;

    @NameInMap("CustomUrl")
    public String customUrl;

    @NameInMap("RegFileName")
    public String regFileName;

    @NameInMap("RegUrl")
    public String regUrl;

    @NameInMap("ServiceCode")
    public String serviceCode;

    public static UpdateCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRequest self = new UpdateCustomRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRequest setCustomFileName(String customFileName) {
        this.customFileName = customFileName;
        return this;
    }
    public String getCustomFileName() {
        return this.customFileName;
    }

    public UpdateCustomRequest setCustomId(Integer customId) {
        this.customId = customId;
        return this;
    }
    public Integer getCustomId() {
        return this.customId;
    }

    public UpdateCustomRequest setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
        return this;
    }
    public String getCustomUrl() {
        return this.customUrl;
    }

    public UpdateCustomRequest setRegFileName(String regFileName) {
        this.regFileName = regFileName;
        return this;
    }
    public String getRegFileName() {
        return this.regFileName;
    }

    public UpdateCustomRequest setRegUrl(String regUrl) {
        this.regUrl = regUrl;
        return this;
    }
    public String getRegUrl() {
        return this.regUrl;
    }

    public UpdateCustomRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
