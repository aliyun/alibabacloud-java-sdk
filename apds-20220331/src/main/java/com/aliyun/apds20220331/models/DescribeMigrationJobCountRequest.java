// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobCountRequest extends TeaModel {
    // 任务名称
    @NameInMap("name")
    public String name;

    // 源
    @NameInMap("source")
    public String source;

    // 来源系统,MigrationJobTypeEnum[DTS,SMC,OSS,value,desc]
    @NameInMap("type")
    public String type;

    public static DescribeMigrationJobCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobCountRequest self = new DescribeMigrationJobCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobCountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeMigrationJobCountRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeMigrationJobCountRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
