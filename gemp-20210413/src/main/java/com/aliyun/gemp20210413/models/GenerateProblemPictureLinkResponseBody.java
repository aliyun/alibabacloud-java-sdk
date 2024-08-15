// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GenerateProblemPictureLinkResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GenerateProblemPictureLinkResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-88067879ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GenerateProblemPictureLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateProblemPictureLinkResponseBody self = new GenerateProblemPictureLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateProblemPictureLinkResponseBody setData(GenerateProblemPictureLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateProblemPictureLinkResponseBodyData getData() {
        return this.data;
    }

    public GenerateProblemPictureLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateProblemPictureLinkResponseBodyDataLinks extends TeaModel {
        /**
         * <p>oss key</p>
         * 
         * <strong>example:</strong>
         * <p>problem/xxxxxxxxxx-484d-4242-b9cf-xxxxxxxxxx</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxx-xxxx-bucket.oss-cn-xxxx.aliyuncs.com/pxxxx/38xxxxd-4789-4242-b9cfxxxxxxxxc6?Expires=1xxxxxxxxxx7&OSSAccessKeyId=xxxxxxxxxxxxxx7&Signature=xxxxxxxxxxxxxxxxxxxxxx">http://xxxx-xxxx-bucket.oss-cn-xxxx.aliyuncs.com/pxxxx/38xxxxd-4789-4242-b9cfxxxxxxxxc6?Expires=1xxxxxxxxxx7&amp;OSSAccessKeyId=xxxxxxxxxxxxxx7&amp;Signature=xxxxxxxxxxxxxxxxxxxxxx</a></p>
         */
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
