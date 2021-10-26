// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerShrinkRequest extends TeaModel {
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("GlobalCondition")
    public String globalConditionShrink;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    public static DryRunSwaggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerShrinkRequest self = new DryRunSwaggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public DryRunSwaggerShrinkRequest setGlobalConditionShrink(String globalConditionShrink) {
        this.globalConditionShrink = globalConditionShrink;
        return this;
    }
    public String getGlobalConditionShrink() {
        return this.globalConditionShrink;
    }

    public DryRunSwaggerShrinkRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public DryRunSwaggerShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DryRunSwaggerShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
