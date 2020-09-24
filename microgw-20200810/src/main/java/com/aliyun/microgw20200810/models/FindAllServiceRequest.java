// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAllServiceRequest extends TeaModel {
    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public String pageSize;

    // name
    @NameInMap("name")
    public String name;

    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    // sourceType
    @NameInMap("sourceType")
    public Long sourceType;

    // isHealth
    @NameInMap("isHealth")
    public Boolean isHealth;

    public static FindAllServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        FindAllServiceRequest self = new FindAllServiceRequest();
        return TeaModel.build(map, self);
    }

    public FindAllServiceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public FindAllServiceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public FindAllServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindAllServiceRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public FindAllServiceRequest setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public FindAllServiceRequest setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
        return this;
    }
    public Boolean getIsHealth() {
        return this.isHealth;
    }

}
