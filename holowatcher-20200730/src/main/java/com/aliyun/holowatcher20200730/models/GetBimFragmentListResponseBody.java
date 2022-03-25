// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimFragmentListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimFragmentListResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimFragmentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimFragmentListResponseBody self = new GetBimFragmentListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimFragmentListResponseBody setDatas(java.util.List<GetBimFragmentListResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimFragmentListResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimFragmentListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimFragmentListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimFragmentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimFragmentListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimFragmentListResponseBodyDatasFloorInfo extends TeaModel {
        @NameInMap("FloorName")
        public String floorName;

        @NameInMap("FloorNum")
        public String floorNum;

        public static GetBimFragmentListResponseBodyDatasFloorInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBimFragmentListResponseBodyDatasFloorInfo self = new GetBimFragmentListResponseBodyDatasFloorInfo();
            return TeaModel.build(map, self);
        }

        public GetBimFragmentListResponseBodyDatasFloorInfo setFloorName(String floorName) {
            this.floorName = floorName;
            return this;
        }
        public String getFloorName() {
            return this.floorName;
        }

        public GetBimFragmentListResponseBodyDatasFloorInfo setFloorNum(String floorNum) {
            this.floorNum = floorNum;
            return this;
        }
        public String getFloorNum() {
            return this.floorNum;
        }

    }

    public static class GetBimFragmentListResponseBodyDatas extends TeaModel {
        @NameInMap("BuildingNo")
        public String buildingNo;

        @NameInMap("Coordinates")
        public java.util.List<java.util.List<Double>> coordinates;

        @NameInMap("DrawingId")
        public Long drawingId;

        @NameInMap("FloorInfo")
        public java.util.List<GetBimFragmentListResponseBodyDatasFloorInfo> floorInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SelectionMode")
        public String selectionMode;

        @NameInMap("SubType")
        public String subType;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("Type")
        public String type;

        public static GetBimFragmentListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimFragmentListResponseBodyDatas self = new GetBimFragmentListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimFragmentListResponseBodyDatas setBuildingNo(String buildingNo) {
            this.buildingNo = buildingNo;
            return this;
        }
        public String getBuildingNo() {
            return this.buildingNo;
        }

        public GetBimFragmentListResponseBodyDatas setCoordinates(java.util.List<java.util.List<Double>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }
        public java.util.List<java.util.List<Double>> getCoordinates() {
            return this.coordinates;
        }

        public GetBimFragmentListResponseBodyDatas setDrawingId(Long drawingId) {
            this.drawingId = drawingId;
            return this;
        }
        public Long getDrawingId() {
            return this.drawingId;
        }

        public GetBimFragmentListResponseBodyDatas setFloorInfo(java.util.List<GetBimFragmentListResponseBodyDatasFloorInfo> floorInfo) {
            this.floorInfo = floorInfo;
            return this;
        }
        public java.util.List<GetBimFragmentListResponseBodyDatasFloorInfo> getFloorInfo() {
            return this.floorInfo;
        }

        public GetBimFragmentListResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimFragmentListResponseBodyDatas setSelectionMode(String selectionMode) {
            this.selectionMode = selectionMode;
            return this;
        }
        public String getSelectionMode() {
            return this.selectionMode;
        }

        public GetBimFragmentListResponseBodyDatas setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetBimFragmentListResponseBodyDatas setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetBimFragmentListResponseBodyDatas setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public GetBimFragmentListResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
