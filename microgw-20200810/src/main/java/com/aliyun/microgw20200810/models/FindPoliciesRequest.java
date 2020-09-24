// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindPoliciesRequest extends TeaModel {
    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // name
    @NameInMap("name")
    public String name;

    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    // type
    @NameInMap("type")
    public Long type;

    // group
    @NameInMap("group")
    public String group;

    public static FindPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        FindPoliciesRequest self = new FindPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public FindPoliciesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public FindPoliciesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public FindPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindPoliciesRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public FindPoliciesRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public FindPoliciesRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

}
