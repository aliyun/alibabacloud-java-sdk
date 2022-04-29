// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetFormatFilePathResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Result")
    public GetFormatFilePathResponseBodyResult result;

    public static GetFormatFilePathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFormatFilePathResponseBody self = new GetFormatFilePathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFormatFilePathResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFormatFilePathResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFormatFilePathResponseBody setResult(GetFormatFilePathResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFormatFilePathResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetFormatFilePathResponseBodyResult extends TeaModel {
        @NameInMap("Path")
        public String path;

        public static GetFormatFilePathResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFormatFilePathResponseBodyResult self = new GetFormatFilePathResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFormatFilePathResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
