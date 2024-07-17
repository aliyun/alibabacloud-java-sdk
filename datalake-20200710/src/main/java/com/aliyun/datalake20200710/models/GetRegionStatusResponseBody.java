// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetRegionStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;RegionId\&quot;: \&quot;cn-shanghai\&quot;, \&quot;RegionStatus\&quot;: \&quot;SERVICE_INVALID\&quot;, \&quot;AccountStatus\&quot;: \&quot;\&quot;, \&quot;IsDlfServiceOpen\&quot;: False}</p>
     */
    @NameInMap("Data")
    public GetRegionStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CC58A776-0662-5C6D-B467-FFD4CF7F4C40</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetRegionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegionStatusResponseBody self = new GetRegionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegionStatusResponseBody setData(GetRegionStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRegionStatusResponseBodyData getData() {
        return this.data;
    }

    public GetRegionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegionStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetRegionStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDependencyReady")
        public Boolean isDependencyReady;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("IsDlfServiceOpen")
        public Boolean isDlfServiceOpen;

        /**
         * <strong>example:</strong>
         * <p>cn_hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        public static GetRegionStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRegionStatusResponseBodyData self = new GetRegionStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRegionStatusResponseBodyData setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public GetRegionStatusResponseBodyData setIsDependencyReady(Boolean isDependencyReady) {
            this.isDependencyReady = isDependencyReady;
            return this;
        }
        public Boolean getIsDependencyReady() {
            return this.isDependencyReady;
        }

        public GetRegionStatusResponseBodyData setIsDlfServiceOpen(Boolean isDlfServiceOpen) {
            this.isDlfServiceOpen = isDlfServiceOpen;
            return this;
        }
        public Boolean getIsDlfServiceOpen() {
            return this.isDlfServiceOpen;
        }

        public GetRegionStatusResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetRegionStatusResponseBodyData setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

    }

}
