// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Recursive")
    public Boolean recursive;

    @NameInMap("Source")
    public String source;

    public static ListAppModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesRequest self = new ListAppModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppModulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppModulesRequest setRecursive(Boolean recursive) {
        this.recursive = recursive;
        return this;
    }
    public Boolean getRecursive() {
        return this.recursive;
    }

    public ListAppModulesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
