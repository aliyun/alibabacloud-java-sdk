// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 公共素材库标签列表
    @NameInMap("MediaTagList")
    public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> mediaTagList;

    public static ListAllPublicMediaTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsResponseBody self = new ListAllPublicMediaTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllPublicMediaTagsResponseBody setMediaTagList(java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> mediaTagList) {
        this.mediaTagList = mediaTagList;
        return this;
    }
    public java.util.List<ListAllPublicMediaTagsResponseBodyMediaTagList> getMediaTagList() {
        return this.mediaTagList;
    }

    public static class ListAllPublicMediaTagsResponseBodyMediaTagList extends TeaModel {
        // 素材标签id
        @NameInMap("MediaTagId")
        public String mediaTagId;

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

    }

}
