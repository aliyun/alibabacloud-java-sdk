// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoRequest extends TeaModel {
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The URL of the media asset to be queried in the corresponding system. The media asset must be registered in the IMS content library and attached to an IMS media ID before use.</p>
     * <ul>
     * <li>OSS addresses. Two formats are supported:</li>
     * </ul>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 or</p>
     * <p>oss://example-bucket/example.mp4. In this format, the default OSS region is the same as the service registration area.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The IMS media asset ID. If this parameter is empty, InputURL must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media asset file URL in the response. Valid values:</p>
     * <ul>
     * <li><p>oss: Returns the OSS URL. This is the default value.</p>
     * </li>
     * <li><p>cdn: Returns the CDN URL. A CDN URL is returned only when the media asset is imported from ApsaraVideo VOD and an accelerated domain name is configured in ApsaraVideo VOD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>Specifies whether to return detailed information for the corresponding media asset fields. Supported fields:</p>
     * <p>AiRoughData.StandardSmartTagJob: Specifies whether to return detailed tagging results if the media asset has been submitted for tag analysis. Valid values:</p>
     * <ul>
     * <li><p>false: The task result is returned as a URL. This is the default value.</p>
     * </li>
     * <li><p>true: The task result is returned as text.</p>
     * </li>
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
