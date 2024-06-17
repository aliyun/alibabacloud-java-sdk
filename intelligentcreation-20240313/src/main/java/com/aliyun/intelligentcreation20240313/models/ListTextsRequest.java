// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListTextsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("generationSource")
    public String generationSource;

    /**
     * <strong>example:</strong>
     * <p>Common</p>
     */
    @NameInMap("industry")
    public String industry;

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
     * <p>PUBLISH</p>
     */
    @NameInMap("publishStatus")
    public String publishStatus;

    /**
     * <strong>example:</strong>
     * <p>WECHAT_MOMENT</p>
     */
    @NameInMap("textStyleType")
    public String textStyleType;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("textTheme")
    public String textTheme;

    public static ListTextsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTextsRequest self = new ListTextsRequest();
        return TeaModel.build(map, self);
    }

    public ListTextsRequest setGenerationSource(String generationSource) {
        this.generationSource = generationSource;
        return this;
    }
    public String getGenerationSource() {
        return this.generationSource;
    }

    public ListTextsRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ListTextsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTextsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTextsRequest setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public ListTextsRequest setTextStyleType(String textStyleType) {
        this.textStyleType = textStyleType;
        return this;
    }
    public String getTextStyleType() {
        return this.textStyleType;
    }

    public ListTextsRequest setTextTheme(String textTheme) {
        this.textTheme = textTheme;
        return this;
    }
    public String getTextTheme() {
        return this.textTheme;
    }

}
