// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DescribeChatMessageRequest extends TeaModel {
    /**
     * <p>The question statement submitted by the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How to set reasonable annual plan goals?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The Alibaba Cloud region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>df94eec5-3d95-435c-87d4-43e8bb3f9519</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Skill")
    public String skill;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static DescribeChatMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChatMessageRequest self = new DescribeChatMessageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChatMessageRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeChatMessageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeChatMessageRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public DescribeChatMessageRequest setSkill(String skill) {
        this.skill = skill;
        return this;
    }
    public String getSkill() {
        return this.skill;
    }

    public DescribeChatMessageRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
