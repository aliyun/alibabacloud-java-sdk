// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureLinkResponseBody extends TeaModel {
    @NameInMap("data")
    public GeneratePictureLinkResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GeneratePictureLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureLinkResponseBody self = new GeneratePictureLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneratePictureLinkResponseBody setData(GeneratePictureLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneratePictureLinkResponseBodyData getData() {
        return this.data;
    }

    public GeneratePictureLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GeneratePictureLinkResponseBodyDataLinks extends TeaModel {
        // oss key
        @NameInMap("key")
        public String key;

        // url
        @NameInMap("link")
        public String link;

        public static GeneratePictureLinkResponseBodyDataLinks build(java.util.Map<String, ?> map) throws Exception {
            GeneratePictureLinkResponseBodyDataLinks self = new GeneratePictureLinkResponseBodyDataLinks();
            return TeaModel.build(map, self);
        }

        public GeneratePictureLinkResponseBodyDataLinks setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GeneratePictureLinkResponseBodyDataLinks setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

    }

    public static class GeneratePictureLinkResponseBodyData extends TeaModel {
        // array
        @NameInMap("links")
        public java.util.List<GeneratePictureLinkResponseBodyDataLinks> links;

        public static GeneratePictureLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneratePictureLinkResponseBodyData self = new GeneratePictureLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneratePictureLinkResponseBodyData setLinks(java.util.List<GeneratePictureLinkResponseBodyDataLinks> links) {
            this.links = links;
            return this;
        }
        public java.util.List<GeneratePictureLinkResponseBodyDataLinks> getLinks() {
            return this.links;
        }

    }

}
