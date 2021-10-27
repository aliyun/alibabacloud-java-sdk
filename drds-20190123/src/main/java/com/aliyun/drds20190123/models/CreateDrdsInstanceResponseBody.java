// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDrdsInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDrdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceResponseBody self = new CreateDrdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceResponseBody setData(CreateDrdsInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDrdsInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateDrdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDrdsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList extends TeaModel {
        @NameInMap("drdsInstanceIdList")
        public java.util.List<String> drdsInstanceIdList;

        public static CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList self = new CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList();
            return TeaModel.build(map, self);
        }

        public CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList setDrdsInstanceIdList(java.util.List<String> drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public java.util.List<String> getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

    }

    public static class CreateDrdsInstanceResponseBodyData extends TeaModel {
        @NameInMap("DrdsInstanceIdList")
        public CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList drdsInstanceIdList;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreateDrdsInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsInstanceResponseBodyData self = new CreateDrdsInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDrdsInstanceResponseBodyData setDrdsInstanceIdList(CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public CreateDrdsInstanceResponseBodyDataDrdsInstanceIdList getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

        public CreateDrdsInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
