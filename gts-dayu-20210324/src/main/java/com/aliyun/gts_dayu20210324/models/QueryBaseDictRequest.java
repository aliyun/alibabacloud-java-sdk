// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class QueryBaseDictRequest extends TeaModel {
    // param0
    @NameInMap("Type")
    public String type;

    // param1
    @NameInMap("Code")
    public String code;

    // param2
    @NameInMap("PageSize")
    public Integer pageSize;

    // param3
    @NameInMap("PageNum")
    public Integer pageNum;

    public static QueryBaseDictRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaseDictRequest self = new QueryBaseDictRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaseDictRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryBaseDictRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBaseDictRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBaseDictRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

}
