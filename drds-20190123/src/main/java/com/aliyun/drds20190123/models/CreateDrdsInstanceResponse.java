// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateDrdsInstanceResponseData data;

    public static CreateDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsInstanceResponse self = new CreateDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDrdsInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDrdsInstanceResponse setData(CreateDrdsInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public CreateDrdsInstanceResponseData getData() {
        return this.data;
    }

    public static class CreateDrdsInstanceResponseDataDrdsInstanceIdList extends TeaModel {
        // drdsInstanceIdList
        @NameInMap("drdsInstanceIdList")
        @Validation(required = true)
        public java.util.List<String> drdsInstanceIdList;

        public static CreateDrdsInstanceResponseDataDrdsInstanceIdList build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsInstanceResponseDataDrdsInstanceIdList self = new CreateDrdsInstanceResponseDataDrdsInstanceIdList();
            return TeaModel.build(map, self);
        }

        public CreateDrdsInstanceResponseDataDrdsInstanceIdList setDrdsInstanceIdList(java.util.List<String> drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public java.util.List<String> getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

    }

    public static class CreateDrdsInstanceResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        @NameInMap("DrdsInstanceIdList")
        @Validation(required = true)
        public CreateDrdsInstanceResponseDataDrdsInstanceIdList drdsInstanceIdList;

        public static CreateDrdsInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateDrdsInstanceResponseData self = new CreateDrdsInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public CreateDrdsInstanceResponseData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateDrdsInstanceResponseData setDrdsInstanceIdList(CreateDrdsInstanceResponseDataDrdsInstanceIdList drdsInstanceIdList) {
            this.drdsInstanceIdList = drdsInstanceIdList;
            return this;
        }
        public CreateDrdsInstanceResponseDataDrdsInstanceIdList getDrdsInstanceIdList() {
            return this.drdsInstanceIdList;
        }

    }

}
