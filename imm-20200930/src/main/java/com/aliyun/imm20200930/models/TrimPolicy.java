// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TrimPolicy extends TeaModel {
    /**
     * <p>Specifies whether to prevent all empty cells from being deleted. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableDeleteEmptyCell")
    public Boolean disableDeleteEmptyCell;

    /**
     * <p>Specifies whether to prevent all duplicate styles from being deleted. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableDeleteRepeatedStyle")
    public Boolean disableDeleteRepeatedStyle;

    /**
     * <p>Specifies whether to prevent unused cell images from being deleted. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableDeleteUnusedPicture")
    public Boolean disableDeleteUnusedPicture;

    /**
     * <p>Specifies whether to prevent unused shapes from being deleted. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
