// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetLakehouseValidResourceGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetLakehouseValidResourceGroupsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLakehouseValidResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLakehouseValidResourceGroupsResponseBody self = new GetLakehouseValidResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLakehouseValidResourceGroupsResponseBody setData(GetLakehouseValidResourceGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLakehouseValidResourceGroupsResponseBodyData getData() {
        return this.data;
    }

    public GetLakehouseValidResourceGroupsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetLakehouseValidResourceGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLakehouseValidResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLakehouseValidResourceGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo extends TeaModel {
        @NameInMap("Available")
        public Boolean available;

        @NameInMap("CuOptions")
        public java.util.List<Long> cuOptions;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        @NameInMap("MinComputeResource")
        public String minComputeResource;

        public static GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo self = new GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo();
            return TeaModel.build(map, self);
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setCuOptions(java.util.List<Long> cuOptions) {
            this.cuOptions = cuOptions;
            return this;
        }
        public java.util.List<Long> getCuOptions() {
            return this.cuOptions;
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

    }

    public static class GetLakehouseValidResourceGroupsResponseBodyData extends TeaModel {
        @NameInMap("LakehouseMinComputeResource")
        public Long lakehouseMinComputeResource;

        @NameInMap("ValidPoolsInfo")
        public java.util.List<GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo> validPoolsInfo;

        public static GetLakehouseValidResourceGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLakehouseValidResourceGroupsResponseBodyData self = new GetLakehouseValidResourceGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLakehouseValidResourceGroupsResponseBodyData setLakehouseMinComputeResource(Long lakehouseMinComputeResource) {
            this.lakehouseMinComputeResource = lakehouseMinComputeResource;
            return this;
        }
        public Long getLakehouseMinComputeResource() {
            return this.lakehouseMinComputeResource;
        }

        public GetLakehouseValidResourceGroupsResponseBodyData setValidPoolsInfo(java.util.List<GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo> validPoolsInfo) {
            this.validPoolsInfo = validPoolsInfo;
            return this;
        }
        public java.util.List<GetLakehouseValidResourceGroupsResponseBodyDataValidPoolsInfo> getValidPoolsInfo() {
            return this.validPoolsInfo;
        }

    }

}
