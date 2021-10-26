// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerRequest extends TeaModel {
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("GlobalCondition")
    public java.util.Map<String, ?> globalCondition;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    public static DryRunSwaggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerRequest self = new DryRunSwaggerRequest();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public DryRunSwaggerRequest setGlobalCondition(java.util.Map<String, ?> globalCondition) {
        this.globalCondition = globalCondition;
        return this;
    }
    public java.util.Map<String, ?> getGlobalCondition() {
        return this.globalCondition;
    }

    public DryRunSwaggerRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DryRunSwaggerRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DryRunSwaggerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
