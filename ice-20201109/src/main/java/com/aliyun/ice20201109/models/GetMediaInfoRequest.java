// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoRequest extends TeaModel {
    /**
     * <p>The validity period of the signed URL, in seconds.</p>
     */
    @NameInMap("AuthTimeout")
    public Long authTimeout;

    /**
     * <p>The address of the media asset to query. You must first register the media asset in the IMS media library and bind it to a <code>mediaId</code>.</p>
     * <ul>
     * <li>Object Storage Service (OSS) URL. Two formats are supported:</li>
     * </ul>
     * <p><code>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</code></p>
     * <p><code>oss://example-bucket/example.mp4</code>. When you use this format, the OSS region defaults to the service endpoint region.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset in Intelligent Media Services (IMS). If you omit this parameter, you must specify <code>InputURL</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of URL to return for the media asset file.</p>
     * <ul>
     * <li><p><code>oss</code>: Returns the OSS URL. This is the default value.</p>
     * </li>
     * <li><p><code>cdn</code>: Returns the Content Delivery Network (CDN) URL. A CDN URL is returned only if the media asset was imported from Video on Demand (VOD) and has a CDN domain name configured in VOD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>Whether to return detailed information for specific media asset fields. The only supported field is <code>AiRoughData.StandardSmartTagJob</code>, which specifies how the result of a tag analysis task is returned.</p>
     * <ul>
     * <li><p><code>false</code>: The task result is returned as a URL. This is the default value.</p>
     * </li>
     * <li><p><code>true</code>: The task result is returned as a string.</p>
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
