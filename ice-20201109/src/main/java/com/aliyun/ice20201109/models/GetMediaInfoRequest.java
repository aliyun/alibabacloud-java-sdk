// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("InputURL")
    public String inputURL;

    @NameInMap("OutputType")
    public String outputType;

    public static GetMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoRequest self = new GetMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public GetMediaInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

}
