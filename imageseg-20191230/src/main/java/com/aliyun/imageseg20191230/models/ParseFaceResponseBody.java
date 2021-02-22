// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ParseFaceResponseBodyData data;

    public static ParseFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceResponseBody self = new ParseFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ParseFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseFaceResponseBody setData(ParseFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ParseFaceResponseBodyData getData() {
        return this.data;
    }

    public static class ParseFaceResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

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
