// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoRequest extends TeaModel {
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The address of the media asset in the corresponding system. Before use, the media asset must be registered in the IMS content library and bound to an IMS mediaId.</p>
     * <ul>
     * <li>OSS address. Two formats are supported:</li>
     * </ul>
     * <p>http(s)://example-bucket.oss-ap-southeast-1.aliyuncs.com/example.mp4 or</p>
     * <p>oss://example-bucket/example.mp4. This format assumes the OSS region is the same as the service access region by default.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The IMS media asset ID. If this parameter is empty, InputURL is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media file address in the response:</p>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>Specifies whether to return detailed information for the corresponding media asset fields. The following fields are supported:
     * AiRoughData.StandardSmartTagJob: Specifies whether to return detailed tagging results if the media asset has been submitted for tag analysis.</p>
     * <ul>
     * <li>Default value: false. The task result is returned as a URL.</li>
     * <li>true: The task result is returned as text.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AiRoughData.StandardSmartTagJob&quot;: false}</p>
     */
    @NameInMap("ReturnDetailedInfo")
    public String returnDetailedInfo;

    public static GetMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaInfoRequest self = new GetMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetMediaInfoRequest setInputURL(String inputURL) {
        this.inputURL = inputURL;
        return this;
    }
    public String getInputURL() {
        return this.inputURL;
    }

    public GetMediaInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public GetMediaInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetMediaInfoRequest setReturnDetailedInfo(String returnDetailedInfo) {
        this.returnDetailedInfo = returnDetailedInfo;
        return this;
    }
    public String getReturnDetailedInfo() {
        return this.returnDetailedInfo;
    }

}
