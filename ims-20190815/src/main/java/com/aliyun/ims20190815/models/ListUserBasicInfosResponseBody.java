// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserBasicInfos")
    public ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos;

    public static ListUserBasicInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosResponseBody self = new ListUserBasicInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserBasicInfosResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUserBasicInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserBasicInfosResponseBody setUserBasicInfos(ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos) {
        this.userBasicInfos = userBasicInfos;
        return this;
    }
    public ListUserBasicInfosResponseBodyUserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag self = new ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag> tag;

        public static ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags self = new ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags setTag(java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Tags")
        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags tags;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo self = new ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setTags(ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags tags) {
            this.tags = tags;
            return this;
        }
        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfoTags getTags() {
            return this.tags;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo;

        public static ListUserBasicInfosResponseBodyUserBasicInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfos self = new ListUserBasicInfosResponseBodyUserBasicInfos();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfos setUserBasicInfo(java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo) {
            this.userBasicInfo = userBasicInfo;
            return this;
        }
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

    }

}
