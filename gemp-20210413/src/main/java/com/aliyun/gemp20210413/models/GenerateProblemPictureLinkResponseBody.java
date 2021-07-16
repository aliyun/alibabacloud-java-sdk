// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureLinkResponseBody extends TeaModel {
    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GenerateProblemPictureLinkResponseBodyData data;

    public static GenerateProblemPictureLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureLinkResponseBody self = new GenerateProblemPictureLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateProblemPictureLinkResponseBody setData(GenerateProblemPictureLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateProblemPictureLinkResponseBodyData getData() {
        return this.data;
    }

    public static class GenerateProblemPictureLinkResponseBodyDataLinks extends TeaModel {
        // oss key
        @NameInMap("key")
        public String key;

        // 图片链接
        @NameInMap("link")
        public String link;

        public static GenerateProblemPictureLinkResponseBodyDataLinks build(java.util.Map<String, ?> map) throws Exception {
            GenerateProblemPictureLinkResponseBodyDataLinks self = new GenerateProblemPictureLinkResponseBodyDataLinks();
            return TeaModel.build(map, self);
        }

        public GenerateProblemPictureLinkResponseBodyDataLinks setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GenerateProblemPictureLinkResponseBodyDataLinks setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

    }

    public static class GenerateProblemPictureLinkResponseBodyData extends TeaModel {
        // 图片链接列表
        @NameInMap("links")
        public java.util.List<GenerateProblemPictureLinkResponseBodyDataLinks> links;

        public static GenerateProblemPictureLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateProblemPictureLinkResponseBodyData self = new GenerateProblemPictureLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateProblemPictureLinkResponseBodyData setLinks(java.util.List<GenerateProblemPictureLinkResponseBodyDataLinks> links) {
            this.links = links;
            return this;
        }
        public java.util.List<GenerateProblemPictureLinkResponseBodyDataLinks> getLinks() {
            return this.links;
        }

    }

}
