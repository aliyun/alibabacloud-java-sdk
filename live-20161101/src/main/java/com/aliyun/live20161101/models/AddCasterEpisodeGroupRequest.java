// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RepeatNum")
    public Integer repeatNum;

    @NameInMap("SideOutputUrl")
    public String sideOutputUrl;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("Item")
    public java.util.List<AddCasterEpisodeGroupRequestItem> item;

    public static AddCasterEpisodeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupRequest self = new AddCasterEpisodeGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterEpisodeGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCasterEpisodeGroupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddCasterEpisodeGroupRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public AddCasterEpisodeGroupRequest setRepeatNum(Integer repeatNum) {
        this.repeatNum = repeatNum;
        return this;
    }
    public Integer getRepeatNum() {
        return this.repeatNum;
    }

    public AddCasterEpisodeGroupRequest setSideOutputUrl(String sideOutputUrl) {
        this.sideOutputUrl = sideOutputUrl;
        return this;
    }
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    public AddCasterEpisodeGroupRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public AddCasterEpisodeGroupRequest setItem(java.util.List<AddCasterEpisodeGroupRequestItem> item) {
        this.item = item;
        return this;
    }
    public java.util.List<AddCasterEpisodeGroupRequestItem> getItem() {
        return this.item;
    }

    public static class AddCasterEpisodeGroupRequestItem extends TeaModel {
        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("VodUrl")
        public String vodUrl;

        public static AddCasterEpisodeGroupRequestItem build(java.util.Map<String, ?> map) throws Exception {
            AddCasterEpisodeGroupRequestItem self = new AddCasterEpisodeGroupRequestItem();
            return TeaModel.build(map, self);
        }

        public AddCasterEpisodeGroupRequestItem setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public AddCasterEpisodeGroupRequestItem setVodUrl(String vodUrl) {
            this.vodUrl = vodUrl;
            return this;
        }
        public String getVodUrl() {
            return this.vodUrl;
        }

    }

}
