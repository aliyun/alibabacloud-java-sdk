// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetDrdsDbRdsRelationInfoResponseBody extends TeaModel {
    /**
     * <p>The structure information about the storage instances of the DRDS database. Each entry corresponds to a primary storage instance.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetDrdsDbRdsRelationInfoResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
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
        /**
         * <p>The ID of the storage instance.</p>
         */
        @NameInMap("RdsInstanceId")
        public String rdsInstanceId;

        /**
         * <p>The IDs of the read-only storage instances.</p>
         */
        @NameInMap("ReadOnlyInstanceInfo")
        public java.util.List<String> readOnlyInstanceInfo;

        /**
         * <p>The ID of the storage instance that is in use. If the specified instance in the request is a primary DRDS instance, the value of this parameter is the ID of the primary storage instance. If the specified instance in the request is a read-only DRDS instance, the value of this parameter is the ID of the secondary storage instance.</p>
         */
        @NameInMap("UsedInstanceId")
        public String usedInstanceId;

        /**
         * <p>The type of the storage instance that is in use.</p>
         */
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
