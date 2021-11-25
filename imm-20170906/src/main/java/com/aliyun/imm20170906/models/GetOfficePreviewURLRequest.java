// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficePreviewURLRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SrcType")
    public String srcType;

    @NameInMap("SrcUri")
    public String srcUri;

    @NameInMap("WatermarkFillStyle")
    public String watermarkFillStyle;

    @NameInMap("WatermarkFont")
    public String watermarkFont;

    @NameInMap("WatermarkHorizontal")
    public Integer watermarkHorizontal;

    @NameInMap("WatermarkRotate")
    public Float watermarkRotate;

    @NameInMap("WatermarkType")
    public Integer watermarkType;

    @NameInMap("WatermarkValue")
    public String watermarkValue;

    @NameInMap("WatermarkVertical")
    public Integer watermarkVertical;

    public static GetOfficePreviewURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOfficePreviewURLRequest self = new GetOfficePreviewURLRequest();
        return TeaModel.build(map, self);
    }

    public GetOfficePreviewURLRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetOfficePreviewURLRequest setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

    public GetOfficePreviewURLRequest setSrcUri(String srcUri) {
        this.srcUri = srcUri;
        return this;
    }
    public String getSrcUri() {
        return this.srcUri;
    }

    public GetOfficePreviewURLRequest setWatermarkFillStyle(String watermarkFillStyle) {
        this.watermarkFillStyle = watermarkFillStyle;
        return this;
    }
    public String getWatermarkFillStyle() {
        return this.watermarkFillStyle;
    }

    public GetOfficePreviewURLRequest setWatermarkFont(String watermarkFont) {
        this.watermarkFont = watermarkFont;
        return this;
    }
    public String getWatermarkFont() {
        return this.watermarkFont;
    }

    public GetOfficePreviewURLRequest setWatermarkHorizontal(Integer watermarkHorizontal) {
        this.watermarkHorizontal = watermarkHorizontal;
        return this;
    }
    public Integer getWatermarkHorizontal() {
        return this.watermarkHorizontal;
    }

    public GetOfficePreviewURLRequest setWatermarkRotate(Float watermarkRotate) {
        this.watermarkRotate = watermarkRotate;
        return this;
    }
    public Float getWatermarkRotate() {
        return this.watermarkRotate;
    }

    public GetOfficePreviewURLRequest setWatermarkType(Integer watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public Integer getWatermarkType() {
        return this.watermarkType;
    }

    public GetOfficePreviewURLRequest setWatermarkValue(String watermarkValue) {
        this.watermarkValue = watermarkValue;
        return this;
    }
    public String getWatermarkValue() {
        return this.watermarkValue;
    }

    public GetOfficePreviewURLRequest setWatermarkVertical(Integer watermarkVertical) {
        this.watermarkVertical = watermarkVertical;
        return this;
    }
    public Integer getWatermarkVertical() {
        return this.watermarkVertical;
    }

}
