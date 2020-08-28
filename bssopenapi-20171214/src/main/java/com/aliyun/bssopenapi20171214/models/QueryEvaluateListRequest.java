// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryEvaluateListRequest extends TeaModel {
    @NameInMap("Type")
    public Integer type;

    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartAmount")
    public Long startAmount;

    @NameInMap("EndAmount")
    public Long endAmount;

    @NameInMap("StartBizTime")
    public String startBizTime;

    @NameInMap("EndBizTime")
    public String endBizTime;

    @NameInMap("SortType")
    public Integer sortType;

    @NameInMap("StartSearchTime")
    public String startSearchTime;

    @NameInMap("EndSearchTime")
    public String endSearchTime;

    @NameInMap("BillCycle")
    public String billCycle;

    @NameInMap("BizTypeList")
    public java.util.List<String> bizTypeList;

    public static QueryEvaluateListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEvaluateListRequest self = new QueryEvaluateListRequest();
        return TeaModel.build(map, self);
    }

}
