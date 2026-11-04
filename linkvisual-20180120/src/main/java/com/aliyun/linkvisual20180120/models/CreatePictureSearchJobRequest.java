// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchJobRequest extends TeaModel {
    /**
     * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3e429560124b44b685095df81a27****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The threshold for human body search. Valid values: 0 to 1.</p>
     * <p>To ensure the accuracy of search results, set this parameter to a value greater than or equal to 0.8. If this parameter is not specified, the value of the Threshold parameter is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("BodyThreshold")
    public Float bodyThreshold;

    /**
     * <p>The end time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614327915000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The search type. Valid values:</p>
     * <ul>
     * <li>1: face</li>
     * <li>0: human body</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PictureSearchType")
    public Integer pictureSearchType;

    /**
     * <p>The URL of the image to be searched.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxx.xxx/1.jpg">http://xxx.xxx/1.jpg</a></p>
     */
    @NameInMap("SearchPicUrl")
    public String searchPicUrl;

    /**
     * <p>The start time of the search range. The time is a 13-digit timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614227915000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The threshold for face search. Valid values: 0 to 1.</p>
     * <p>To ensure the accuracy of search results, set this parameter to a value between 0.3 and 0.6.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static CreatePictureSearchJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchJobRequest self = new CreatePictureSearchJobRequest();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchJobRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public CreatePictureSearchJobRequest setBodyThreshold(Float bodyThreshold) {
        this.bodyThreshold = bodyThreshold;
        return this;
    }
    public Float getBodyThreshold() {
        return this.bodyThreshold;
    }

    public CreatePictureSearchJobRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreatePictureSearchJobRequest setPictureSearchType(Integer pictureSearchType) {
        this.pictureSearchType = pictureSearchType;
        return this;
    }
    public Integer getPictureSearchType() {
        return this.pictureSearchType;
    }

    public CreatePictureSearchJobRequest setSearchPicUrl(String searchPicUrl) {
        this.searchPicUrl = searchPicUrl;
        return this;
    }
    public String getSearchPicUrl() {
        return this.searchPicUrl;
    }

    public CreatePictureSearchJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreatePictureSearchJobRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
