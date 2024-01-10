// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingModelStatusInnerResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetThingModelStatusInnerResponseBodyData data;

    @NameInMap("LocalizedMsg")
    public String localizedMsg;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetThingModelStatusInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingModelStatusInnerResponseBody self = new GetThingModelStatusInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingModelStatusInnerResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetThingModelStatusInnerResponseBody setData(GetThingModelStatusInnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingModelStatusInnerResponseBodyData getData() {
        return this.data;
    }

    public GetThingModelStatusInnerResponseBody setLocalizedMsg(String localizedMsg) {
        this.localizedMsg = localizedMsg;
        return this;
    }
    public String getLocalizedMsg() {
        return this.localizedMsg;
    }

    public GetThingModelStatusInnerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetThingModelStatusInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetThingModelStatusInnerResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public String info;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("OutTime")
        public Long outTime;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("RbacTenantId")
        public String rbacTenantId;

        @NameInMap("Status")
        public Integer status;

        public static GetThingModelStatusInnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingModelStatusInnerResponseBodyData self = new GetThingModelStatusInnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingModelStatusInnerResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public GetThingModelStatusInnerResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetThingModelStatusInnerResponseBodyData setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetThingModelStatusInnerResponseBodyData setOutTime(Long outTime) {
            this.outTime = outTime;
            return this;
        }
        public Long getOutTime() {
            return this.outTime;
        }

        public GetThingModelStatusInnerResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetThingModelStatusInnerResponseBodyData setRbacTenantId(String rbacTenantId) {
            this.rbacTenantId = rbacTenantId;
            return this;
        }
        public String getRbacTenantId() {
            return this.rbacTenantId;
        }

        public GetThingModelStatusInnerResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
