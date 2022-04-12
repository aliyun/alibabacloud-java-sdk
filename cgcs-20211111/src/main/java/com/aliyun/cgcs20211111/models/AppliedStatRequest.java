// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedStatRequest extends TeaModel {
    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 查询结束时间
    @NameInMap("QueryEndDate")
    public String queryEndDate;

    // 查询开始时间
    @NameInMap("QueryStartDate")
    public String queryStartDate;

    public static AppliedStatRequest build(java.util.Map<String, ?> map) throws Exception {
        AppliedStatRequest self = new AppliedStatRequest();
        return TeaModel.build(map, self);
    }

    public AppliedStatRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AppliedStatRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public AppliedStatRequest setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
        return this;
    }
    public String getQueryEndDate() {
        return this.queryEndDate;
    }

    public AppliedStatRequest setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
        return this;
    }
    public String getQueryStartDate() {
        return this.queryStartDate;
    }

}
