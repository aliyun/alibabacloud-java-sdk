// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TrimPolicy extends TeaModel {
    @NameInMap("DisableDeleteEmptyCell")
    public Boolean disableDeleteEmptyCell;

    @NameInMap("DisableDeleteRepeatedStyle")
    public Boolean disableDeleteRepeatedStyle;

    @NameInMap("DisableDeleteUnusedPicture")
    public Boolean disableDeleteUnusedPicture;

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
