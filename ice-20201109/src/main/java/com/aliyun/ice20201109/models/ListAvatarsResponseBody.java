// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAvatarsResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListAvatarsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The description of the digital human.</p>
         */
        @NameInMap("AvatarDescription")
        public String avatarDescription;

        /**
         * <p>The ID of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p>Avatar-XXX</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        /**
         * <p>The name of the digital human.</p>
         */
        @NameInMap("AvatarName")
        public String avatarName;

        /**
         * <p>The type of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p>2DAvatar</p>
         */
        @NameInMap("AvatarType")
        public String avatarType;

        /**
         * <p>The media asset ID of the portrait image.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        @NameInMap("Portrait")
        public String portrait;

        /**
         * <p>The thumbnail URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <p>Indicates whether the digital human image supports the alpha channels.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Transparent")
        public Boolean transparent;

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

        public ListAvatarsResponseBodyDataAvatarList setTransparent(Boolean transparent) {
            this.transparent = transparent;
            return this;
        }
        public Boolean getTransparent() {
            return this.transparent;
        }

    }

    public static class ListAvatarsResponseBodyData extends TeaModel {
        /**
         * <p>The queried digital humans.</p>
         */
        @NameInMap("AvatarList")
        public java.util.List<ListAvatarsResponseBodyDataAvatarList> avatarList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
