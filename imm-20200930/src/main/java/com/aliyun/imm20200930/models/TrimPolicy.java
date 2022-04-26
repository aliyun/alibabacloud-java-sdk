// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TrimPolicy extends TeaModel {
    // 禁止删除所有空单元格
    @NameInMap("DisableDeleteEmptyCell")
    public Boolean disableDeleteEmptyCell;

    // 禁止删除所有重复样式
    @NameInMap("DisableDeleteRepeatedStyle")
    public Boolean disableDeleteRepeatedStyle;

    // 禁止删除未使用的单元格图片
    @NameInMap("DisableDeleteUnusedPicture")
    public Boolean disableDeleteUnusedPicture;

    // 禁止删除没有使用的Shape
    @NameInMap("DisableDeleteUnusedShape")
    public Boolean disableDeleteUnusedShape;

    public static TrimPolicy build(java.util.Map<String, ?> map) throws Exception {
        TrimPolicy self = new TrimPolicy();
        return TeaModel.build(map, self);
    }

    public TrimPolicy setDisableDeleteEmptyCell(Boolean disableDeleteEmptyCell) {
        this.disableDeleteEmptyCell = disableDeleteEmptyCell;
        return this;
    }
    public Boolean getDisableDeleteEmptyCell() {
        return this.disableDeleteEmptyCell;
    }

    public TrimPolicy setDisableDeleteRepeatedStyle(Boolean disableDeleteRepeatedStyle) {
        this.disableDeleteRepeatedStyle = disableDeleteRepeatedStyle;
        return this;
    }
    public Boolean getDisableDeleteRepeatedStyle() {
        return this.disableDeleteRepeatedStyle;
    }

    public TrimPolicy setDisableDeleteUnusedPicture(Boolean disableDeleteUnusedPicture) {
        this.disableDeleteUnusedPicture = disableDeleteUnusedPicture;
        return this;
    }
    public Boolean getDisableDeleteUnusedPicture() {
        return this.disableDeleteUnusedPicture;
    }

    public TrimPolicy setDisableDeleteUnusedShape(Boolean disableDeleteUnusedShape) {
        this.disableDeleteUnusedShape = disableDeleteUnusedShape;
        return this;
    }
    public Boolean getDisableDeleteUnusedShape() {
        return this.disableDeleteUnusedShape;
    }

}
