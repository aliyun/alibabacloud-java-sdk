// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ImportSwaggerRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    public static ImportSwaggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerRequest self = new ImportSwaggerRequest();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportSwaggerRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ImportSwaggerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportSwaggerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportSwaggerRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

}
