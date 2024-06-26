// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAvatarResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAvatarResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAvatarResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvatarResponseBody self = new GetAvatarResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvatarResponseBody setData(GetAvatarResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAvatarResponseBodyData getData() {
        return this.data;
    }

    public GetAvatarResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvatarResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAvatarResponseBodyDataAvatar extends TeaModel {
        @NameInMap("AvatarDescription")
        public String avatarDescription;

        /**
         * <strong>example:</strong>
         * <p>Avatar-XXXX</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("AvatarName")
        public String avatarName;

        /**
         * <strong>example:</strong>
         * <p>2DAvatar</p>
         */
        @NameInMap("AvatarType")
        public String avatarType;

        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
         */
        @NameInMap("Portrait")
        public String portrait;

        /**
         * <strong>example:</strong>
         * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
         */
        @NameInMap("Thumbnail")
        public String thumbnail;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Transparent")
        public Boolean transparent;

        @NameInMap("Width")
        public Integer width;

        public static GetAvatarResponseBodyDataAvatar build(java.util.Map<String, ?> map) throws Exception {
            GetAvatarResponseBodyDataAvatar self = new GetAvatarResponseBodyDataAvatar();
            return TeaModel.build(map, self);
        }

        public GetAvatarResponseBodyDataAvatar setAvatarDescription(String avatarDescription) {
            this.avatarDescription = avatarDescription;
            return this;
        }
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        public GetAvatarResponseBodyDataAvatar setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public GetAvatarResponseBodyDataAvatar setAvatarName(String avatarName) {
            this.avatarName = avatarName;
            return this;
        }
        public String getAvatarName() {
            return this.avatarName;
        }

        public GetAvatarResponseBodyDataAvatar setAvatarType(String avatarType) {
            this.avatarType = avatarType;
            return this;
        }
        public String getAvatarType() {
            return this.avatarType;
        }

        public GetAvatarResponseBodyDataAvatar setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetAvatarResponseBodyDataAvatar setPortrait(String portrait) {
            this.portrait = portrait;
            return this;
        }
        public String getPortrait() {
            return this.portrait;
        }

        public GetAvatarResponseBodyDataAvatar setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetAvatarResponseBodyDataAvatar setTransparent(Boolean transparent) {
            this.transparent = transparent;
            return this;
        }
        public Boolean getTransparent() {
            return this.transparent;
        }

        public GetAvatarResponseBodyDataAvatar setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetAvatarResponseBodyData extends TeaModel {
        @NameInMap("Avatar")
        public GetAvatarResponseBodyDataAvatar avatar;

        public static GetAvatarResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAvatarResponseBodyData self = new GetAvatarResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAvatarResponseBodyData setAvatar(GetAvatarResponseBodyDataAvatar avatar) {
            this.avatar = avatar;
            return this;
        }
        public GetAvatarResponseBodyDataAvatar getAvatar() {
            return this.avatar;
        }

    }

}
