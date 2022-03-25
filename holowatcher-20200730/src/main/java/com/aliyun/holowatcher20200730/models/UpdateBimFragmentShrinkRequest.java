// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimFragmentShrinkRequest extends TeaModel {
    // 楼栋号
    @NameInMap("BuildingNo")
    public String buildingNo;

    @NameInMap("Coordinates")
    public String coordinatesShrink;

    // 标准图纸Id
    @NameInMap("DrawingId")
    public Long drawingId;

    @NameInMap("FloorInfo")
    public String floorInfoShrink;

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

    public static UpdateBimFragmentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimFragmentShrinkRequest self = new UpdateBimFragmentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBimFragmentShrinkRequest setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
        return this;
    }
    public String getBuildingNo() {
        return this.buildingNo;
    }

    public UpdateBimFragmentShrinkRequest setCoordinatesShrink(String coordinatesShrink) {
        this.coordinatesShrink = coordinatesShrink;
        return this;
    }
    public String getCoordinatesShrink() {
        return this.coordinatesShrink;
    }

    public UpdateBimFragmentShrinkRequest setDrawingId(Long drawingId) {
        this.drawingId = drawingId;
        return this;
    }
    public Long getDrawingId() {
        return this.drawingId;
    }

    public UpdateBimFragmentShrinkRequest setFloorInfoShrink(String floorInfoShrink) {
        this.floorInfoShrink = floorInfoShrink;
        return this;
    }
    public String getFloorInfoShrink() {
        return this.floorInfoShrink;
    }

    public UpdateBimFragmentShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateBimFragmentShrinkRequest setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }
    public String getSelectionMode() {
        return this.selectionMode;
    }

    public UpdateBimFragmentShrinkRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public UpdateBimFragmentShrinkRequest setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

    public UpdateBimFragmentShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public UpdateBimFragmentShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
