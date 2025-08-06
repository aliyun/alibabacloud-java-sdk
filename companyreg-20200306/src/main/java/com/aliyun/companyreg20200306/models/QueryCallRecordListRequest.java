// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCallRecordListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SkillType")
    public Long skillType;

    public static QueryCallRecordListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallRecordListRequest self = new QueryCallRecordListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallRecordListRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryCallRecordListRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryCallRecordListRequest setSkillType(Long skillType) {
        this.skillType = skillType;
        return this;
    }
    public Long getSkillType() {
        return this.skillType;
    }

}
