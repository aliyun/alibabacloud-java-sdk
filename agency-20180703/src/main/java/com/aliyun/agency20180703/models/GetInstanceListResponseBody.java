// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public GetInstanceListResponseBodyDataList dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setDataList(GetInstanceListResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetInstanceListResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceListResponseBodyDataListData extends TeaModel {
        @NameInMap("AliyunPk")
        public String aliyunPk;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        public static GetInstanceListResponseBodyDataListData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyDataListData self = new GetInstanceListResponseBodyDataListData();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyDataListData setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public GetInstanceListResponseBodyDataListData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceListResponseBodyDataListData setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public GetInstanceListResponseBodyDataListData setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public GetInstanceListResponseBodyDataListData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceListResponseBodyDataListData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetInstanceListResponseBodyDataList extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetInstanceListResponseBodyDataListData> data;

        public static GetInstanceListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyDataList self = new GetInstanceListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyDataList setData(java.util.List<GetInstanceListResponseBodyDataListData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetInstanceListResponseBodyDataListData> getData() {
            return this.data;
        }

    }

}
