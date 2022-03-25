// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimFragmentRequest extends TeaModel {
    // 楼栋号
    @NameInMap("BuildingNo")
    public String buildingNo;

    @NameInMap("Coordinates")
    public java.util.List<java.util.List<Float>> coordinates;

    // 标准图纸Id
    @NameInMap("DrawingId")
    public Long drawingId;

    @NameInMap("FloorInfo")
    public UpdateBimFragmentRequestFloorInfo floorInfo;

    // 归类id
    @NameInMap("Id")
    public Long id;

    // 选择方式
    @NameInMap("SelectionMode")
    public String selectionMode;

    // 子类型
    @NameInMap("SubType")
    public String subType;

    // 后缀
    @NameInMap("Suffix")
    public String suffix;

    @NameInMap("TaskId")
    public Long taskId;

    // 类型
    @NameInMap("Type")
    public String type;

    public static UpdateBimFragmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimFragmentRequest self = new UpdateBimFragmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimFragmentRequest setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
        return this;
    }
    public String getBuildingNo() {
        return this.buildingNo;
    }

    public UpdateBimFragmentRequest setCoordinates(java.util.List<java.util.List<Float>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
    public java.util.List<java.util.List<Float>> getCoordinates() {
        return this.coordinates;
    }

    public UpdateBimFragmentRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public UpdateBimFragmentRequest setFloorInfo(UpdateBimFragmentRequestFloorInfo floorInfo) {
        this.floorInfo = floorInfo;
        return this;
    }
    public UpdateBimFragmentRequestFloorInfo getFloorInfo() {
        return this.floorInfo;
    }

    public UpdateBimFragmentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateBimFragmentRequest setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }
    public String getSelectionMode() {
        return this.selectionMode;
    }

    public UpdateBimFragmentRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public UpdateBimFragmentRequest setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

    public UpdateBimFragmentRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimFragmentRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateBimFragmentRequestFloorInfo extends TeaModel {
        @NameInMap("FloorName")
        public String floorName;

        @NameInMap("FloorNum")
        public String floorNum;

        public static UpdateBimFragmentRequestFloorInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateBimFragmentRequestFloorInfo self = new UpdateBimFragmentRequestFloorInfo();
            return TeaModel.build(map, self);
        }

        public UpdateBimFragmentRequestFloorInfo setFloorName(String floorName) {
            this.floorName = floorName;
            return this;
        }
        public String getFloorName() {
            return this.floorName;
        }

        public UpdateBimFragmentRequestFloorInfo setFloorNum(String floorNum) {
            this.floorNum = floorNum;
            return this;
        }
        public String getFloorNum() {
            return this.floorNum;
        }

    }

}
