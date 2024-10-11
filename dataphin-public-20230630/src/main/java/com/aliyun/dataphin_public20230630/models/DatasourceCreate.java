// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DatasourceCreate extends TeaModel {
    @NameInMap("CheckActivity")
    public Boolean checkActivity;

    @NameInMap("Configs")
    public java.util.Map<String, String> configs;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static DatasourceCreate build(java.util.Map<String, ?> map) throws Exception {
        DatasourceCreate self = new DatasourceCreate();
        return TeaModel.build(map, self);
    }

    public DatasourceCreate setCheckActivity(Boolean checkActivity) {
        this.checkActivity = checkActivity;
        return this;
    }
    public Boolean getCheckActivity() {
        return this.checkActivity;
    }

    public DatasourceCreate setConfigs(java.util.Map<String, String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    public DatasourceCreate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatasourceCreate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatasourceCreate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
