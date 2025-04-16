// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeImageRequest extends TeaModel {
    @NameInMap("imageUrls")
    public java.util.List<String> imageUrls;

    @NameInMap("responseFormatType")
    public String responseFormatType;

    @NameInMap("resultTypes")
    public java.util.List<String> resultTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    public static AnalyzeImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeImageRequest self = new AnalyzeImageRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeImageRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public AnalyzeImageRequest setResponseFormatType(String responseFormatType) {
        this.responseFormatType = responseFormatType;
        return this;
    }
    public String getResponseFormatType() {
        return this.responseFormatType;
    }

    public AnalyzeImageRequest setResultTypes(java.util.List<String> resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    public AnalyzeImageRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
