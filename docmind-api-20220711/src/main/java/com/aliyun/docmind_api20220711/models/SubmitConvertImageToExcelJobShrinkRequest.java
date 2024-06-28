// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToExcelJobShrinkRequest extends TeaModel {
    @NameInMap("ForceMergeExcel")
    public Boolean forceMergeExcel;

    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ImageNameExtension")
    public String imageNameExtension;

    @NameInMap("ImageNames")
    public String imageNamesShrink;

    @NameInMap("ImageUrls")
    public String imageUrlsShrink;

    public static SubmitConvertImageToExcelJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToExcelJobShrinkRequest self = new SubmitConvertImageToExcelJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToExcelJobShrinkRequest setForceMergeExcel(Boolean forceMergeExcel) {
        this.forceMergeExcel = forceMergeExcel;
        return this;
    }
    public Boolean getForceMergeExcel() {
        return this.forceMergeExcel;
    }

    public SubmitConvertImageToExcelJobShrinkRequest setImageNameExtension(String imageNameExtension) {
        this.imageNameExtension = imageNameExtension;
        return this;
    }
    public String getImageNameExtension() {
        return this.imageNameExtension;
    }

    public SubmitConvertImageToExcelJobShrinkRequest setImageNamesShrink(String imageNamesShrink) {
        this.imageNamesShrink = imageNamesShrink;
        return this;
    }
    public String getImageNamesShrink() {
        return this.imageNamesShrink;
    }

    public SubmitConvertImageToExcelJobShrinkRequest setImageUrlsShrink(String imageUrlsShrink) {
        this.imageUrlsShrink = imageUrlsShrink;
        return this;
    }
    public String getImageUrlsShrink() {
        return this.imageUrlsShrink;
    }

}
