// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studios</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The end time of the video clip. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>The valid range of the clip time is 0 to the total duration of the show.</li>
     * <li>The default value is the end time of the video-on-demand file. The value cannot exceed the total duration of the show.</li>
     * <li>For example, to clip a video-on-demand file from the 2nd second to the 5th second, set StartTime to 2.0 and EndTime to 5.0.</li>
     * <li>You must specify at least one of StartTime and EndTime.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EndTime")
    public Float endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the show to be clipped. The referenced show must be of the video-on-demand material type (ResourceInfo.ResourceType=vod with a valid resourceId).</p>
     * <blockquote>
     * <p>Obtain the ShowId value from the response parameters of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>42200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>The start time of the video clip. Unit: seconds.</p>
     * <blockquote>
     * <ul>
     * <li>The valid range of the clip time is 0 to the total duration of the show. - By default, the clip starts from the beginning of the video-on-demand file. Value: 0.0.</li>
     * <li>For example, to clip a video-on-demand file from the 2nd second to the 5th second, set StartTime to 2.0 and EndTime to 5.0.</li>
     * <li>You must specify at least one of StartTime and EndTime.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("StartTime")
    public Float startTime;

    /**
     * <p>The storage information. This parameter is required. Description:</p>
     * <ul>
     * <li><strong>StorageLocation</strong>: the video-on-demand storage address of the user.</li>
     * <li><strong>FileName</strong>: the custom file name.</li>
     * </ul>
     * <blockquote>
     * <p>The video clip storage address must be a video-on-demand storage address under the same account. To obtain the video-on-demand storage address, see <a href="https://help.aliyun.com/document_detail/86097.html">Storage management</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;StorageLocation&quot;:&quot;<em><strong>bucket</strong></em>&quot;, &quot;FileName&quot;:&quot;EditFile****.mp4&quot; }</p>
     */
    @NameInMap("StorageInfo")
    public String storageInfo;

    /**
     * <p>The user information.</p>
     * 
     * <strong>example:</strong>
     * <p>900a2b2r8-13c2-****-88f2-75e4a07c1ed9</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static EditShowAndReplaceRequest build(java.util.Map<String, ?> map) throws Exception {
        EditShowAndReplaceRequest self = new EditShowAndReplaceRequest();
        return TeaModel.build(map, self);
    }

    public EditShowAndReplaceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public EditShowAndReplaceRequest setEndTime(Float endTime) {
        this.endTime = endTime;
        return this;
    }
    public Float getEndTime() {
        return this.endTime;
    }

    public EditShowAndReplaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EditShowAndReplaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EditShowAndReplaceRequest setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public EditShowAndReplaceRequest setStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }
    public Float getStartTime() {
        return this.startTime;
    }

    public EditShowAndReplaceRequest setStorageInfo(String storageInfo) {
        this.storageInfo = storageInfo;
        return this;
    }
    public String getStorageInfo() {
        return this.storageInfo;
    }

    public EditShowAndReplaceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
