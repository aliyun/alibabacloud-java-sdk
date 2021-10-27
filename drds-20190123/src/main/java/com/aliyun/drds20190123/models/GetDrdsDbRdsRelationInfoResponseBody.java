// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetDrdsDbRdsRelationInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetDrdsDbRdsRelationInfoResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDrdsDbRdsRelationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDrdsDbRdsRelationInfoResponseBody self = new GetDrdsDbRdsRelationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDrdsDbRdsRelationInfoResponseBody setData(java.util.List<GetDrdsDbRdsRelationInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDrdsDbRdsRelationInfoResponseBodyData> getData() {
        return this.data;
    }

    public GetDrdsDbRdsRelationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDrdsDbRdsRelationInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDrdsDbRdsRelationInfoResponseBodyData extends TeaModel {
        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        @NameInMap("ReadOnlyInstanceInfo")
        public java.util.List<String> readOnlyInstanceInfo;

        @NameInMap("UsedInstanceId")
        public String usedInstanceId;

        @NameInMap("UsedInstanceType")
        public String usedInstanceType;

        public static GetDrdsDbRdsRelationInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDrdsDbRdsRelationInfoResponseBodyData self = new GetDrdsDbRdsRelationInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDrdsDbRdsRelationInfoResponseBodyData setRdsInstanceId(String rdsInstanceId) {
            this.rdsInstanceId = rdsInstanceId;
            return this;
        }
        public String getRdsInstanceId() {
            return this.rdsInstanceId;
        }

        public GetDrdsDbRdsRelationInfoResponseBodyData setReadOnlyInstanceInfo(java.util.List<String> readOnlyInstanceInfo) {
            this.readOnlyInstanceInfo = readOnlyInstanceInfo;
            return this;
        }
        public java.util.List<String> getReadOnlyInstanceInfo() {
            return this.readOnlyInstanceInfo;
        }

        public GetDrdsDbRdsRelationInfoResponseBodyData setUsedInstanceId(String usedInstanceId) {
            this.usedInstanceId = usedInstanceId;
            return this;
        }
        public String getUsedInstanceId() {
            return this.usedInstanceId;
        }

        public GetDrdsDbRdsRelationInfoResponseBodyData setUsedInstanceType(String usedInstanceType) {
            this.usedInstanceType = usedInstanceType;
            return this;
        }
        public String getUsedInstanceType() {
            return this.usedInstanceType;
        }

    }

}
