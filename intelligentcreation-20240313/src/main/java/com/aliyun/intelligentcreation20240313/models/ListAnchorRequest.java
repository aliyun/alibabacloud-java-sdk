// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAnchorRequest extends TeaModel {
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

    public ListAnchorRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

}
