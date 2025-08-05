// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class QueryDataVDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QueryDataVDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataVDatasetRequest self = new QueryDataVDatasetRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataVDatasetRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDataVDatasetRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public QueryDataVDatasetRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryDataVDatasetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryDataVDatasetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
