// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCostUnitResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryCostUnitResponseData data;

    public static QueryCostUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCostUnitResponse self = new QueryCostUnitResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryCostUnitResponseDataCostUnitDtoList extends TeaModel {
        @NameInMap("OwnerUid")
        @Validation(required = true)
        public Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        public Long parentUnitId;

        @NameInMap("UnitId")
        @Validation(required = true)
        public Long unitId;

        @NameInMap("UnitName")
        @Validation(required = true)
        public String unitName;

        public static QueryCostUnitResponseDataCostUnitDtoList build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseDataCostUnitDtoList self = new QueryCostUnitResponseDataCostUnitDtoList();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryCostUnitResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("CostUnitDtoList")
        @Validation(required = true)
        public java.util.List<QueryCostUnitResponseDataCostUnitDtoList> costUnitDtoList;

        public static QueryCostUnitResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostUnitResponseData self = new QueryCostUnitResponseData();
            return TeaModel.build(map, self);
        }

    }

}
