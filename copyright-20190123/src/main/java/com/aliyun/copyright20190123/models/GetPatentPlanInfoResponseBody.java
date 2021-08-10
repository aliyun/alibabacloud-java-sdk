// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetPatentPlanInfoResponseBodyData> data;

    public static GetPatentPlanInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanInfoResponseBody self = new GetPatentPlanInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentPlanInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentPlanInfoResponseBody setData(java.util.List<GetPatentPlanInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPatentPlanInfoResponseBodyData> getData() {
        return this.data;
    }

    public static class GetPatentPlanInfoResponseBodyData extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("PlanId")
        public Integer planId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Contact")
        public String contact;

        public static GetPatentPlanInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentPlanInfoResponseBodyData self = new GetPatentPlanInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentPlanInfoResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPatentPlanInfoResponseBodyData setPlanId(Integer planId) {
            this.planId = planId;
            return this;
        }
        public Integer getPlanId() {
            return this.planId;
        }

        public GetPatentPlanInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPatentPlanInfoResponseBodyData setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

    }

}
