// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllVideoDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetAllVideoDevicesResponseBodyData> data;

    public static GetAllVideoDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllVideoDevicesResponseBody self = new GetAllVideoDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllVideoDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllVideoDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllVideoDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllVideoDevicesResponseBody setData(java.util.List<GetAllVideoDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAllVideoDevicesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAllVideoDevicesResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DetailJson")
        public String detailJson;

        @NameInMap("EdgeDeviceId")
        public String edgeDeviceId;

        @NameInMap("IsvId")
        public String isvId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static GetAllVideoDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAllVideoDevicesResponseBodyData self = new GetAllVideoDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAllVideoDevicesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAllVideoDevicesResponseBodyData setDetailJson(String detailJson) {
            this.detailJson = detailJson;
            return this;
        }
        public String getDetailJson() {
            return this.detailJson;
        }

        public GetAllVideoDevicesResponseBodyData setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public GetAllVideoDevicesResponseBodyData setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetAllVideoDevicesResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetAllVideoDevicesResponseBodyData setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public GetAllVideoDevicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAllVideoDevicesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
