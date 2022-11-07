// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RegisterLocationResponseBody extends TeaModel {
    @NameInMap("Data")
    public RegisterLocationResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

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
