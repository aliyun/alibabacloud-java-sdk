// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentRequest extends TeaModel {
    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request.</p>
     * <blockquote>
     * <p>The client generates this value. Make sure that the value is unique among different requests. The value can be up to 64 ASCII characters in length.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8751ad99-2ddb-4aac-ad44-84b21102****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The properties of the episode in the production studio. This parameter is a JSON string. The parameter names are in upper camel case. The properties are described as follows:</p>
     * <ul>
     * <li><p><strong>CallbackUrl</strong>: The webhook address.</p>
     * </li>
     * <li><p><strong>SideOutputUrl</strong>: The custom bypass output URL.</p>
     * </li>
     * <li><p><strong>RepeatNum</strong>: The number of times to loop the episode. A value of 0 means the episode does not loop. A value of -1 means the episode loops indefinitely.</p>
     * </li>
     * <li><p><strong>StartTime</strong>: The start time in UTC. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z.</p>
     * </li>
     * <li><p><strong>DomainName</strong>: The domain name.</p>
     * </li>
     * <li><p><strong>Items</strong></p>
     * <p>: The list of items in the episode.</p>
     * <ul>
     * <li><p><strong>ItemName</strong>: The item name.</p>
     * </li>
     * <li><p><strong>VodUrl</strong>: The URL of the video-on-demand (VOD) file. This parameter is required only when the resource is a video file that has not been imported to the Material Library. The MP4, FLV, and TS formats are supported.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CallbackUrl&quot;:&quot;<a href="http://example.aliyundoc.com/callBackLive%22,%22SideOutputUrl%22:%22rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****%22,%22DomainName%22:%22developer.aliyundoc.com">http://example.aliyundoc.com/callBackLive&quot;,&quot;SideOutputUrl&quot;:&quot;rtmp://guide.aliyundoc.com/caster/4a82a3d1b7f0462ea37348366201****?auth_key=1608953344-0-0-ac8c628078541d7055a170ec59a5****&quot;,&quot;DomainName&quot;:&quot;developer.aliyundoc.com</a> &quot;,&quot;StartTime&quot;:&quot;2018-03-26T16:00:00Z&quot;,&quot;RepeatNum&quot;:-1,&quot;Items&quot;:[{&quot;ItemName&quot;:&quot;program1&quot;,&quot;VodUrl&quot;:&quot;<a href="http://learn.aliyundoc.com%22%7D,%7B%22ItemName%22:%22program2%22,%22VodUrl%22:%22http://demo.aliyundoc.com%22%7D%5D%7D">http://learn.aliyundoc.com&quot;},{&quot;ItemName&quot;:&quot;program2&quot;,&quot;VodUrl&quot;:&quot;http://demo.aliyundoc.com&quot;}]}</a></p>
     */
    @NameInMap("Content")
    public String content;

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
