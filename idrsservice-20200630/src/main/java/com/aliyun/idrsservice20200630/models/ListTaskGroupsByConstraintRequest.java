// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsByConstraintRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleId")
    public String ruleId;

    public static ListTaskGroupsByConstraintRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsByConstraintRequest self = new ListTaskGroupsByConstraintRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsByConstraintRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListTaskGroupsByConstraintRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListTaskGroupsByConstraintRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTaskGroupsByConstraintRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskGroupsByConstraintRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskGroupsByConstraintRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
