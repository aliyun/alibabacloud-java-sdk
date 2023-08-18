// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAvatarsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAvatarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarsResponseBody self = new ListAvatarsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvatarsResponseBody setData(ListAvatarsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAvatarsResponseBodyData getData() {
        return this.data;
    }

    public ListAvatarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvatarsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvatarsResponseBodyDataAvatarList extends TeaModel {
        @NameInMap("AvatarDescription")
        public String avatarDescription;

        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("AvatarName")
        public String avatarName;

        @NameInMap("AvatarType")
        public String avatarType;

        @NameInMap("Portrait")
        public String portrait;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static ListAvatarsResponseBodyDataAvatarList build(java.util.Map<String, ?> map) throws Exception {
            ListAvatarsResponseBodyDataAvatarList self = new ListAvatarsResponseBodyDataAvatarList();
            return TeaModel.build(map, self);
        }

        public ListAvatarsResponseBodyDataAvatarList setAvatarDescription(String avatarDescription) {
            this.avatarDescription = avatarDescription;
            return this;
        }
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        public ListAvatarsResponseBodyDataAvatarList setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public ListAvatarsResponseBodyDataAvatarList setAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }
        public String getAvatarName() {
            return this.avatarName;
        }

        public ListAvatarsResponseBodyDataAvatarList setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public ListAvatarsResponseBodyDataAvatarList setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public ListAvatarsResponseBodyDataAvatarList setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

    public static class ListAvatarsResponseBodyData extends TeaModel {
        @NameInMap("AvatarList")
        public java.util.List<ListAvatarsResponseBodyDataAvatarList> avatarList;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAvatarsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvatarsResponseBodyData self = new ListAvatarsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvatarsResponseBodyData setAvatarList(java.util.List<ListAvatarsResponseBodyDataAvatarList> avatarList) {
            this.avatarList = avatarList;
            return this;
        }
        public java.util.List<ListAvatarsResponseBodyDataAvatarList> getAvatarList() {
            return this.avatarList;
        }

        public ListAvatarsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
