// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemNextCycleRestrictionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryItemNextCycleRestrictionResponseBodyModel> model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryItemNextCycleRestrictionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryItemNextCycleRestrictionResponseBody self = new QueryItemNextCycleRestrictionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryItemNextCycleRestrictionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryItemNextCycleRestrictionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryItemNextCycleRestrictionResponseBody setModel(java.util.List<QueryItemNextCycleRestrictionResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryItemNextCycleRestrictionResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryItemNextCycleRestrictionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryItemNextCycleRestrictionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryItemNextCycleRestrictionResponseBodyModel extends TeaModel {
        @NameInMap("BeginTime")
        public Long beginTime;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("RestrictionQuantity")
        public Integer restrictionQuantity;

        public static QueryItemNextCycleRestrictionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryItemNextCycleRestrictionResponseBodyModel self = new QueryItemNextCycleRestrictionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public QueryItemNextCycleRestrictionResponseBodyModel setRestrictionQuantity(Integer restrictionQuantity) {
            this.restrictionQuantity = restrictionQuantity;
            return this;
        }
        public Integer getRestrictionQuantity() {
            return this.restrictionQuantity;
        }

    }

}
