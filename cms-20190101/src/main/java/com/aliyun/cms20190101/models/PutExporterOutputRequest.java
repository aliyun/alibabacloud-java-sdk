// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterOutputRequest extends TeaModel {
    @NameInMap("DestName")
    public String destName;

    @NameInMap("ConfigJson")
    public String configJson;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DestType")
    public String destType;

    public static PutExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterOutputRequest self = new PutExporterOutputRequest();
        return TeaModel.build(map, self);
    }

    public PutExporterOutputRequest setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

    public PutExporterOutputRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

    public PutExporterOutputRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PutExporterOutputRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }
    public String getDestType() {
        return this.destType;
    }

}
