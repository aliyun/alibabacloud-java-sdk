// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsResponseBody extends TeaModel {
    @NameInMap("MediaTagList")
    public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> mediaTagList;

    /**
     * <strong>example:</strong>
     * <p>B45F83B7-7F87-4792-BFE9-63CD2137CAF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAllPublicMediaTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsResponseBody self = new ListAllPublicMediaTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsResponseBody setMediaTagList(java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> mediaTagList) {
        this.mediaTagList = mediaTagList;
        return this;
    }
    public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> getMediaTagList() {
        return this.mediaTagList;
    }

    public ListAllPublicMediaTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAllPublicMediaTagsResponseBodyMediaTagListOptions extends TeaModel {
        @NameInMap("OptionChineseName")
        public String optionChineseName;

        /**
         * <strong>example:</strong>
         * <p>Angry</p>
         */
        @NameInMap("OptionEnglishName")
        public String optionEnglishName;

        /**
         * <strong>example:</strong>
         * <p>Angry</p>
         */
        @NameInMap("OptionId")
        public String optionId;

        public static ListAllPublicMediaTagsResponseBodyMediaTagListOptions build(java.util.Map<String, ?> map) throws Exception {
            ListAllPublicMediaTagsResponseBodyMediaTagListOptions self = new ListAllPublicMediaTagsResponseBodyMediaTagListOptions();
            return TeaModel.build(map, self);
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagListOptions setOptionChineseName(String optionChineseName) {
            this.optionChineseName = optionChineseName;
            return this;
        }
        public String getOptionChineseName() {
            return this.optionChineseName;
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagListOptions setOptionEnglishName(String optionEnglishName) {
            this.optionEnglishName = optionEnglishName;
            return this;
        }
        public String getOptionEnglishName() {
            return this.optionEnglishName;
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagListOptions setOptionId(String optionId) {
            this.optionId = optionId;
            return this;
        }
        public String getOptionId() {
            return this.optionId;
        }

    }

    public static class ListAllPublicMediaTagsResponseBodyMediaTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sticker-gif</p>
         */
        @NameInMap("MediaTagId")
        public String mediaTagId;

        /**
         * <strong>example:</strong>
         * <p>Gif</p>
         */
        @NameInMap("MediaTagNameChinese")
        public String mediaTagNameChinese;

        @NameInMap("MediaTagNameEnglish")
        public String mediaTagNameEnglish;

        @NameInMap("Options")
        public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagListOptions> options;

        public static ListAllPublicMediaTagsResponseBodyMediaTagList build(java.util.Map<String, ?> map) throws Exception {
            ListAllPublicMediaTagsResponseBodyMediaTagList self = new ListAllPublicMediaTagsResponseBodyMediaTagList();
            return TeaModel.build(map, self);
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagList setMediaTagId(String mediaTagId) {
            this.mediaTagId = mediaTagId;
            return this;
        }
        public String getMediaTagId() {
            return this.mediaTagId;
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagList setMediaTagNameChinese(String mediaTagNameChinese) {
            this.mediaTagNameChinese = mediaTagNameChinese;
            return this;
        }
        public String getMediaTagNameChinese() {
            return this.mediaTagNameChinese;
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagList setMediaTagNameEnglish(String mediaTagNameEnglish) {
            this.mediaTagNameEnglish = mediaTagNameEnglish;
            return this;
        }
        public String getMediaTagNameEnglish() {
            return this.mediaTagNameEnglish;
        }

        public ListAllPublicMediaTagsResponseBodyMediaTagList setOptions(java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagListOptions> options) {
            this.options = options;
            return this;
        }
        public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagListOptions> getOptions() {
            return this.options;
        }

    }

}
