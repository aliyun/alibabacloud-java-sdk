// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureLinkResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GeneratePictureLinkResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
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
        /**
         * <p>oss key</p>
         * 
         * <strong>example:</strong>
         * <p>problem/38b2a36d-484d-4242-b9cf-d243e53a82c6</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>url</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://gam-objects-bucket.oss-cn-shanghai.aliyuncs.com/problem/38b2a36d-484d-4242-b9cf-d243e53a82c6?Expires=1625662477&OSSAccessKeyId=LTAI5tEoRVPw8GMy1iLRCno7&Signature=1NFnt%2BnudD%2F%2BHVc31b6v5%2FFxoqg%3D">http://gam-objects-bucket.oss-cn-shanghai.aliyuncs.com/problem/38b2a36d-484d-4242-b9cf-d243e53a82c6?Expires=1625662477&amp;OSSAccessKeyId=LTAI5tEoRVPw8GMy1iLRCno7&amp;Signature=1NFnt%2BnudD%2F%2BHVc31b6v5%2FFxoqg%3D</a></p>
         */
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
        /**
         * <p>array</p>
         */
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
