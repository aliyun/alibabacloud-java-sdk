// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ 			&quot;AccountStatus&quot;:&quot;&quot;, 			&quot;RegionStatus&quot;:&quot;READY&quot;, 			&quot;RegionId&quot;:&quot;cn-shanghai&quot;, 			&quot;IsDependencyReady&quot;:true, 			&quot;IsDlfServiceOpen&quot;:true 		}</p>
     */
    @NameInMap("Data")
    public GetServiceStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>B7F4B621-E41E-4C84-B97F-42B5380A32BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponseBody self = new GetServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceStatusResponseBody setData(GetServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasRamPermissions")
        public Boolean hasRamPermissions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDlfServiceOpen")
        public Boolean isDlfServiceOpen;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOssOpen")
        public Boolean isOssOpen;

        public static GetServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceStatusResponseBodyData self = new GetServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceStatusResponseBodyData setHasRamPermissions(Boolean hasRamPermissions) {
            this.hasRamPermissions = hasRamPermissions;
            return this;
        }
        public Boolean getHasRamPermissions() {
            return this.hasRamPermissions;
        }

        public GetServiceStatusResponseBodyData setIsDlfServiceOpen(Boolean isDlfServiceOpen) {
            this.isDlfServiceOpen = isDlfServiceOpen;
            return this;
        }
        public Boolean getIsDlfServiceOpen() {
            return this.isDlfServiceOpen;
        }

        public GetServiceStatusResponseBodyData setIsOssOpen(Boolean isOssOpen) {
            this.isOssOpen = isOssOpen;
            return this;
        }
        public Boolean getIsOssOpen() {
            return this.isOssOpen;
        }

    }

}
