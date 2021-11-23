// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GlobalCondition")
    public String globalConditionShrink;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static ImportSwaggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerShrinkRequest self = new ImportSwaggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportSwaggerShrinkRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ImportSwaggerShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportSwaggerShrinkRequest setGlobalConditionShrink(String globalConditionShrink) {
        this.globalConditionShrink = globalConditionShrink;
        return this;
    }
    public String getGlobalConditionShrink() {
        return this.globalConditionShrink;
    }

    public ImportSwaggerShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportSwaggerShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
