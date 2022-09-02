// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class SaveConfigJsonRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("Json")
    public String json;

    public static SaveConfigJsonRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigJsonRequest self = new SaveConfigJsonRequest();
        return TeaModel.build(map, self);
    }

    public SaveConfigJsonRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public SaveConfigJsonRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SaveConfigJsonRequest setJson(String json) {
        this.json = json;
        return this;
    }
    public String getJson() {
        return this.json;
    }

}
