// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllEdgeDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetAllEdgeDevicesResponseBodyData> data;

    public static GetAllEdgeDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllEdgeDevicesResponseBody self = new GetAllEdgeDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllEdgeDevicesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllEdgeDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllEdgeDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllEdgeDevicesResponseBody setData(java.util.List<GetAllEdgeDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAllEdgeDevicesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO extends TeaModel {
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

        public static GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO build(java.util.Map<String, ?> map) throws Exception {
            GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO self = new GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO();
            return TeaModel.build(map, self);
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setDetailJson(String detailJson) {
            this.detailJson = detailJson;
            return this;
        }
        public String getDetailJson() {
            return this.detailJson;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setEdgeDeviceId(String edgeDeviceId) {
            this.edgeDeviceId = edgeDeviceId;
            return this;
        }
        public String getEdgeDeviceId() {
            return this.edgeDeviceId;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetAllEdgeDevicesResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DetailJson")
        public String detailJson;

        @NameInMap("IsvId")
        public String isvId;

        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("IsDelete")
        public String isDelete;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IconPath")
        public String iconPath;

        @NameInMap("XcsVideoDeviceVO")
        public java.util.List<GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO> xcsVideoDeviceVO;

        public static GetAllEdgeDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAllEdgeDevicesResponseBodyData self = new GetAllEdgeDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAllEdgeDevicesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAllEdgeDevicesResponseBodyData setDetailJson(String detailJson) {
            this.detailJson = detailJson;
            return this;
        }
        public String getDetailJson() {
            return this.detailJson;
        }

        public GetAllEdgeDevicesResponseBodyData setIsvId(String isvId) {
            this.isvId = isvId;
            return this;
        }
        public String getIsvId() {
            return this.isvId;
        }

        public GetAllEdgeDevicesResponseBodyData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetAllEdgeDevicesResponseBodyData setIsDelete(String isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public String getIsDelete() {
            return this.isDelete;
        }

        public GetAllEdgeDevicesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAllEdgeDevicesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAllEdgeDevicesResponseBodyData setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
        public String getIconPath() {
            return this.iconPath;
        }

        public GetAllEdgeDevicesResponseBodyData setXcsVideoDeviceVO(java.util.List<GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO> xcsVideoDeviceVO) {
            this.xcsVideoDeviceVO = xcsVideoDeviceVO;
            return this;
        }
        public java.util.List<GetAllEdgeDevicesResponseBodyDataXcsVideoDeviceVO> getXcsVideoDeviceVO() {
            return this.xcsVideoDeviceVO;
        }

    }

}
