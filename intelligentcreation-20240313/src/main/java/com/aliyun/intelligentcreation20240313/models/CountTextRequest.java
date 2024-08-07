// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CountTextRequest extends TeaModel {
    /**
     * <p>API</p>
     * 
     * <strong>example:</strong>
     * <p>PLATFORM</p>
     */
    @NameInMap("generationSource")
    public String generationSource;

    /**
     * <strong>example:</strong>
     * <p>Garment</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("publishStatus")
    public String publishStatus;

    /**
     * <strong>example:</strong>
     * <p>RED_BOOK</p>
     */
    @NameInMap("style")
    public String style;

    public static CountTextRequest build(java.util.Map<String, ?> map) throws Exception {
        CountTextRequest self = new CountTextRequest();
        return TeaModel.build(map, self);
    }

    public CountTextRequest setGenerationSource(String generationSource) {
        this.generationSource = generationSource;
        return this;
    }
    public String getGenerationSource() {
        return this.generationSource;
    }

    public CountTextRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public CountTextRequest setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public CountTextRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

}
