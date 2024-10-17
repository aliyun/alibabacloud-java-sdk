// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetUrlUploadInfosRequest extends TeaModel {
    /**
     * <p>The IDs of the upload jobs. You can specify one or more job IDs. You can obtain the job IDs from the response parameter JobId of the <a href="https://help.aliyun.com/document_detail/86311.html">UploadMediaByURL</a> operation.</p>
     * <ul>
     * <li>You can specify a maximum of 10 job IDs.</li>
     * <li>Separate the job IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p> You must specify either JobIds or UploadURLs. If you specify both parameters, only the value of JobIds takes effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>df2ac80b481346daa1db6a7c40edc7f8</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    /**
     * <p>The upload URLs of the source files. You can specify a maximum of 10 URLs. Separate the URLs with commas (,).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The URLs must be encoded.</p>
     * </li>
     * <li><p>If a media file is uploaded multiple times, we recommend that you specify the URL of the media file only once in this parameter.</p>
     * </li>
     * <li><p>You must specify either JobIds or UploadURLs. If you specify both parameters, only the value of JobIds takes effect.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://media.w3.org/2010/05/sintel/trailer.mp4">https://media.w3.org/2010/05/sintel/trailer.mp4</a></p>
     */
    @NameInMap("UploadURLs")
    public String uploadURLs;

    public static GetUrlUploadInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrlUploadInfosRequest self = new GetUrlUploadInfosRequest();
        return TeaModel.build(map, self);
    }

    public GetUrlUploadInfosRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public GetUrlUploadInfosRequest setUploadURLs(String uploadURLs) {
        this.uploadURLs = uploadURLs;
        return this;
    }
    public String getUploadURLs() {
        return this.uploadURLs;
    }

}
