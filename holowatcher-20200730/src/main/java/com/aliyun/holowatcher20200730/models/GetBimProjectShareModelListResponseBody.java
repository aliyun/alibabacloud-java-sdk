// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectShareModelListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimProjectShareModelListResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimProjectShareModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectShareModelListResponseBody self = new GetBimProjectShareModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimProjectShareModelListResponseBody setDatas(GetBimProjectShareModelListResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimProjectShareModelListResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimProjectShareModelListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimProjectShareModelListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimProjectShareModelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimProjectShareModelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimProjectShareModelListResponseBodyDatasBounds extends TeaModel {
        @NameInMap("Max")
        public java.util.List<Long> max;

        @NameInMap("Min")
        public java.util.List<Long> min;

        public static GetBimProjectShareModelListResponseBodyDatasBounds build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectShareModelListResponseBodyDatasBounds self = new GetBimProjectShareModelListResponseBodyDatasBounds();
            return TeaModel.build(map, self);
        }

        public GetBimProjectShareModelListResponseBodyDatasBounds setMax(java.util.List<Long> max) {
            this.max = max;
            return this;
        }
        public java.util.List<Long> getMax() {
            return this.max;
        }

        public GetBimProjectShareModelListResponseBodyDatasBounds setMin(java.util.List<Long> min) {
            this.min = min;
            return this;
        }
        public java.util.List<Long> getMin() {
            return this.min;
        }

    }

    public static class GetBimProjectShareModelListResponseBodyDatasBuildingsFloors extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("FloorNo")
        public String floorNo;

        @NameInMap("FloorType")
        public String floorType;

        @NameInMap("Structure")
        public String structure;

        public static GetBimProjectShareModelListResponseBodyDatasBuildingsFloors build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectShareModelListResponseBodyDatasBuildingsFloors self = new GetBimProjectShareModelListResponseBodyDatasBuildingsFloors();
            return TeaModel.build(map, self);
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildingsFloors setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildingsFloors setFloorNo(String floorNo) {
            this.floorNo = floorNo;
            return this;
        }
        public String getFloorNo() {
            return this.floorNo;
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildingsFloors setFloorType(String floorType) {
            this.floorType = floorType;
            return this;
        }
        public String getFloorType() {
            return this.floorType;
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildingsFloors setStructure(String structure) {
            this.structure = structure;
            return this;
        }
        public String getStructure() {
            return this.structure;
        }

    }

    public static class GetBimProjectShareModelListResponseBodyDatasBuildings extends TeaModel {
        @NameInMap("BuildingNo")
        public String buildingNo;

        @NameInMap("Floors")
        public java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildingsFloors> floors;

        public static GetBimProjectShareModelListResponseBodyDatasBuildings build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectShareModelListResponseBodyDatasBuildings self = new GetBimProjectShareModelListResponseBodyDatasBuildings();
            return TeaModel.build(map, self);
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildings setBuildingNo(String buildingNo) {
            this.buildingNo = buildingNo;
            return this;
        }
        public String getBuildingNo() {
            return this.buildingNo;
        }

        public GetBimProjectShareModelListResponseBodyDatasBuildings setFloors(java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildingsFloors> floors) {
            this.floors = floors;
            return this;
        }
        public java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildingsFloors> getFloors() {
            return this.floors;
        }

    }

    public static class GetBimProjectShareModelListResponseBodyDatasStsToken extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Expiration")
        public Long expiration;

        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssRegion")
        public String ossRegion;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static GetBimProjectShareModelListResponseBodyDatasStsToken build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectShareModelListResponseBodyDatasStsToken self = new GetBimProjectShareModelListResponseBodyDatasStsToken();
            return TeaModel.build(map, self);
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetBimProjectShareModelListResponseBodyDatasStsToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class GetBimProjectShareModelListResponseBodyDatas extends TeaModel {
        @NameInMap("Bounds")
        public GetBimProjectShareModelListResponseBodyDatasBounds bounds;

        @NameInMap("Buildings")
        public java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildings> buildings;

        @NameInMap("Name")
        public String name;

        @NameInMap("StsToken")
        public GetBimProjectShareModelListResponseBodyDatasStsToken stsToken;

        public static GetBimProjectShareModelListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectShareModelListResponseBodyDatas self = new GetBimProjectShareModelListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimProjectShareModelListResponseBodyDatas setBounds(GetBimProjectShareModelListResponseBodyDatasBounds bounds) {
            this.bounds = bounds;
            return this;
        }
        public GetBimProjectShareModelListResponseBodyDatasBounds getBounds() {
            return this.bounds;
        }

        public GetBimProjectShareModelListResponseBodyDatas setBuildings(java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildings> buildings) {
            this.buildings = buildings;
            return this;
        }
        public java.util.List<GetBimProjectShareModelListResponseBodyDatasBuildings> getBuildings() {
            return this.buildings;
        }

        public GetBimProjectShareModelListResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimProjectShareModelListResponseBodyDatas setStsToken(GetBimProjectShareModelListResponseBodyDatasStsToken stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public GetBimProjectShareModelListResponseBodyDatasStsToken getStsToken() {
            return this.stsToken;
        }

    }

}
