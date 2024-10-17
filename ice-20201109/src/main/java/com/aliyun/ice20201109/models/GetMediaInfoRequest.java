// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaInfoRequest extends TeaModel {
    /**
     * <p>The input URL of the media asset in another service. The URL must be registered in the IMS content library and bound to the ID of the media asset in IMS.</p>
     * <ul>
     * <li>For a media asset from Object Storage Service (OSS), the URL may have one of the following formats:</li>
     * </ul>
     * <p>http(s)://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 or</p>
     * <p>oss://example-bucket/example.mp4. The second format indicates that the region in which the OSS bucket of the media asset resides is the same as the region in which OSS is activated.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4</a></p>
     */
    @NameInMap("InputURL")
    public String inputURL;

    /**
     * <p>The ID of the media asset in IMS. If this parameter is left empty, the InputURL parameter must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the URL of the media asset to return in the response. Valid values:</p>
     * <ul>
     * <li>oss (default): an OSS URL.</li>
     * <li>cdn: a CDN URL. A CDN URL is returned only if the media asset is imported from ApsaraVideo VOD and the relevant domain name is an accelerated domain name in ApsaraVideo VOD.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn</p>
     */
    @NameInMap("OutputType")
    public String outputType;

    /**
     * <p>Specifies whether to return detailed information for specific media asset attributes. Supported attributes: AiRoughData.StandardSmartTagJob, which specifies whether to return detailed tag information if a tagging job has been submitted for the media asset. Valid values for the attribute:</p>
     * <ul>
     * <li>false (default): The job result is returned as a URL.</li>
     * <li>true: The job result is returned as text.</li>
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
