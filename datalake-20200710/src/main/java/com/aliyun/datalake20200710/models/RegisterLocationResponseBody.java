// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RegisterLocationResponseBody extends TeaModel {
    @NameInMap("Data")
    public RegisterLocationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>3C2678BA-3451-14C3-90E2-D4EF5B4E7A84</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RegisterLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterLocationResponseBody self = new RegisterLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterLocationResponseBody setData(RegisterLocationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RegisterLocationResponseBodyData getData() {
        return this.data;
    }

    public RegisterLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RegisterLocationResponseBodyData extends TeaModel {
        /**
         * <p>Location ID</p>
         * 
         * <strong>example:</strong>
         * <p>LOC-AB8FBC17F95A4AF5</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        @NameInMap("StorageCollectTaskOperationResultList")
        public java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList;

        public static RegisterLocationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RegisterLocationResponseBodyData self = new RegisterLocationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RegisterLocationResponseBodyData setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public RegisterLocationResponseBodyData setStorageCollectTaskOperationResultList(java.util.List<StorageCollectTaskOperationResult> storageCollectTaskOperationResultList) {
            this.storageCollectTaskOperationResultList = storageCollectTaskOperationResultList;
            return this;
        }
        public java.util.List<StorageCollectTaskOperationResult> getStorageCollectTaskOperationResultList() {
            return this.storageCollectTaskOperationResultList;
        }

    }

}
