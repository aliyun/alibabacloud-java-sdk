// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAnchorRequest extends TeaModel {
    @NameInMap("anchorCategory")
    public String anchorCategory;

    @NameInMap("anchorId")
    public String anchorId;

    /**
     * <strong>example:</strong>
     * <p>PUBLIC_MODEL</p>
     */
    @NameInMap("anchorType")
    public String anchorType;

    /**
     * <strong>example:</strong>
     * <p>9:16</p>
     */
    @NameInMap("coverRate")
    public String coverRate;

    /**
     * <strong>example:</strong>
     * <p>staticTransparency</p>
     */
    @NameInMap("digitalHumanType")
    public String digitalHumanType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resSpecType")
    public String resSpecType;

    /**
     * <strong>example:</strong>
     * <p>offlineSynthesis</p>
     */
    @NameInMap("useScene")
    public String useScene;

    public static ListAnchorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnchorRequest self = new ListAnchorRequest();
        return TeaModel.build(map, self);
    }

    public ListAnchorRequest setAnchorCategory(String anchorCategory) {
        this.anchorCategory = anchorCategory;
        return this;
    }
    public String getAnchorCategory() {
        return this.anchorCategory;
    }

    public ListAnchorRequest setAnchorId(String anchorId) {
        this.anchorId = anchorId;
        return this;
    }
    public String getAnchorId() {
        return this.anchorId;
    }

    public ListAnchorRequest setAnchorType(String anchorType) {
        this.anchorType = anchorType;
        return this;
    }
    public String getAnchorType() {
        return this.anchorType;
    }

    public ListAnchorRequest setCoverRate(String coverRate) {
        this.coverRate = coverRate;
        return this;
    }
    public String getCoverRate() {
        return this.coverRate;
    }

    public ListAnchorRequest setDigitalHumanType(String digitalHumanType) {
        this.digitalHumanType = digitalHumanType;
        return this;
    }
    public String getDigitalHumanType() {
        return this.digitalHumanType;
    }

    public ListAnchorRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAnchorRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnchorRequest setResSpecType(String resSpecType) {
        this.resSpecType = resSpecType;
        return this;
    }
    public String getResSpecType() {
        return this.resSpecType;
    }

    public ListAnchorRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

}
