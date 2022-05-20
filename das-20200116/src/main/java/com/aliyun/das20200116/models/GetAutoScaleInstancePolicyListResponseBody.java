// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoScaleInstancePolicyListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAutoScaleInstancePolicyListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAutoScaleInstancePolicyListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScaleInstancePolicyListResponseBody self = new GetAutoScaleInstancePolicyListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScaleInstancePolicyListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoScaleInstancePolicyListResponseBody setData(GetAutoScaleInstancePolicyListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoScaleInstancePolicyListResponseBodyData getData() {
        return this.data;
    }

    public GetAutoScaleInstancePolicyListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScaleInstancePolicyListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScaleInstancePolicyListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAutoScaleInstancePolicyListResponseBodyDataList extends TeaModel {
        @NameInMap("classType")
        public String classType;

        @NameInMap("engine")
        public String engine;

        @NameInMap("instanceAlias")
        public String instanceAlias;

        @NameInMap("instanceClass")
        public String instanceClass;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("onOff")
        public Boolean onOff;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("policyUuid")
        public String policyUuid;

        @NameInMap("scaleSettings")
        public String scaleSettings;

        @NameInMap("scaleType")
        public String scaleType;

        @NameInMap("state")
        public String state;

        @NameInMap("userId")
        public String userId;

        public static GetAutoScaleInstancePolicyListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleInstancePolicyListResponseBodyDataList self = new GetAutoScaleInstancePolicyListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setClassType(String classType) {
            this.classType = classType;
            return this;
        }
        public String getClassType() {
            return this.classType;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setOnOff(Boolean onOff) {
            this.onOff = onOff;
            return this;
        }
        public Boolean getOnOff() {
            return this.onOff;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setPolicyUuid(String policyUuid) {
            this.policyUuid = policyUuid;
            return this;
        }
        public String getPolicyUuid() {
            return this.policyUuid;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setScaleSettings(String scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }
        public String getScaleSettings() {
            return this.scaleSettings;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setScaleType(String scaleType) {
            this.scaleType = scaleType;
            return this;
        }
        public String getScaleType() {
            return this.scaleType;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetAutoScaleInstancePolicyListResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetAutoScaleInstancePolicyListResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<GetAutoScaleInstancePolicyListResponseBodyDataList> list;

        @NameInMap("pageNo")
        public Long pageNo;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("total")
        public Long total;

        public static GetAutoScaleInstancePolicyListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScaleInstancePolicyListResponseBodyData self = new GetAutoScaleInstancePolicyListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoScaleInstancePolicyListResponseBodyData setList(java.util.List<GetAutoScaleInstancePolicyListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAutoScaleInstancePolicyListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetAutoScaleInstancePolicyListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetAutoScaleInstancePolicyListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAutoScaleInstancePolicyListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
