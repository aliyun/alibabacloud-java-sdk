// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimGlbModelListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimGlbModelListResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimGlbModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimGlbModelListResponseBody self = new GetBimGlbModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimGlbModelListResponseBody setDatas(GetBimGlbModelListResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimGlbModelListResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimGlbModelListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimGlbModelListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimGlbModelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimGlbModelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimGlbModelListResponseBodyDatasBounds extends TeaModel {
        @NameInMap("Max")
        public java.util.List<Long> max;

        @NameInMap("Min")
        public java.util.List<Long> min;

        public static GetBimGlbModelListResponseBodyDatasBounds build(java.util.Map<String, ?> map) throws Exception {
            GetBimGlbModelListResponseBodyDatasBounds self = new GetBimGlbModelListResponseBodyDatasBounds();
            return TeaModel.build(map, self);
        }

        public GetBimGlbModelListResponseBodyDatasBounds setMax(java.util.List<Long> max) {
            this.max = max;
            return this;
        }
        public java.util.List<Long> getMax() {
            return this.max;
        }

        public GetBimGlbModelListResponseBodyDatasBounds setMin(java.util.List<Long> min) {
            this.min = min;
            return this;
        }
        public java.util.List<Long> getMin() {
            return this.min;
        }

    }

    public static class GetBimGlbModelListResponseBodyDatasBuildingsFloors extends TeaModel {
        @NameInMap("Architecture")
        public String architecture;

        @NameInMap("FloorNo")
        public String floorNo;

        @NameInMap("FloorType")
        public String floorType;

        @NameInMap("Structure")
        public String structure;

        public static GetBimGlbModelListResponseBodyDatasBuildingsFloors build(java.util.Map<String, ?> map) throws Exception {
            GetBimGlbModelListResponseBodyDatasBuildingsFloors self = new GetBimGlbModelListResponseBodyDatasBuildingsFloors();
            return TeaModel.build(map, self);
        }

        public GetBimGlbModelListResponseBodyDatasBuildingsFloors setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetBimGlbModelListResponseBodyDatasBuildingsFloors setFloorNo(String floorNo) {
            this.floorNo = floorNo;
            return this;
        }
        public String getFloorNo() {
            return this.floorNo;
        }

        public GetBimGlbModelListResponseBodyDatasBuildingsFloors setFloorType(String floorType) {
            this.floorType = floorType;
            return this;
        }
        public String getFloorType() {
            return this.floorType;
        }

        public GetBimGlbModelListResponseBodyDatasBuildingsFloors setStructure(String structure) {
            this.structure = structure;
            return this;
        }
        public String getStructure() {
            return this.structure;
        }

    }

    public static class GetBimGlbModelListResponseBodyDatasBuildings extends TeaModel {
        @NameInMap("BuildingNo")
        public String buildingNo;

        @NameInMap("Floors")
        public java.util.List<GetBimGlbModelListResponseBodyDatasBuildingsFloors> floors;

        public static GetBimGlbModelListResponseBodyDatasBuildings build(java.util.Map<String, ?> map) throws Exception {
            GetBimGlbModelListResponseBodyDatasBuildings self = new GetBimGlbModelListResponseBodyDatasBuildings();
            return TeaModel.build(map, self);
        }

        public GetBimGlbModelListResponseBodyDatasBuildings setBuildingNo(String buildingNo) {
            this.buildingNo = buildingNo;
            return this;
        }
        public String getBuildingNo() {
            return this.buildingNo;
        }

        public GetBimGlbModelListResponseBodyDatasBuildings setFloors(java.util.List<GetBimGlbModelListResponseBodyDatasBuildingsFloors> floors) {
            this.floors = floors;
            return this;
        }
        public java.util.List<GetBimGlbModelListResponseBodyDatasBuildingsFloors> getFloors() {
            return this.floors;
        }

    }

    public static class GetBimGlbModelListResponseBodyDatasStsToken extends TeaModel {
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

        public static GetBimGlbModelListResponseBodyDatasStsToken build(java.util.Map<String, ?> map) throws Exception {
            GetBimGlbModelListResponseBodyDatasStsToken self = new GetBimGlbModelListResponseBodyDatasStsToken();
            return TeaModel.build(map, self);
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setExpiration(Long expiration) {
            this.expiration = expiration;
            return this;
        }
        public Long getExpiration() {
            return this.expiration;
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public GetBimGlbModelListResponseBodyDatasStsToken setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class GetBimGlbModelListResponseBodyDatas extends TeaModel {
        @NameInMap("Bounds")
        public GetBimGlbModelListResponseBodyDatasBounds bounds;

        @NameInMap("Buildings")
        public java.util.List<GetBimGlbModelListResponseBodyDatasBuildings> buildings;

        @NameInMap("Name")
        public String name;

        @NameInMap("StsToken")
        public GetBimGlbModelListResponseBodyDatasStsToken stsToken;

        public static GetBimGlbModelListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimGlbModelListResponseBodyDatas self = new GetBimGlbModelListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimGlbModelListResponseBodyDatas setBounds(GetBimGlbModelListResponseBodyDatasBounds bounds) {
            this.bounds = bounds;
            return this;
        }
        public GetBimGlbModelListResponseBodyDatasBounds getBounds() {
            return this.bounds;
        }

        public GetBimGlbModelListResponseBodyDatas setBuildings(java.util.List<GetBimGlbModelListResponseBodyDatasBuildings> buildings) {
            this.buildings = buildings;
            return this;
        }
        public java.util.List<GetBimGlbModelListResponseBodyDatasBuildings> getBuildings() {
            return this.buildings;
        }

        public GetBimGlbModelListResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimGlbModelListResponseBodyDatas setStsToken(GetBimGlbModelListResponseBodyDatasStsToken stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public GetBimGlbModelListResponseBodyDatasStsToken getStsToken() {
            return this.stsToken;
        }

    }

}
