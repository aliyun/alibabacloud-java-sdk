// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ParseFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ParseFaceResponseData data;

    public static ParseFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ParseFaceResponse self = new ParseFaceResponse();
        return TeaModel.build(map, self);
    }

    public ParseFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ParseFaceResponse setData(ParseFaceResponseData data) {
        this.data = data;
        return this;
    }
    public ParseFaceResponseData getData() {
        return this.data;
    }

    public static class ParseFaceResponseDataElements extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static ParseFaceResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            ParseFaceResponseDataElements self = new ParseFaceResponseDataElements();
            return TeaModel.build(map, self);
        }

        public ParseFaceResponseDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ParseFaceResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class ParseFaceResponseData extends TeaModel {
        @NameInMap("OriginImageURL")
        @Validation(required = true)
        public String originImageURL;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<ParseFaceResponseDataElements> elements;

        public static ParseFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ParseFaceResponseData self = new ParseFaceResponseData();
            return TeaModel.build(map, self);
        }

        public ParseFaceResponseData setOriginImageURL(String originImageURL) {
            this.originImageURL = originImageURL;
            return this;
        }
        public String getOriginImageURL() {
            return this.originImageURL;
        }

        public ParseFaceResponseData setElements(java.util.List<ParseFaceResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ParseFaceResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
