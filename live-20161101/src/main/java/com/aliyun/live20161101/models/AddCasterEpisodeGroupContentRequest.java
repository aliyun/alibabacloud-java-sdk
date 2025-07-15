// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8751ad99-2ddb-4aac-ad44-84b21102****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The information about the episode list. The value is a JSON string. Use upper camel case for fields of the string. This parameter contains the following fields:</p>
     * <ul>
     * <li><p><strong>CallbackUrl</strong>: the callback URL.</p>
     * </li>
     * <li><p><strong>SideOutputUrl</strong>: the custom standby URL.</p>
     * </li>
     * <li><p><strong>RepeatNum</strong>: the number of times the episode list repeats after the first playback is complete. A value of 0 indicates that the episode list is played only once. A value of -1 indicates that the episode list is played in loop mode.</p>
     * </li>
     * <li><p><strong>DomainName</strong>: the domain name.</p>
     * </li>
     * <li><p><strong>StartTime</strong>: the time when the episode list starts to play. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * </li>
     * <li><p><strong>Items</strong>: the information about the episode list. It is an array of ItemName and VodUrl.</p>
     * <ul>
     * <li><strong>ItemName</strong>: the name of the episode.</li>
     * <li><strong>VodUrl</strong>: the URL of the VOD file. This field takes effect only when the video resource is a video file that is not from the media library. The video file must be in the MP4, FLV, or TS format.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CallbackUrl</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static AddCasterEpisodeGroupContentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentRequest self = new AddCasterEpisodeGroupContentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCasterEpisodeGroupContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddCasterEpisodeGroupContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterEpisodeGroupContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
