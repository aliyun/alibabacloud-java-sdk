// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<GetPatentPlanListResponseBodyData> data;

    public static GetPatentPlanListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanListResponseBody self = new GetPatentPlanListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetPatentPlanListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentPlanListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentPlanListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public GetPatentPlanListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPatentPlanListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public GetPatentPlanListResponseBody setData(java.util.List<GetPatentPlanListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPatentPlanListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetPatentPlanListResponseBodyData extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Contact")
        public String contact;

        @NameInMap("SoldCount")
        public Integer soldCount;

        @NameInMap("UnSoldCount")
        public String unSoldCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("PlanId")
        public Long planId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetPatentPlanListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentPlanListResponseBodyData self = new GetPatentPlanListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentPlanListResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPatentPlanListResponseBodyData setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public GetPatentPlanListResponseBodyData setSoldCount(Integer soldCount) {
            this.soldCount = soldCount;
            return this;
        }
        public Integer getSoldCount() {
            return this.soldCount;
        }

        public GetPatentPlanListResponseBodyData setUnSoldCount(String unSoldCount) {
            this.unSoldCount = unSoldCount;
            return this;
        }
        public String getUnSoldCount() {
            return this.unSoldCount;
        }

        public GetPatentPlanListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPatentPlanListResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetPatentPlanListResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
