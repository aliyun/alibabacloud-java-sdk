// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The end time of the editing task. Unit: seconds.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The valid values range from 0 to the value indicated by the total length of the episode.</p>
     * </li>
     * <li><p>By default, this parameter is set to the value that indicates the total length of the episode. The editing period cannot exceed the total length of the episode.</p>
     * </li>
     * <li><p>If you want to edit a VOD file from the 2nd second to the 5th second, set the StartTime parameter to 2.0 and the EndTime parameter to 5.0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EndTime")
    public Float endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the episode to be edited.</p>
     * <blockquote>
     * <p> You can obtain the ID from the response parameter ShowId of the <a href="https://help.aliyun.com/document_detail/2848051.html">AddShowIntoShowList</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>42200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>The start time of the editing task. Unit: seconds.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The valid values range from 0 to the value indicated by the total length of the episode. By default, the editing task starts from the beginning of the episode. Default value: 0.0.</p>
     * </li>
     * <li><p>If you want to edit a VOD file from the 2nd second to the 5th second, set the StartTime parameter to 2.0 and the EndTime parameter to 5.0.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("StartTime")
    public Float startTime;

    /**
     * <p>The storage information of the episode. The following fields are included:</p>
     * <ul>
     * <li><strong>StorageLocation</strong>: the storage location of ApsaraVideo VOD.</li>
     * <li><strong>FileName</strong>: the custom file name.</li>
     * </ul>
     * <blockquote>
     * <p> Editing outputs must be stored in the VOD bucket within the same account that is used to access both ApsaraVideo VOD and ApsaraVideo Live. For more information about how to obtain the storage location, see <a href="https://help.aliyun.com/document_detail/86097.html">Manage VOD resources</a>.</p>
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
