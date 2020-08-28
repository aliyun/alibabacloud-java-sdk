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

    }

}
