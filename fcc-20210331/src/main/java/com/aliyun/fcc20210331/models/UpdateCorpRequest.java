// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateCorpRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("CorpName")
    public String corpName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Description")
    public String description;

    @NameInMap("IconPath")
    public String iconPath;

    @NameInMap("CorpId")
    public String corpId;

    public static UpdateCorpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpRequest self = new UpdateCorpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCorpRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCorpRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public UpdateCorpRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateCorpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCorpRequest setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }
    public String getIconPath() {
        return this.iconPath;
    }

    public UpdateCorpRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
