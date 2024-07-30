// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ParseFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D6C24839-91A7-41DA-B31F-98F08EF80CC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ParseFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceResponseBody self = new ParseFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseFaceResponseBody setData(ParseFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ParseFaceResponseBodyData getData() {
        return this.data;
    }

    public ParseFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ParseFaceResponseBodyDataElements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/fivesensesegmenter/prod/560FA2E7-FDC6-59A5-ABDD-D62A05146734/skin/_18dd_20211231-040658.png?Expires=1640925418&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=2g0M88wZl%2Bn4t4gzQX%2BTIskpWB">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/fivesensesegmenter/prod/560FA2E7-FDC6-59A5-ABDD-D62A05146734/skin/_18dd_20211231-040658.png?Expires=1640925418&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=2g0M88wZl%2Bn4t4gzQX%2BTIskpWB</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <strong>example:</strong>
         * <p>skin</p>
         */
        @NameInMap("Name")
        public String name;

        public static ParseFaceResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            ParseFaceResponseBodyDataElements self = new ParseFaceResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public ParseFaceResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ParseFaceResponseBodyDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ParseFaceResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<ParseFaceResponseBodyDataElements> elements;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ParseFace/ParseFace1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageseg/ParseFace/ParseFace1.jpg</a></p>
         */
        @NameInMap("OriginImageURL")
        public String originImageURL;

        public static ParseFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ParseFaceResponseBodyData self = new ParseFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ParseFaceResponseBodyData setElements(java.util.List<ParseFaceResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ParseFaceResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public ParseFaceResponseBodyData setOriginImageURL(String originImageURL) {
            this.originImageURL = originImageURL;
            return this;
        }
        public String getOriginImageURL() {
            return this.originImageURL;
        }

    }

}
